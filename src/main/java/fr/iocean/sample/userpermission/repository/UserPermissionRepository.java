package fr.iocean.sample.userpermission.repository;

import fr.iocean.framework.security.repository.UserPermissionDetailsRepository;
import fr.iocean.sample.userpermission.model.UserPermission;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPermissionRepository extends UserPermissionDetailsRepository<UserPermission, Long> {
}
