package fr.iocean.sample.api.credential.model;

import fr.iocean.framework.security.model.credentialdetails.PersistentCredentialDetails;
import javax.persistence.Entity;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
public class Credential extends PersistentCredentialDetails {
    
    private static final long serialVersionUID = -4215451636198387253L;
}
