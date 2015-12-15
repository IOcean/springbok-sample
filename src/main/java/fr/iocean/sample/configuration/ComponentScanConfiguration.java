package fr.iocean.sample.configuration;

import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("fr.iocean")
@EntityScan("fr.iocean")
public class ComponentScanConfiguration {
}
