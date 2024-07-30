package in.saiprakash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootSchedulingExOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSchedulingExOneApplication.class, args);
	}

}
