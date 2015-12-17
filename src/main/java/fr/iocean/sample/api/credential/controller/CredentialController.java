package fr.iocean.sample.api.credential.controller;

import fr.iocean.framework.core.resource.controller.ResourceController;
import static fr.iocean.sample.SpringbokSampleApplication.API_ROOT_PATH;
import fr.iocean.sample.api.credential.model.Credential;
import fr.iocean.sample.api.credential.service.CredentialService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(API_ROOT_PATH + "/credentials")
public class CredentialController extends ResourceController<Credential, Long, CredentialService> {
}
