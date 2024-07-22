package in.saiprakash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot2AnnotationExThreeApplication {

	public static void main(String[] args) {
	ApplicationContext ac = SpringApplication.run(SpringBoot2AnnotationExThreeApplication.class, args);
	
	Employee ec = ac.getBean("eob", Employee.class);
	System.out.println(ec);
	}

}
