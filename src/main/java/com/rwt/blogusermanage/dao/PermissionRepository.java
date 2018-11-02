package com.rwt.blogusermanage.dao;

import com.rwt.blogusermanage.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author 10156610c
 * @date
 */
public interface PermissionRepository extends JpaRepository<Permission,Integer>,JpaSpecificationExecutor<Permission> {
}
