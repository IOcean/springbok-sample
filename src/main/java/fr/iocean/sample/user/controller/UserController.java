package fr.iocean.sample.user.controller;

import fr.iocean.framework.core.resource.controller.DeletableResourceController;
import fr.iocean.sample.user.model.User;
import fr.iocean.sample.user.service.UserService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static fr.iocean.sample.SpringbokSampleApplication.API_ROOT_PATH;

@Transactional
@RestController
@RequestMapping(value = API_ROOT_PATH + "/users")
public class UserController extends DeletableResourceController<User, Long, UserService> {

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @Override
    public void deleteAll() {
        super.deleteAll();
    }
    
}
