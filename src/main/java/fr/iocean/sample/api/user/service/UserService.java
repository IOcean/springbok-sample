package fr.iocean.sample.api.user.service;

import fr.iocean.framework.core.resource.service.ResourceService;
import fr.iocean.sample.api.user.model.User;
import fr.iocean.sample.api.user.model.UserSearch;
import fr.iocean.sample.api.user.repository.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserService extends ResourceService<User, Long, UserRepository> {

    public UserSearch createSearchBeanFromRequest(Boolean active, String firstName, String lastName, Boolean firstOrLastName) {
        UserSearch searchBean = new UserSearch();
        searchBean.enabled = active;
        searchBean.firstName = firstName;
        searchBean.lastName = lastName;
        searchBean.firstOrLastName = firstOrLastName;

        return searchBean;
    }

    public Page<User> search(Pageable pageRequest, UserSearch searchBean) {
        return repository.search(pageRequest, searchBean);
    }
    
}
