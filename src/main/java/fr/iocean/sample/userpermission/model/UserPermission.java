package fr.iocean.sample.userpermission.model;


import fr.iocean.framework.security.model.PersistentUserPermissionDetails;
import fr.iocean.sample.permission.model.Permission;
import fr.iocean.sample.user.model.User;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@Table(name = "user_permission")
public class UserPermission extends PersistentUserPermissionDetails<User, Permission> {
    private static final long serialVersionUID = -1597233218854014134L;
}
