package fr.iocean.sample.configuration;

import fr.iocean.framework.security.authentication.http.HttpBasicAuthentication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class SecurityTestConfiguration extends HttpBasicAuthentication {
}
