package org.nisum.demoMongoProj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoMongoProjApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoMongoProjApplication.class, args);
	}
}
