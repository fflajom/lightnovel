package com.lightnovel.lightnovel.data.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.googlecode.genericdao.dao.hibernate.GenericDAOImpl;
import com.lightnovel.lightnovel.data.dao.BookDAO;
import com.lightnovel.lightnovel.data.model.Book;

@Repository("BookDAO")
public class BookDAOImpl extends GenericDAOImpl<Book, Long> implements BookDAO {

    @Autowired
    @Override
    public void setSessionFactory(SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    }
}
