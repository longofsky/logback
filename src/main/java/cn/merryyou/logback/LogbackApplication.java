package cn.merryyou.logback;

import cn.merryyou.logback.repository.MerryyouRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(scanBasePackages = {"cn.merryyou.logback"})
@EnableScheduling
@EnableJpaAuditing
@EnableJpaRepositories(basePackages = {"cn.merryyou.logback"})
public class LogbackApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogbackApplication.class, args);
	}
}
