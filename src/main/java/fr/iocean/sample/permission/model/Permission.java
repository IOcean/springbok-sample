package fr.iocean.sample.permission.model;

import fr.iocean.framework.security.model.PersistentPermissionDetails;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@NoArgsConstructor
public class Permission extends PersistentPermissionDetails {
    private static final long serialVersionUID = -5796387876719557015L;
}
