package com.example.adminservice;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NikhilAdminserviceApplication {

	public static void main(String[] args) {
		
		SpringApplication app = new SpringApplication(NikhilAdminserviceApplication.class);
        app.setDefaultProperties(Collections
          .singletonMap("server.port", "8080"));
        app.setDefaultProperties(Collections
                .singletonMap("spring.datasource.url", "jdbc:mysql://localhost:3306/bankproject"));
//        spring.datasource.url=jdbc:mysql://localhost:3306/bankproject
        app.setDefaultProperties(Collections
                .singletonMap("spring.datasource.driver-class-name", "com.mysql.cj.jdbc.Driver"));
//        	spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
        app.setDefaultProperties(Collections
                .singletonMap("spring.datasource.username", "root"));
//        	spring.datasource.username=root
        app.setDefaultProperties(Collections
                .singletonMap("spring.datasource.password", "Rps@12345"));
//        	spring.datasource.password=Rps@12345
        app.setDefaultProperties(Collections
                .singletonMap("spring.jpa.hibernate.ddl-auto", "update"));
//        	spring.jpa.hibernate.ddl-auto=update
//        app.setDefaultProperties(Collections
//                .singletonMap("server.port", "8087"));
//        app.setDefaultProperties(Collections
//                .singletonMap("spring.application.name", "comments-service"));
        app.run(args);
//		SpringApplication.run(NikhilAdminserviceApplication.class, args);
	}

}
