package com.test.test1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Test1Application {

	public static void main(String[] args) {

		// using application context for object
		ApplicationContext appContext = SpringApplication.run(Test1Application.class, args);

		SpringApplication.run(Test1Application.class, args);

//		way 1
//		Dev d = new Dev();
//
//		d.build();


		Dev d = appContext.getBean(Dev.class);

		d.build();

	}

}
