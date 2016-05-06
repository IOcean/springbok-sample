(function() {
    'use strict';
    
    angular.module('commons').controller('rootController', rootController);
    
    rootController.$inject = ['$scope', '$location', '$route', 'navigation', 'notification', 'authenticationService'];
    
    function rootController($scope, $location, $route, navigation, notification, authenticationService) {
        var root = this;
     
        root.currentPage = navigation.currentPage;
        root.spinnerCount = 0;
        root.showSpinner = false;
        
        $scope.$on('Notify', function (event, type, message) {
            root.notification = notification.create(type, message);
            notification.display(root.notification);
        });
        
        $scope.$on('showSpinner', function () {
            root.spinnerCount++;
            
            if (root.spinnerCount !== 0) {
                root.showSpinner = true;
            }
        });

        $scope.$on('hideSpinner', function () {
            root.spinnerCount--;
            
            if (root.spinnerCount <= 0) {
                root.showSpinner = false;
            }
        });
        
        $scope.$on('$routeChangeSuccess', function (event, current, previous) {
            navigation.routeChange(current, previous);
            root.currentPage = navigation.currentPage;
        });
        
        $scope.$on('AuthenticationChange', function(event) {
            navigation.routeChange($route.current, $route.previous);
            root.currentPage = navigation.currentPage;
        });
        
        $scope.$on('http-error-401'), function() {
            $scope.$emit('Notify', 'error', 'SECURITY_AUTHENTICATION_REQUIRED');
            authenticationService.logout();
            $location.path('/');
        };
        
        $scope.$on('http-error-403'), function() {
            $scope.$emit('Notify', 'error', 'SECURITY_INSUFFICIENT_CREDENTIALS');
        };
        
        $scope.$on('http-error-404'), function() {
            $location.path('/404');
        };
    }
})();

