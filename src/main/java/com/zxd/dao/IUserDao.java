package com.zxd.dao;

import org.hibernate.Query;
import org.hibernate.sql.Update;

public interface IUserDao {
    void update(Query query, Update update, Class T);
}
