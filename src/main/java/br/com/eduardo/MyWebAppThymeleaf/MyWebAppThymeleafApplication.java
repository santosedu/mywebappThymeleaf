package br.com.eduardo.MyWebAppThymeleaf;

import br.com.eduardo.MyWebAppThymeleaf.entities.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyWebAppThymeleafApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MyWebAppThymeleafApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user = new User();
		user.setEmail("dudaribeiro@santos.com");
		user.setFirstName("Eduarda");
		user.setLastName("Santos");
		user.setPassword("#12345678911");
		boolean enabled = user.isEnabled();

		User user1 = new User();
		user1.setEmail("dudaribeiro@santos.com");
		user1.setFirstName("Eduarda");
		user1.setLastName("Santos");
		user1.setPassword("#12345678911");
		boolean enabled2 = user1.isEnabled();

		User user3 = new User();
		user3.setEmail("eloahribeiro@santos.com");
		user3.setFirstName("Eloah");
		user3.setLastName("Santos");
		user3.setPassword("#soubencaotmb");
		boolean enabled3 = user3.isEnabled();

	}
}
