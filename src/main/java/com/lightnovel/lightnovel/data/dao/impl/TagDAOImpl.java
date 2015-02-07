package com.lightnovel.lightnovel.data.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.googlecode.genericdao.dao.hibernate.GenericDAOImpl;
import com.lightnovel.lightnovel.data.dao.TagDAO;
import com.lightnovel.lightnovel.data.model.Tag;

@Repository("TagDAO")
public class TagDAOImpl extends GenericDAOImpl<Tag, Long> implements TagDAO {

    @Autowired
    @Override
    public void setSessionFactory(SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    }
}
