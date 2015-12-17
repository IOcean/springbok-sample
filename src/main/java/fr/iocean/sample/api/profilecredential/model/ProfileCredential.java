package fr.iocean.sample.api.profilecredential.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import fr.iocean.framework.security.model.profiledetailscredentialdetails.PersistentProfileDetailsCredentialDetails;
import fr.iocean.sample.api.credential.model.Credential;
import fr.iocean.sample.api.profile.model.Profile;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Table(name = "profile_credential")
public class ProfileCredential extends PersistentProfileDetailsCredentialDetails<Profile, Credential> {
    
    private static final long serialVersionUID = 2356215083399940476L;
}
