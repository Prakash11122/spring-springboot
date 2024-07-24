package in.saiprakash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot2AnnotationExConfig1Application {

	public static void main(String[] args) {
	ApplicationContext ac = SpringApplication.run(SpringBoot2AnnotationExConfig1Application.class, args);
	EmpExport e = ac.getBean("eob", EmpExport.class);
	System.out.println(e);
	}

}
