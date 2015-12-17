package fr.iocean.sample.configuration;

import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan("fr.iocean")
@EntityScan("fr.iocean")
@EnableJpaRepositories("fr.iocean")
public class ComponentScanConfiguration {
}
