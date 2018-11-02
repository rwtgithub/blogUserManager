package com.rwt.blogusermanage.service.impl;

import com.rwt.blogusermanage.dao.PermissionRepository;
import com.rwt.blogusermanage.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 10156610c
 * @date
 */
public class PermissionServiceImpl implements PermissionService {
    @Autowired
    private PermissionRepository permissionRepository;

    public PermissionRepository getPermissionRepository(){
        return permissionRepository;
    }
}
