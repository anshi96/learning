package com.first;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class ExecutionClass {
	public static void main(String argsp[]) {

       SpringApplication.run(ExecutionClass.class, argsp);

//		MyApp s = ap.getBean(MyApp.class);
//		System.out.println(s);
//		System.out.println(s.getDescription());
//		System.out.println(s.getName());
//		System.out.println(s.getVersion());
//		System.out.println(s.getClass());
//		
//	    List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
//	    List<Object> v= listOfStrings.stream().distinct().collect(Collectors.toList());
//	    System.out.println(v);
		
		

	}

}
