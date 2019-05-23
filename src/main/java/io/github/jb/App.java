package io.github.jb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class App implements CommandLineRunner {

	private static Logger logger = LoggerFactory.getLogger(App.class);

	public static void main(final String[] args) {
		new SpringApplicationBuilder(App.class).run(args);
	}

	@Override
	public void run(final String... args) throws Exception {

		logger.info("Started");
	}

}
