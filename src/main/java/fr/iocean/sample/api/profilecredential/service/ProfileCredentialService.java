package fr.iocean.sample.api.profilecredential.service;

import fr.iocean.framework.core.resource.service.ResourceService;
import fr.iocean.sample.api.profilecredential.model.ProfileCredential;
import fr.iocean.sample.api.profilecredential.repository.ProfileCredentialRepository;
import org.springframework.stereotype.Service;

@Service
public class ProfileCredentialService extends ResourceService<ProfileCredential, Long, ProfileCredentialRepository> {
}
