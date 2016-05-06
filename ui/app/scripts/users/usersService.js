(function () {
    'use strict';
    
    angular.module('accounts').service('usersService', usersService);
    
    usersService.$inject = ['$http', 'endpoints'];
    
    function usersService($http, endpoints) {
        
        this.find = function(userId) {
            return $http.get(endpoints.get('accounts') + '/' + userId);
        };
        
        this.update = function(user) {
            return $http.put(endpoints.get('accounts') + '/' + user.id, user);
        };
    }
})();

