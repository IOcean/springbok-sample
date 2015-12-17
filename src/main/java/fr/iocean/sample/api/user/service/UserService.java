package fr.iocean.sample.api.user.service;

import fr.iocean.framework.core.resource.service.ResourceService;
import fr.iocean.sample.api.user.model.User;
import fr.iocean.sample.api.user.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService extends ResourceService<User, Long, UserRepository> {
}
