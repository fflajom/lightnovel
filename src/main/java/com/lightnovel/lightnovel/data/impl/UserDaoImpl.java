package com.lightnovel.lightnovel.data.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.googlecode.genericdao.dao.hibernate.GenericDAOImpl;
import com.lightnovel.lightnovel.data.UserDao;
import com.lightnovel.lightnovel.data.model.User;

@Repository("UserDao")
public class UserDaoImpl extends GenericDAOImpl<User, Long> implements UserDao{

    @Autowired
    @Override
    public void setSessionFactory(SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    }
}
