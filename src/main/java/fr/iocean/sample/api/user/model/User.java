package fr.iocean.sample.api.user.model;

import fr.iocean.framework.security.model.userdetails.PersistentUserDetails;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@Table(name = "user_")
public class User extends PersistentUserDetails {
    
    private static final long serialVersionUID = 3664346469955904173L;
}
