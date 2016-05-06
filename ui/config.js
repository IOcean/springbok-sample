System.config({
  baseURL: "/",
  defaultJSExtensions: true,
  transpiler: "babel",
  babelOptions: {
    "optional": [
      "runtime",
      "optimisation.modules.system"
    ]
  },
  paths: {
    "github:*": "jspm_packages/github/*",
    "npm:*": "jspm_packages/npm/*",
    "iocean:*": "jspm_packages/iocean/*",
    "iocean-private:*": "jspm_packages/iocean-private/*"
  },

  map: {
    "FortAwesome/Font-Awesome": "github:FortAwesome/Font-Awesome@4.5.0",
    "PascalPrecht/bower-angular-translate": "github:angular-translate/bower-angular-translate@2.9.2",
    "PascalPrecht/bower-angular-translate-handler-log": "github:angular-translate/bower-angular-translate-handler-log@2.9.2",
    "ace-admin": "iocean-private:springbok/ace-admin@master",
    "angular": "github:angular/bower-angular@1.5.0",
    "angular-bootstrap": "github:angular-ui/bootstrap-bower@1.3.1",
    "angular-route": "github:angular/bower-angular-route@1.5.0",
    "angular-touch": "github:angular/bower-angular-touch@1.5.0",
    "angular-translate/bower-angular-translate-loader-static-files": "github:angular-translate/bower-angular-translate-loader-static-files@2.9.2",
    "angular/bower-angular": "github:angular/bower-angular@1.5.0",
    "angular/bower-angular-animate": "github:angular/bower-angular-animate@1.5.0",
    "angular/bower-angular-cookies": "github:angular/bower-angular-cookies@1.5.0",
    "angular/bower-angular-i18n": "github:angular/bower-angular-i18n@1.5.0",
    "angular/bower-angular-mocks": "github:angular/bower-angular-mocks@1.5.0",
    "angular/bower-angular-sanitize": "github:angular/bower-angular-sanitize@1.5.0",
    "babel": "npm:babel-core@5.8.35",
    "babel-runtime": "npm:babel-runtime@5.8.35",
    "core-js": "npm:core-js@1.2.6",
    "epeli/underscore.string": "github:epeli/underscore.string@3.3.4",
    "jashkenas/underscore": "github:jashkenas/underscore@1.8.3",
    "jquery": "npm:jquery@2.2.3",
    "necolas/normalize.css": "github:necolas/normalize.css@3.0.3",
    "springbok-spa-core": "iocean:springbok-spa-core@master",
    "springbok-spa-security": "iocean:springbok-spa-security@master",
    "springbok/ace-admin": "iocean-private:springbok/ace-admin@master",
    "springbok/springbok-spa-core": "iocean:springbok-spa-core@master",
    "springbok/springbok-spa-security": "iocean:springbok-spa-security@master",
    "twbs/bootstrap": "github:twbs/bootstrap@3.3.6",
    "github:angular-translate/bower-angular-translate-handler-log@2.9.2": {
      "angular-translate": "github:angular-translate/bower-angular-translate@2.9.2"
    },
    "github:angular-translate/bower-angular-translate-loader-static-files@2.9.2": {
      "angular-translate": "github:angular-translate/bower-angular-translate@2.9.2"
    },
    "github:angular-translate/bower-angular-translate@2.9.2": {
      "angular": "github:angular/bower-angular@1.5.0"
    },
    "github:angular/bower-angular-animate@1.5.0": {
      "angular": "github:angular/bower-angular@1.5.0"
    },
    "github:angular/bower-angular-cookies@1.5.0": {
      "angular": "github:angular/bower-angular@1.5.0"
    },
    "github:angular/bower-angular-mocks@1.5.0": {
      "angular": "github:angular/bower-angular@1.5.0"
    },
    "github:angular/bower-angular-route@1.5.0": {
      "angular": "github:angular/bower-angular@1.5.0"
    },
    "github:angular/bower-angular-sanitize@1.5.0": {
      "angular": "github:angular/bower-angular@1.5.0"
    },
    "github:angular/bower-angular-touch@1.5.0": {
      "angular": "github:angular/bower-angular@1.5.0"
    },
    "github:jspm/nodelibs-assert@0.1.0": {
      "assert": "npm:assert@1.3.0"
    },
    "github:jspm/nodelibs-path@0.1.0": {
      "path-browserify": "npm:path-browserify@0.0.0"
    },
    "github:jspm/nodelibs-process@0.1.2": {
      "process": "npm:process@0.11.2"
    },
    "github:jspm/nodelibs-util@0.1.0": {
      "util": "npm:util@0.10.3"
    },
    "github:necolas/normalize.css@3.0.3": {
      "css": "github:systemjs/plugin-css@0.1.20"
    },
    "github:twbs/bootstrap@3.3.6": {
      "jquery": "github:components/jquery@2.2.0"
    },
    "iocean:springbok-spa-core@master": {
      "angular": "github:angular/bower-angular@1.5.0",
      "angular-route": "github:angular/bower-angular-route@1.5.0",
      "angular-sanitize": "github:angular/bower-angular-sanitize@1.5.0",
      "angular-translate": "github:angular-translate/bower-angular-translate@2.9.2",
      "angular-translate-handler-log": "github:angular-translate/bower-angular-translate-handler-log@2.9.2",
      "angular-translate-loader-static-files": "github:angular-translate/bower-angular-translate-loader-static-files@2.9.2",
      "angular/bower-angular-mocks": "github:angular/bower-angular-mocks@1.5.0",
      "epeli/underscore.string": "github:epeli/underscore.string@3.3.4",
      "jashkenas/underscore": "github:jashkenas/underscore@1.8.3"
    },
    "iocean:springbok-spa-security@master": {
      "angular": "github:angular/bower-angular@1.5.0",
      "angular-cookies": "github:angular/bower-angular-cookies@1.5.0"
    },
    "npm:assert@1.3.0": {
      "util": "npm:util@0.10.3"
    },
    "npm:babel-runtime@5.8.35": {
      "process": "github:jspm/nodelibs-process@0.1.2"
    },
    "npm:core-js@1.2.6": {
      "fs": "github:jspm/nodelibs-fs@0.1.2",
      "path": "github:jspm/nodelibs-path@0.1.0",
      "process": "github:jspm/nodelibs-process@0.1.2",
      "systemjs-json": "github:systemjs/plugin-json@0.1.0"
    },
    "npm:inherits@2.0.1": {
      "util": "github:jspm/nodelibs-util@0.1.0"
    },
    "npm:path-browserify@0.0.0": {
      "process": "github:jspm/nodelibs-process@0.1.2"
    },
    "npm:process@0.11.2": {
      "assert": "github:jspm/nodelibs-assert@0.1.0"
    },
    "npm:util@0.10.3": {
      "inherits": "npm:inherits@2.0.1",
      "process": "github:jspm/nodelibs-process@0.1.2"
    }
  }
});
