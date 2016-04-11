package fr.iocean.sample.configuration;

import fr.iocean.framework.security.authentication.http.HttpBasicAuthentication;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Slf4j
@Configuration
@Profile("!test")
public class SecurityConfiguration extends HttpBasicAuthentication {
}
