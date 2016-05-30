(function() {
    'use-strict';
    
    // Application set up
    let modules = [
        {name: 'commons', dependencies: []},
        {name: 'home', dependencies: []},
        {name: 'accounts', dependencies: []}
    ];
    
    let appDependencies = [
        'ngRoute',
        'ui.bootstrap',
        'springbok.core',
        'springbok.security'
    ];

    modules.forEach(function(module) {
        angular.module(module.name, module.dependencies);
        appDependencies.push(module.name);
    });
    
    let app = angular.module('app', appDependencies);
    
    // Init sprinbok.core module
    app.run(['endpoints', 'session', 'enums', 'pagination', function (endpoints, session, enums, pagination) {
        endpoints.setApiRootPath(CONFIG.api.endpoint);
        session.setDefaultExpirationDurationInMilliseconds(CONFIG.app.sessionExpirationTimeInSeconds * 1000);
        enums.load();
        pagination.setDefaultAllMaxPerPage([25, 50, 100, 500, 1000]);
    }]);

    app.run(['menuItems', function(menuItems) {
        menuItems.add(
            {
                url: '#/accueil', 
                labelKey: 'MENU_ITEM_HOME', 
                cssClass: 'sb-red', 
                backgroundCssClass: '', 
                isActive: true, 
                isAuthorized: true, 
                icon: 'fa-home'
            });
        
        menuItems.add(
            {
                labelKey: 'MENU_ITEM_ACCOUNTS',
                cssClass: 'sb-blue',
                backgroundCssClass: '',
                isActive: false,
                isAuthorized: true,
                icon: 'fa-users',
                isSubMenuOpened: false,
                subItems: [
                    {
                        url: '#/comptes/utilisateurs',
                        labelKey: 'MENU_SUBITEM_USERS',
                        cssClass: '',
                        backgroundCssClass: '',
                        isActive: false,
                        isAuthorized: true
                    },
                    {
                        url: '#/comptes/profils',
                        labelKey: 'MENU_SUBITEM_PROFILES',
                        cssClass: '',
                        backgroundCssClass: '',
                        isActive: false,
                        isAuthorized: true
                    }
                ]
            });
    }]);
})();