package fr.iocean.sample.api.profilecredential.controller;

import fr.iocean.framework.core.resource.controller.ResourceController;
import static fr.iocean.sample.SpringbokSampleApplication.API_ROOT_PATH;
import fr.iocean.sample.api.profilecredential.model.ProfileCredential;
import fr.iocean.sample.api.profilecredential.service.ProfileCredentialService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(API_ROOT_PATH + "/profilecredentials")
public class ProfileCredentialController extends ResourceController<ProfileCredential, Long, ProfileCredentialService> {
}
