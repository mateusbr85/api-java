package accessapi.acessapi.infra;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import accessapi.acessapi.core.ports.UserRepositoryPort;
import accessapi.acessapi.core.ports.UserServicePort;
import accessapi.acessapi.core.services.UserService;

@Configuration
public class BeansConfig {

    @Bean
    public ModelMapper modelMapper () {
        return new ModelMapper();
    }

    @Bean
    public UserServicePort userServiceImpl(UserRepositoryPort userRepositoryPort) {
        return new UserService(userRepositoryPort);
    }
}