package com.savej.datasource;


import com.savej.enter.Aluno;

public interface WayBD {
	  void saveOrUpdate(Aluno book); 
	 void delete(Aluno book);
	 Aluno findById(Long id); 
}
