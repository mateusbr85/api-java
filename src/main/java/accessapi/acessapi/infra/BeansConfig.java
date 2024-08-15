package accessapi.acessapi.infra;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import accessapi.acessapi.core.ports.UserServicePort;
import accessapi.acessapi.core.services.UserService;

@Configuration
public class BeansConfig {

    @Bean
    public UserServicePort userServiceImpl() {
        return new UserService();
    }
}