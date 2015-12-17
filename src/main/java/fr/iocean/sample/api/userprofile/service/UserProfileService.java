package fr.iocean.sample.api.userprofile.service;

import fr.iocean.framework.core.resource.service.ResourceService;
import fr.iocean.sample.api.userprofile.model.UserProfile;
import fr.iocean.sample.api.userprofile.repository.UserProfileRepository;
import org.springframework.stereotype.Service;

@Service
public class UserProfileService extends ResourceService<UserProfile, Long, UserProfileRepository> {
}
