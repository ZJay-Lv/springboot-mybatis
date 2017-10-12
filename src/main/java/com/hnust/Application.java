package com.hnust;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;  
  
  
@Configuration  
@ComponentScan  //添加该注解必须在非default包中
@EnableAutoConfiguration   
public class Application {  
  
    public static void main(String[] args) {  
        SpringApplication.run(Application.class);  
    }  
}