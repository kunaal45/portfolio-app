package com.kunaal.portfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication is actually THREE annotations combined into one:
// 1. @Configuration     -> this class can define Spring beans
// 2. @ComponentScan     -> Spring will scan this package (and sub-packages)
//                          for @Controller, @Repository, @Service classes and register them
// 3. @EnableAutoConfiguration -> Spring guesses sensible defaults based on
//                          what's on your classpath (e.g. sees Thymeleaf jar -> configures a view resolver)
@SpringBootApplication
public class PortfolioApplication {

    public static void main(String[] args) {
        // This one line starts an embedded Tomcat server, wires up all your
        // beans (controllers, repositories, etc.), and gets the app listening
        // on port 8080 (default).
        SpringApplication.run(PortfolioApplication.class, args);
    }
}
