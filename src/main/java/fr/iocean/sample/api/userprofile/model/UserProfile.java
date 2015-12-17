package fr.iocean.sample.api.userprofile.model;


import fr.iocean.framework.security.model.userdetailsprofiledetails.PersistentUserDetailsProfileDetails;
import fr.iocean.sample.api.profile.model.Profile;
import fr.iocean.sample.api.user.model.User;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@Table(name = "user_profile")
public class UserProfile extends PersistentUserDetailsProfileDetails<User, Profile> {
    private static final long serialVersionUID = -1597233218854014134L;
}
