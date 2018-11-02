package com.rwt.blogusermanage.dao;

import com.rwt.blogusermanage.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author 10156610c
 * @date
 */
public interface UserRepository extends JpaRepository<User,Integer>,JpaSpecificationExecutor<User> {

    /**
     * search User By mobilephone
     * @param mobilephone
     * @return User
     */
    public User findByMobliephone(String mobilephone);


}
