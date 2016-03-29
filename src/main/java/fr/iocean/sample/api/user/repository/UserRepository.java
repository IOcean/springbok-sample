package fr.iocean.sample.api.user.repository;

import fr.iocean.framework.core.resource.repository.ResourceRepository;
import fr.iocean.sample.api.user.model.User;

public interface UserRepository extends ResourceRepository<User, Long>, UserRepositoryCustom {
}
