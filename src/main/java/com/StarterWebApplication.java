//package com.jorge.starterweb;
package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("web")
@SpringBootApplication
public class StarterWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(StarterWebApplication.class, args);
	}

}
