package fr.iocean.sample.api.profile.service;

import fr.iocean.framework.core.resource.service.ResourceService;
import fr.iocean.sample.api.profile.model.Profile;
import fr.iocean.sample.api.profile.repository.ProfileRepository;
import org.springframework.stereotype.Service;

@Service
public class ProfileService extends ResourceService<Profile, Long, ProfileRepository> {
}
