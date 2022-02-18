package codeploy.academy.courses;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.test.context.ContextConfiguration;

@SpringBootApplication
@EnableJpaAuditing
@ContextConfiguration
@EnableAutoConfiguration
public class CodeployAcademyCoursesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodeployAcademyCoursesApplication.class, args);
	}

}
