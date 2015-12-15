package fr.iocean.sample.user.model;

import fr.iocean.framework.core.resource.model.PersistentResource;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "user_")
public class User implements PersistentResource<Long> {

    @Id
    @GeneratedValue
    protected Long id;
    
    private String email;
    
}
