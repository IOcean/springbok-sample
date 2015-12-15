package fr.iocean.sample.user.repository;

import fr.iocean.framework.core.resource.repository.ResourceRepository;
import fr.iocean.sample.user.model.User;

public interface UserRepository extends ResourceRepository<User, Long> {
}
