package fr.iocean.sample.api.credential.service;

import fr.iocean.framework.core.resource.service.ResourceService;
import fr.iocean.sample.api.credential.model.Credential;
import fr.iocean.sample.api.credential.repository.CredentialRepository;
import org.springframework.stereotype.Service;

@Service
public class CredentialService extends ResourceService<Credential, Long, CredentialRepository> {
}
