(function () {
    'use strict';
    
    angular.module('accounts').controller('usersController', usersController);

    usersController.$inject = ['Search', 'endpoints'];

    function usersController(Search, endpoints) {
        var users = this;
        
        users.form = {
            enabled: true
        };
        
        var searchConfiguration = {
            form: users.form, // Optional, not needed if there is no search parameters
            endpoint: endpoints.get('accounts'),
            columnList: [ // Only name is needed here, key & cssClass are optional (for display purposes)
                {name: 'username', key: 'ACCOUNTS_USERS_USERNAME', cssClasses: 'col-sm-4'},
                {name: 'email', key: 'GLOBAL_EMAIL', cssClasses: 'col-sm-4'},
                {name: 'signedUpDate', key: 'ACCOUNTS_USERS_SIGNEDUPDATE', cssClasses: 'col-sm-4'}
            ],
            currentOrderBy: 'username',
            currentDirection: 'asc', // Optional
            maxPerPage: 50, // Optional
            allMaxPerPage: [50, 100, 500, 1000], // Optional
            criteriasKey: 'ACCOUNT_USERS_SEARCH'
        };
        
        users.search = new Search(searchConfiguration);
        users.search.search();
    }
})();

