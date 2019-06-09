package com.zxd.repository;

import com.zxd.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * @author zxd
 * @create 2017-03-31 15:17
 **/
@Repository
public interface UserRepository extends JpaRepository<User,String> {
    @Modifying
    @Query(value = "update User u set u.age = ?1 where u.id = ?2")
    int modifyAgeById(int age,String id);
}
