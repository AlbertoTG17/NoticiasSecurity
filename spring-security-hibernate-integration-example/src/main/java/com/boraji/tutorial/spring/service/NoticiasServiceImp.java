package com.boraji.tutorial.spring.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.boraji.tutorial.spring.dao.NoticiasDao;
import com.boraji.tutorial.spring.model.Noticia;

@Service("noticiasService")
public class NoticiasServiceImp {
	
	@Autowired
	private NoticiasDao noticiasDao;
	
	@Transactional(readOnly = true)
	public ArrayList<Noticia> getNoticias(){
		return noticiasDao.getNoticias();
	}

}
