package in.saiprakash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot2AnnotationExOneApplication {

	public static void main(String[] args) {
	ApplicationContext ac = SpringApplication.run(SpringBoot2AnnotationExOneApplication.class, args);
	
	Product p = ac.getBean("pod", Product.class);
	p.display();
	}

}
