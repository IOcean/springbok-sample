package fr.iocean.sample.api.user.model;

import fr.iocean.framework.core.resource.model.LongIdPersistentResource;
import fr.iocean.framework.security.model.account.Account;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "user_")
public class User extends LongIdPersistentResource {
    
    private static final long serialVersionUID = 3664346469955904173L;

    @OneToOne(cascade = CascadeType.ALL)
    private Account account;
    
    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

}
