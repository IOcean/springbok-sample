package fr.iocean.sample.permission.controller;

import fr.iocean.framework.core.resource.controller.ResourceController;
import fr.iocean.sample.permission.model.Permission;
import fr.iocean.sample.permission.service.PermissionService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static fr.iocean.sample.SpringbokSampleApplication.API_ROOT_PATH;

@Transactional
@RestController
@RequestMapping(value = API_ROOT_PATH + "/permissions")
public class PermissionController extends ResourceController<Permission, Long, PermissionService> {
}
