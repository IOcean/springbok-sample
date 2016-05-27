'use strict';

var gulp = require('gulp'),
    argv = require('yargs').argv,
    del = require('del'),
    vinylPaths = require('vinyl-paths'),
    gutil = require('gulp-util'),
    plumber = require('gulp-plumber'),
    babel = require('gulp-babel'),
    browserSync = require('browser-sync').create(),
    watch = require('gulp-watch'),
    htmlmin = require('gulp-htmlmin'),
    sass = require('gulp-sass'),
    cssnano = require('gulp-cssnano'),
    uglify = require('gulp-uglify'),
    concat = require('gulp-concat'),
    imagemin = require('gulp-imagemin'),
    jsonminify = require('gulp-jsonminify'),
    gulpif = require('gulp-if'),
    eslint = require('gulp-eslint'),
    Server = require('karma').Server,
    CONFIG = require('./gulpfile-conf');
    
gulp.task('clean', function() {
    return gulp.src(CONFIG.paths.build)
        .pipe(vinylPaths(del));
});

gulp.task('html', function() {
    html();
});

gulp.task('i18n', function() {
    i18n();
});

gulp.task('stylesheets', function() {
    stylesheets();
});

gulp.task('images', function() {
    images();
});

gulp.task('javascript', function() {
    javascript();
});

gulp.task('fonts', function() {
    return gulp.src(CONFIG.libs.all.fonts)
        .pipe(gulp.dest(CONFIG.paths.build + 'assets/fonts/'))
});

gulp.task('libraries', function() {
    var libsCss = CONFIG.libs.all.css.concat(getEnvironmentName() !== 'dev' ? CONFIG.libs.prod.css : CONFIG.libs.dev.css);
    var libsJs = CONFIG.libs.all.js.concat(getEnvironmentName() !== 'dev' ? CONFIG.libs.prod.js : CONFIG.libs.dev.js);
    
    gulp.src(libsCss)
        .pipe(plumber())
        .pipe(concat('vendor.min.css'))
        .pipe(gulp.dest(CONFIG.paths.build + 'assets/stylesheets/'))
        .pipe(browserSync.stream());

    return gulp.src(libsJs)
        .pipe(plumber())
        .pipe(concat('vendor.min.js'))
        .pipe(gulp.dest(CONFIG.paths.build + 'assets/javascript/'))
        .pipe(browserSync.stream());
});

gulp.task('watch', function() {
    watch(CONFIG.paths.app + '**/*.html', html);
    watch(CONFIG.paths.i18n + '*.json', i18n);
    watch(CONFIG.paths.assets + 'stylesheets/**/*.scss', stylesheets);
    watch(CONFIG.paths.assets + 'images/**/*', images);
    watch([CONFIG.paths.app + '**/*.js', CONFIG.paths.conf + getEnvironmentName() + '.js ?'], javascript);
});

gulp.task('webserver', function() {
    return browserSync.init(CONFIG.server);
});

gulp.task('lint', function(done) {
    return gulp.src([CONFIG.paths.app + '**/*.js'])
        .pipe(eslint(CONFIG.eslint))
        .pipe(eslint.format())
        .pipe(eslint.failAfterError());
});

gulp.task('unit', function(done) {
    new Server({
            configFile: __dirname + '/karma.conf.js',
            singleRun: true
        }, done).start();
});

gulp.task('default', ['serve']);

gulp.task('process', ['clean', 'html', 'i18n', 'stylesheets', 'images', 'javascript', 'fonts']);

gulp.task('build', ['process', 'libraries']);

gulp.task('serve', ['build', 'webserver', 'watch']);

gulp.task('test', ['lint', 'unit']);

function handleError(err) {
    gutil.log(err.toString());
    this.emit('end');
}

function getEnvironmentName() {
    var environmentName = 'dev';
    
    if (argv.rec) {
        environmentName = 'rec';
    } else if (argv.prod) {
        environmentName = 'prod';
    }
    
    return environmentName;
}

function html() {
    return gulp.src(CONFIG.paths.app + '**/*.html', {base: CONFIG.paths.app})
        .pipe(plumber())
        .pipe(gulpif(getEnvironmentName() !== 'dev', htmlmin({collapseWhitespace: true})))
        .pipe(gulp.dest(CONFIG.paths.build))
        .pipe(browserSync.stream());
}

function i18n() {
    return gulp.src(CONFIG.paths.i18n + '*.json')
        .pipe(plumber())
        .pipe(gulpif(getEnvironmentName() !== 'dev', jsonminify()))
        .pipe(gulp.dest(CONFIG.paths.build + 'i18n/'))
        .pipe(browserSync.stream());
}

function stylesheets() {
    return gulp.src(CONFIG.paths.assets + 'stylesheets/**/*.scss')
        .pipe(plumber())
        .pipe(sass().on('error', sass.logError))
        .pipe(concat('main.min.css'))   
        .pipe(gulpif(getEnvironmentName() !== 'dev', cssnano()))
        .pipe(gulp.dest(CONFIG.paths.build + 'assets/stylesheets/'))
        .pipe(browserSync.stream());
}

function images() {
    var imagineMinConfig = {
            optimizationLevel: 3,
            progressive: true
        };
    
    return gulp.src(CONFIG.paths.assets + 'images/**/*')
        .pipe(plumber())
        .pipe(gulpif(getEnvironmentName() !== 'dev', imagemin(imagineMinConfig)))
        .pipe(gulp.dest(CONFIG.paths.build + 'assets/images/'))
        .pipe(browserSync.stream());
}

function javascript() {
    return gulp.src([CONFIG.paths.app + '**/*.js', CONFIG.paths.conf + getEnvironmentName() + '.js'])
        .pipe(plumber())
        .pipe(babel())
        .pipe(concat('main.min.js'))
        .pipe(gulpif(getEnvironmentName() !== 'dev', uglify()))
        .pipe(gulp.dest(CONFIG.paths.build + 'assets/javascript/'))
        .pipe(browserSync.stream());
}