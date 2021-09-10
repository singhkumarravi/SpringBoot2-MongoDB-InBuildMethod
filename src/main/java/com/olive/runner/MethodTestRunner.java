package com.olive.runner;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.olive.model.Book;
import com.olive.repo.ProductRepo;
//@Component
public class MethodTestRunner implements CommandLineRunner{
	@Autowired
	private ProductRepo repo;

	public void run(String... args) throws Exception {
		System.out.println("Runner Class Started............");
		    //findById()
		     /*
             Optional<Book> opt = repo.findById(101);
             if(opt.isPresent()) {
            	 Book book = opt.get();
            	 System.out.println(book);
             }
             else
            	 System.out.println("Book data not available on this Id");
             */
		//exitById()
		/*
		    boolean id = repo.existsById(101);
		    if(id)
		    System.out.println("Record Exits with Id"  + id);
		    else
		    	System.out.println("Record Not Exits with Id");
		*/
		//findAll()
		/*
		List<Book> list = repo.findAll();
		          list.forEach(System.out::println);
		  */
		
		//count()
		/*
		 long count = repo.count();
		 System.out.println("No. Of Record : " + count);
		 */
		
		//findAllById()
		/*
		Iterable<Book> iterable = repo.findAllById(Arrays.asList(101,102,103));
		iterable.forEach(System.out::println);  
		*/
		
		//deleteById()
		/*
		repo.deleteById(101);
		*/
		
		//deleteAll()
		/*
		repo.deleteAll();
		*/
        System.out.println("Product Data Save into MongoDB");
      
	}

}
