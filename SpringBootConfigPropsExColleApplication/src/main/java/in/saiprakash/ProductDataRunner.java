package in.saiprakash;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "my.app")
public class ProductDataRunner implements CommandLineRunner {
	
	private List<String> colors;
	
	private Set<String> codes;
	
	private String[] model;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("DONE");
		System.out.println(this);
		
	}

	public List<String> getColors() {
		return colors;
	}
	

	public void setColors(List<String> colors) {
		this.colors = colors;
	}
	

	public Set<String> getCodes() {
		return codes;
	}

	public void setCodes(Set<String> codes) {
		this.codes = codes;
	}

	public String[] getModel() {
		return model;
	}

	public void setModel(String[] model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "ProductDataRunner [colors=" + colors + ", codes=" + codes + ", model=" + Arrays.toString(model) + "]";
	}
	
	

}
