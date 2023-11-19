package br.com.avf.services.users.config.usecases;

import br.com.avf.services.users.adapters.ouput.FindUserByIdAdapter;
import br.com.avf.services.users.application.core.usecases.FindUserByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindUserByIdUseCaseConfig {

    @Bean
    public FindUserByIdUseCase findUserByIdUseCase(FindUserByIdAdapter adapter) {
        return new FindUserByIdUseCase(adapter);
    }
}
