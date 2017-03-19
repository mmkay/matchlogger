package pl.mmkay.matchlogger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

@EntityScan(
		basePackageClasses = { MatchloggerApplication.class, Jsr310JpaConverters.class }
)
@SpringBootApplication
public class MatchloggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MatchloggerApplication.class, args);
	}
}
