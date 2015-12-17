package fr.iocean.sample.api.profile.controller;

import fr.iocean.framework.core.resource.controller.ResourceController;
import fr.iocean.sample.api.profile.model.Profile;
import fr.iocean.sample.api.profile.service.ProfileService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static fr.iocean.sample.SpringbokSampleApplication.API_ROOT_PATH;

@Transactional
@RestController
@RequestMapping(value = API_ROOT_PATH + "/profiles")
public class ProfileController extends ResourceController<Profile, Long, ProfileService> {
}
