package fr.iocean.sample.userpermission.controller;

import fr.iocean.framework.core.resource.controller.ResourceController;
import fr.iocean.sample.userpermission.model.UserPermission;
import fr.iocean.sample.userpermission.service.UserPermissionService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static fr.iocean.sample.SpringbokSampleApplication.API_ROOT_PATH;

@Transactional
@RestController
@RequestMapping(value = API_ROOT_PATH + "/userpermissions")
public class UserPermissionController extends ResourceController<UserPermission, Long, UserPermissionService> {
}
