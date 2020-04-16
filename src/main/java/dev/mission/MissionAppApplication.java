package dev.mission;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author 20-100
 *
 */
@SpringBootApplication
public class MissionAppApplication {

	public static void main(String[] args) {
		// creation context
		ConfigurableApplicationContext context = SpringApplication.run(MissionAppApplication.class, args);

		// recuperation bean
		Runnable exec = context.getBean(Runnable.class);

		// execution
		exec.run();

	}

}
