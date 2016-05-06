'use strict';

const paths = {
    app: './app/',
    conf: './conf/',
    assets: './assets/', 
    i18n: './i18n/',
    libs: './jspm_packages/',
    build: './dist/'
};

const server = {
    server: paths.build,
    port: 9090
};

const eslint = {
    envs: ['browser', 'es6']
};

const libs = {
    all: {
        css: [
            paths.libs + 'github/necolas/normalize-css@3.0.3/normalize.css',
        ],
        js: [
        ],
        fonts: [
            paths.libs + 'github/FortAwesome/Font-Awesome@4.5.0/fonts/*',
            paths.libs + 'github/twbs/bootstrap@3.3.6/fonts/*'
        ]
    },
    dev: {
        css: [
            paths.libs + 'github/twbs/bootstrap@3.3.6/css/bootstrap.css',
            paths.libs + 'github/FortAwesome/Font-Awesome@4.5.0/css/font-awesome.css',
            paths.libs + 'iocean-private/springbok/ace-admin@master/assets/css/ace.css'
        ],
        js: [
            paths.libs + 'npm/jquery@2.2.3/dist/jquery.js',
            paths.libs + 'github/jashkenas/underscore@1.8.3/underscore.js',
            paths.libs + 'github/epeli/underscore.string@3.3.4/dist/underscore.string.js',
            paths.libs + 'github/angular/bower-angular@1.5.0/angular.js',
            paths.libs + 'github/angular/bower-angular-i18n@1.5.0/angular-locale_fr-fr.js',
            paths.libs + 'github/angular/bower-angular-route@1.5.0/angular-route.js',
            paths.libs + 'github/angular/bower-angular-animate@1.5.0/angular-animate.js',
            paths.libs + 'github/angular/bower-angular-touch@1.5.0/angular-touch.js',
            paths.libs + 'github/angular/bower-angular-sanitize@1.5.0/angular-sanitize.js',
            paths.libs + 'github/angular/bower-angular-cookies@1.5.0/angular-cookies.js',
            paths.libs + 'github/angular-translate/bower-angular-translate@2.9.2/angular-translate.js',
            paths.libs + 'github/angular-translate/bower-angular-translate-loader-static-files@2.9.2/angular-translate-loader-static-files.js',
            paths.libs + 'github/angular-translate/bower-angular-translate-handler-log@2.9.2/angular-translate-handler-log.js',
            paths.libs + 'iocean/springbok-spa-core@master/dist/springbok-spa-core.js',
            paths.libs + 'iocean/springbok-spa-security@master/dist/springbok-spa-security.js',
            paths.libs + 'github/angular-ui/bootstrap-bower@1.3.1/ui-bootstrap.js',
            paths.libs + 'github/angular-ui/bootstrap-bower@1.3.1/ui-bootstrap-tpls.js',
            paths.libs + 'iocean-private/springbok/ace-admin@master/assets/js/ace.js'
        ]
    },
    prod: {
        css: [
            paths.libs + 'github/twbs/bootstrap@3.3.6/css/bootstrap.min.css',
            paths.libs + 'github/FortAwesome/Font-Awesome@4.5.0/css/font-awesome.min.css',
            paths.libs + 'iocean-private/springbok/ace-admin@master/dist/css/ace.min.css'
        ],
        js: [
            paths.libs + 'npm/jquery@2.2.3/dist/jquery.min.js',
            paths.libs + 'github/jashkenas/underscore@1.8.3/underscore-min.js',
            paths.libs + 'github/epeli/underscore.string@3.3.4/dist/underscore.string.min.js',
            paths.libs + 'github/angular/bower-angular@1.5.0/angular.min.js',
            paths.libs + 'github/angular/bower-angular-i18n@1.5.0/angular-locale_fr-fr.js',
            paths.libs + 'github/angular/bower-angular-route@1.5.0/angular-route.min.js',
            paths.libs + 'github/angular/bower-angular-animate@1.5.0/angular-animate.min.js',
            paths.libs + 'github/angular/bower-angular-touch@1.5.0/angular-touch.min.js',
            paths.libs + 'github/angular/bower-angular-sanitize@1.5.0/angular-sanitize.min.js',
            paths.libs + 'github/angular/bower-angular-cookies@1.5.0/angular-cookies.min.js',
            paths.libs + 'github/angular-translate/bower-angular-translate@2.9.2/angular-translate.min.js',
            paths.libs + 'github/angular-translate/bower-angular-translate-loader-static-files@2.9.2/angular-translate-loader-static-files.min.js',
            paths.libs + 'github/angular-translate/bower-angular-translate-handler-log@2.9.2/angular-translate-handler-log.js',
            paths.libs + 'iocean/springbok-spa-core@master/dist/springbok-spa-core.min.js',
            paths.libs + 'iocean/springbok-spa-security@master/dist/springbok-spa-security.min.js',
            paths.libs + 'github/angular-ui/bootstrap-bower@1.3.1/ui-bootstrap.min.js',
            paths.libs + 'github/angular-ui/bootstrap-bower@1.3.1/ui-bootstrap-tpls.min.js',
            paths.libs + 'iocean-private/springbok/ace-admin@master/dist/js/ace.min.js'
        ]
    }
}

module.exports = {
    paths : paths,
    server : server,
    eslint : eslint,
    libs: libs
};