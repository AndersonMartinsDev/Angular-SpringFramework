package com.savej.datasource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.savej.enter.Aluno;

@Repository
public class AlunoDAO implements WayBD {

	@Autowired
	private static HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public void saveOrUpdate(Aluno book) {
		hibernateTemplate.saveOrUpdate(book);

	}
	public static void saveOrUpdate1(Aluno book1) {
		hibernateTemplate.saveOrUpdate(book1);

	}
	public void delete(Aluno book) {
		hibernateTemplate.delete(book);

	}

	public Aluno findById(Long id) {
		return hibernateTemplate.get(Aluno.class, id);
	}

}
