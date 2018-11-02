package com.rwt.blogusermanage.dao;

import com.rwt.blogusermanage.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author 10156610c
 * @date
 */
public interface RoleRepository extends JpaRepository<Role,Integer>,JpaSpecificationExecutor<Role> {

    /**Search role by rolename
     *
     * @param roleName
     * @return Role
     */
            public Role findByRoleName(String roleName);

}
