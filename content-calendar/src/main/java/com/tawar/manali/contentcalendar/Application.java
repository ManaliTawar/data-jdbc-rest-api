package com.tawar.manali.contentcalendar;

import com.tawar.manali.contentcalendar.config.ContentCalendarProperties;
import com.tawar.manali.contentcalendar.model.Content;
import com.tawar.manali.contentcalendar.model.Status;
import com.tawar.manali.contentcalendar.model.Type;
import com.tawar.manali.contentcalendar.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
@EnableConfigurationProperties(ContentCalendarProperties.class)
@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}
		@Bean
		CommandLineRunner commandLineRunner(ContentRepository repository){
			return args -> {
				Content content=new Content(null,"My first postconstruct in Main Application", "postconstruct desc", Status.IDEA,
						Type.ARTICLE, LocalDateTime.now(),null,"");
				repository.save(content);

			};

		}

}
