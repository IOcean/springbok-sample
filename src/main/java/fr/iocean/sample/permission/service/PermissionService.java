package fr.iocean.sample.permission.service;

import fr.iocean.framework.core.resource.service.ResourceService;
import fr.iocean.sample.permission.model.Permission;
import fr.iocean.sample.permission.repository.PermissionRepository;
import org.springframework.stereotype.Service;

@Service
public class PermissionService extends ResourceService<Permission, Long, PermissionRepository> {
}
