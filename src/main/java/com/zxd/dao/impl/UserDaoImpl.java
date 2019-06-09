package com.zxd.dao.impl;

import com.zxd.dao.IUserDao;
import org.hibernate.Query;
import org.hibernate.sql.Update;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements IUserDao {
    @Override
    public void update(Query query, Update update, Class t) {

    }
}
