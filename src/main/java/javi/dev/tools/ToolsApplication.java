package javi.dev.tools;

import javi.dev.tools.brain.InfoEntryPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class ToolsApplication {



	public static void main(String[] args) {
		SpringApplication.run(ToolsApplication.class, args);
	}


}
