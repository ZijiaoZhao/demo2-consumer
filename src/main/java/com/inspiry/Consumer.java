package com.inspiry;

import com.alibaba.dubbo.config.annotation.Reference;
import com.inspiry.demo.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ImportResource("classpath:consumer.xml")
public class Consumer implements CommandLineRunner{
    @Autowired
    private IUserService userService;

    public static void main( String[] args ) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:consumer.xml");
//        context.start();
//        IUserService userService = (IUserService) context.getBean("userService");
//        userService.show();
//        System.out.println( "Hello World!" );
        SpringApplication.run(Consumer.class, args);
        System.out.println( "[demo2-consumer] Hello World!" );
    }

    public void run(String... args) throws Exception {
        System.out.println("age = " + userService.show(5));
        System.out.println("[demo2-consumer] server started");
    }
}
