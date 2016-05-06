(function () {
    'use strict';
    
    angular.module('accounts').controller('userController', userController);

    userController.$inject = ['$scope', '$routeParams', 'usersService'];

    function userController($scope, $routeParams, usersService) {
        var user = this;
        var userId = $routeParams.id;
        
        user.inEdition = false;
        user.current = {};
        
        getUser();
        
        user.edit = function() {
            user.inEdition = true;
        };
        
        user.save = function() {
            usersService.update(user.current).then(function(response) {
                init(response.data);
                $scope.$emit('Notify', 'success', 'GLOBAL_UPDATE_OK');
            }, function() {
                $scope.$emit('Notify', 'error', 'GLOBAL_UPDATE_KO');
            });
        };
        
        function init(userData) {
            user.current = userData;
            user.username = user.current.username;
            user.inEdition = false;
        }
        
        function getUser() {
            usersService.find(userId).then(function(response) {
                init(response.data);
            });
        }
    }
})();

