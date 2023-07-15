package de.liehrit.legocollectorapi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class LegocollectorapiApplication {
	public static void main(String[] args) {
		SpringApplication.run(LegocollectorapiApplication.class, args);
	}
}
