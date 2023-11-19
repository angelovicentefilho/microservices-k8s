package br.com.avf.services.users.config.usecases;

import br.com.avf.services.users.adapters.ouput.CreateUserAdapter;
import br.com.avf.services.users.application.core.usecases.CreateUserUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CreateUserUseCaseConfig {

    @Bean
    public CreateUserUseCase createUserUseCase(CreateUserAdapter createUserAdapter) {
        return new CreateUserUseCase(createUserAdapter);
    }

}
