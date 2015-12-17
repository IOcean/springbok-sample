package fr.iocean.sample.api.profile.repository;

import fr.iocean.framework.security.repository.ProfileDetailsRepository;
import fr.iocean.sample.api.profile.model.Profile;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends ProfileDetailsRepository<Profile, Long> {
}
