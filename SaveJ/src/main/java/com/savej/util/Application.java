package com.savej.util;

import java.awt.print.Book;
import java.util.Locale.Category;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.savej.datasource.AlunoDAO;
import com.savej.enter.Aluno;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class Application  {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		
		 ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.cfg.xml");
		 		 AlunoDAO bookStoreDAO = (AlunoDAO) applicationContext.getBean("alunodao");

				// Book 
				 Aluno book = new Aluno();
				 book.setNome("Camilo Lopes");
				 book.setIdade(1235);
				 book.setCidadeNatal("Guia JEE c/ Frameworks");

				 AlunoDAO.saveOrUpdate1(book);

				 }
/*
				 private static void deleteBook(AlunoDAO bookStoreDAO, long id) {
				 Book bookFound = bookStoreDAO.findById(id);
				 bookStoreDAO.delete(bookFound);
				 System.out.println("Book deleted with sucess " + bookFound.getTitle());

				 }
				 private static void findBookById(BookStoreDAO bookStoreDAO, Long id){
				 Book book = bookStoreDAO.findById(id);
				 System.out.println("Title: "+ book.getTitle());
				 System.out.println("Author: " + book.getAuthor());
				 }
				}
	}
	*/
}
