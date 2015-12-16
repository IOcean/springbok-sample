package fr.iocean.sample.user.model;

import fr.iocean.framework.security.model.PersistentUserDetails;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@Table(name = "user_")
public class User extends PersistentUserDetails {
}
