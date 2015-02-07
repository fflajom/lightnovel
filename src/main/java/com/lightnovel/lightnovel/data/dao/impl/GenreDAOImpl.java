package com.lightnovel.lightnovel.data.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.googlecode.genericdao.dao.hibernate.GenericDAOImpl;
import com.lightnovel.lightnovel.data.dao.GenreDAO;
import com.lightnovel.lightnovel.data.model.Genre;

@Repository("GenreDAO")
public class GenreDAOImpl extends GenericDAOImpl<Genre, Long> implements GenreDAO {

    @Autowired
    @Override
    public void setSessionFactory(SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    }
}
