package Students;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@EnableElasticsearchRepositories(basePackages = "Students.Repository")
@ComponentScan(basePackages = {"Students"})
public class StudentsReportingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentsReportingSystemApplication.class, args);
	}

}
