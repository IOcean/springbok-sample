package fr.iocean.sample.api.profile.model;

import fr.iocean.framework.security.model.profiledetails.PersistentProfileDetails;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@NoArgsConstructor
public class Profile extends PersistentProfileDetails {
    
    private static final long serialVersionUID = -5796387876719557015L;
}
