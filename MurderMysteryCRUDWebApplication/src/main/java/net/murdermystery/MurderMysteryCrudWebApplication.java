package net.murdermystery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author jackb
 * The main class that starts the Murder Mystery CRUD web application.
 */
@SpringBootApplication
public class MurderMysteryCrudWebApplication {

	/**
     * The main method that starts the application.
     *
     * @param args the command line arguments
     */
	public static void main(String[] args) {
		SpringApplication.run(MurderMysteryCrudWebApplication.class, args);
	}

}
