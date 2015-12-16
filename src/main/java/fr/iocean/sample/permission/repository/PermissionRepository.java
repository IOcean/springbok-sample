package fr.iocean.sample.permission.repository;

import fr.iocean.framework.security.repository.PermissionDetailsRepository;
import fr.iocean.sample.permission.model.Permission;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionRepository extends PermissionDetailsRepository<Permission, Long> {
}
