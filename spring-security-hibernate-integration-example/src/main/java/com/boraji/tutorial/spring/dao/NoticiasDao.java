package com.boraji.tutorial.spring.dao;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.boraji.tutorial.spring.model.Noticia;

@Repository
public class NoticiasDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	
	public ArrayList<Noticia> getNoticias(){				
		String hql = "from Noticia";
		Query<?> query = sessionFactory.getCurrentSession().createQuery(hql);
		return null;
		//return (ArrayList<Noticia>) hibernateTemplate.find("from Noticia");
	}

}
