package fr.iocean.sample.user.controller;

import fr.iocean.framework.core.resource.controller.ResourceController;
import fr.iocean.sample.user.model.User;
import fr.iocean.sample.user.service.UserService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Transactional
@RestController
@RequestMapping(value = "/api/users")
public class UserController extends ResourceController<User, Long, UserService> {
}
