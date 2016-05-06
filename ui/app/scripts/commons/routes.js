(function () {
    'use strict';
    
    angular.module('commons').config(routes);
    
    routes.$inject = ['$routeProvider'];
    
    function routes($routeProvider) {
        var routes = [
            {
                '/': {
                    redirectTo: '/accueil'
                }
            },
            {
                '/404': {
                    templateUrl: 'views/commons/404.html',
                    htmlTitleKey: 'PAGE_404_TITLE',
                    breadcrumbsSectionKey: 'SECTION_ERROR',
                    breadcrumbsSubSectionKey: 'SUBSECTION_ERROR_404',
                    breadcrumbsUrl: '',
                    headerKey: 'PAGE_404_HEADER',
                    subHeaderKey: 'PAGE_404_SUBHEADER'
                    
                }
            },
            {
                '/500': {
                    templateUrl: 'views/commons/500.html',
                    htmlTitleKey: 'PAGE_500_TITLE',
                    breadcrumbsSectionKey: 'SECTION_ERROR',
                    breadcrumbsSubSectionKey: 'SUBSECTION_ERROR_500',
                    breadcrumbsUrl: '',
                    headerKey: 'PAGE_500_HEADER',
                    subHeaderKey: 'PAGE_500_SUBHEADER'
                }
            },
            {
                '/accueil': {
                    templateUrl: 'views/modules/home/home.html',
                    htmlTitleKey: 'PAGE_HOME_TITLE',
                    breadcrumbsSectionKey: 'SECTION_HOME',
                    breadcrumbsSubSectionKey: 'SUBSECTION_WELCOME',
                    breadcrumbsUrl: '/accueil',
                    headerKey: 'PAGE_HOME_HEADER',
                    subHeaderKey: 'PAGE_HOME_SUBHEADER'
                }
            },
            {
                '/comptes/utilisateurs': {
                    templateUrl: 'views/modules/accounts/users/users.html',
                    controller: 'usersController',
                    controllerAs: 'users',
                    htmlTitleKey: 'PAGE_USERS_TITLE',
                    breadcrumbsSectionKey: 'SECTION_ACCOUNTS',
                    breadcrumbsSubSectionKey: 'SUBSECTION_USERS',
                    breadcrumbsUrl: '/comptes/utilisateurs',
                    headerKey: 'PAGE_USERS_HEADER',
                    subHeaderKey: 'PAGE_USERS_SUBHEADER'
                }
            },
            {
                '/comptes/utilisateurs/:id': {
                    templateUrl: 'views/modules/accounts/users/user.html',
                    controller: 'userController',
                    controllerAs: 'user',
                    htmlTitleKey: 'PAGE_USER_TITLE',
                    breadcrumbsSectionKey: 'SECTION_ACCOUNTS',
                    breadcrumbsSubSectionKey: 'SUBSECTION_USER',
                    breadcrumbsUrl: '/comptes/utilisateurs',
                    headerKey: 'PAGE_USER_HEADER',
                    subHeaderKey: 'PAGE_USER_SUBHEADER'
                }
            },
            {
                '/comptes/profils': {
                    templateUrl: 'views/modules/accounts/profiles/profiles.html',
                    htmlTitleKey: 'PAGE_PROFILES_TITLE',
                    breadcrumbsSectionKey: 'SECTION_ACCOUNTS',
                    breadcrumbsSubSectionKey: 'SUBSECTION_PROFILES',
                    breadcrumbsUrl: '/comptes/profils',
                    headerKey: 'PAGE_PROFILES_HEADER',
                    subHeaderKey: 'PAGE_PROFILES_SUBHEADER'
                }
            }
        ];

        _.each(routes, function (route) {
            var routePath = _.keys(route)[0];
            var routeData = route[routePath];
            
            $routeProvider.when(routePath, routeData);
        });

        $routeProvider.otherwise({
            redirectTo: '/404'
        });
    }
})();
