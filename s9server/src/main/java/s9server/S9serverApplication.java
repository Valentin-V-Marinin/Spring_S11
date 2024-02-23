package s9server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class S9serverApplication {

	public static void main(String[] args) {
		SpringApplication.run(S9serverApplication.class, args);
	}

}
