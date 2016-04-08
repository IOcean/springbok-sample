package fr.iocean.sample.configuration;

import fr.iocean.framework.security.authentication.form.FormAuthentication;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Slf4j
@Configuration
@Profile("!test")
public class SecurityConfiguration extends FormAuthentication {
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        super.configure(http);
        
        http
            .csrf()
            .disable();
    }
}
