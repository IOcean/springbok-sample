package fr.iocean.sample.api.user.repository;

import fr.iocean.sample.api.user.model.User;
import fr.iocean.sample.api.user.model.UserSearch;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Defines all custom methods for user entity.
 */
public interface UserRepositoryCustom {

    PageImpl<User> search(Pageable pageable, UserSearch searchBean);

    List<User> findByProfile(Long profileId);
    
}
