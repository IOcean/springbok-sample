package fr.iocean.sample.api.credential.repository;

import fr.iocean.framework.security.repository.CredentialDetailsRepository;
import fr.iocean.sample.api.credential.model.Credential;
import org.springframework.stereotype.Repository;

@Repository
public interface CredentialRepository extends CredentialDetailsRepository<Credential, Long> {
}
