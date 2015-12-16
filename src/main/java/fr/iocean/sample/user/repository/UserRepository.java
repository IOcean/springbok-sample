package fr.iocean.sample.user.repository;

import fr.iocean.framework.security.repository.UserDetailsRepository;
import fr.iocean.sample.user.model.User;

public interface UserRepository extends UserDetailsRepository<User, Long> {
}
