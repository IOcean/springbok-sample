package fr.iocean.sample.api.user.repository;

import fr.iocean.framework.security.repository.UserDetailsRepository;
import fr.iocean.sample.api.user.model.User;

public interface UserRepository extends UserDetailsRepository<User, Long> {
}
