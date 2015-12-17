package fr.iocean.sample.api.userprofile.repository;

import fr.iocean.framework.security.repository.UserDetailsProfileDetailsRepository;
import fr.iocean.sample.api.userprofile.model.UserProfile;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProfileRepository extends UserDetailsProfileDetailsRepository<UserProfile, Long> {
}
