package fr.iocean.sample.api.user.model;

import fr.iocean.framework.security.model.userdetails.PersistentUserDetails;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "user_")
public class User extends PersistentUserDetails {
    
    private static final long serialVersionUID = 3664346469955904173L;

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

}
