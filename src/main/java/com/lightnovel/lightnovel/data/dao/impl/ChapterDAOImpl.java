package com.lightnovel.lightnovel.data.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.googlecode.genericdao.dao.hibernate.GenericDAOImpl;
import com.lightnovel.lightnovel.data.dao.ChapterDAO;
import com.lightnovel.lightnovel.data.model.Chapter;

@Repository("ChapterDAO")
public class ChapterDAOImpl extends GenericDAOImpl<Chapter, Long> implements ChapterDAO{

    @Autowired
    @Override
    public void setSessionFactory(SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    }
}
