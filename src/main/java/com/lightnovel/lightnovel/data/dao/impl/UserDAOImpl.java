package com.lightnovel.lightnovel.data.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.googlecode.genericdao.dao.hibernate.GenericDAOImpl;
import com.lightnovel.lightnovel.data.dao.UserDAO;
import com.lightnovel.lightnovel.data.model.User;

@Repository("UserDAO")
public class UserDAOImpl extends GenericDAOImpl<User, Long> implements UserDAO {

    @Autowired
    @Override
    public void setSessionFactory(SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    }
}
