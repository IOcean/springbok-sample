package fr.iocean.sample.userpermission.service;

import fr.iocean.framework.core.resource.service.ResourceService;
import fr.iocean.sample.userpermission.model.UserPermission;
import fr.iocean.sample.userpermission.repository.UserPermissionRepository;
import org.springframework.stereotype.Service;

@Service
public class UserPermissionService extends ResourceService<UserPermission, Long, UserPermissionRepository> {
}
