package s9user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class S9userApplication {

	public static void main(String[] args) {
		SpringApplication.run(S9userApplication.class, args);
	}

}
