package fr.iocean.sample.api.user.controller;

import fr.iocean.framework.security.controller.UserDetailsController;
import fr.iocean.sample.api.user.model.User;
import fr.iocean.sample.api.user.service.UserService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static fr.iocean.sample.SpringbokSampleApplication.API_ROOT_PATH;

@RestController
@RequestMapping(value = API_ROOT_PATH + "/users")
public class UserController extends UserDetailsController<User, Long, UserService> {
    
    @PreAuthorize("hasRole('DELETE')")
    @Override
    public void deleteAll() {
        super.deleteAll();
    }
}
