package fr.iocean.sample.api.userprofile.controller;

import fr.iocean.framework.core.resource.controller.ResourceController;
import fr.iocean.sample.api.userprofile.model.UserProfile;
import fr.iocean.sample.api.userprofile.service.UserProfileService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static fr.iocean.sample.SpringbokSampleApplication.API_ROOT_PATH;

@Transactional
@RestController
@RequestMapping(value = API_ROOT_PATH + "/userprofiles")
public class UserProfileController extends ResourceController<UserProfile, Long, UserProfileService> {
}
