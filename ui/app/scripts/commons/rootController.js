(function() {
    'use strict';
    
    angular.module('commons').controller('rootController', rootController);
    
    rootController.$inject = ['$rootScope', '$location', '$route', 'notification', 'authenticationService'];
    
    function rootController($rootScope, $location, $route, notification, authenticationService) {
        var root = this;
     
        root.currentPage = $route.current;
        root.spinnerCount = 0;
        root.showSpinner = false;
        
        $rootScope.$on('Notify', function (event, type, message) {
            root.notification = notification.create(type, message);
            notification.display(root.notification);
        });
        
        $rootScope.$on('showSpinner', function () {
            root.spinnerCount++;
            
            if (root.spinnerCount !== 0) {
                root.showSpinner = true;
            }
        });

        $rootScope.$on('hideSpinner', function () {
            root.spinnerCount--;
            
            if (root.spinnerCount <= 0) {
                root.showSpinner = false;
            }
        });
        
        $rootScope.$on('$routeChangeSuccess', function (event, current) {
            root.currentPage = current;
        });
        
        $rootScope.$on('AuthenticationChange', function() {
            root.currentPage = $route.current;
        });
        
        $rootScope.$on('http-error-401', function() {
            $rootScope.$emit('Notify', 'warning', 'SECURITY_AUTHENTICATION_REQUIRED');
            authenticationService.logout();
            $location.path('/');
        });
        
        $rootScope.$on('http-error-403', function() {
            $rootScope.$emit('Notify', 'error', 'SECURITY_INSUFFICIENT_CREDENTIALS');
        });
        
        $rootScope.$on('http-error-404', function() {
            $location.path('/404');
        });
    }
})();

