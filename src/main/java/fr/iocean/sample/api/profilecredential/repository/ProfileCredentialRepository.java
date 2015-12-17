package fr.iocean.sample.api.profilecredential.repository;

import fr.iocean.framework.security.repository.ProfileDetailsCredentialDetailsRepository;
import fr.iocean.sample.api.profilecredential.model.ProfileCredential;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileCredentialRepository extends ProfileDetailsCredentialDetailsRepository<ProfileCredential, Long> {
}
