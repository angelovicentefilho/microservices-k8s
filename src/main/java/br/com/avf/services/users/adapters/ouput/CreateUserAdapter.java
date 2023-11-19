package br.com.avf.services.users.adapters.ouput;

import br.com.avf.services.users.adapters.ouput.repositories.UserRepository;
import br.com.avf.services.users.application.core.domain.User;
import br.com.avf.services.users.application.ports.output.CreateUserOutputGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

import static br.com.avf.services.users.application.core.domain.User.fromDocument;
import static java.util.Objects.isNull;

@Service
@RequiredArgsConstructor
public class CreateUserAdapter implements CreateUserOutputGateway {

    private final UserRepository repository;

    @Override
    public User create(User user) {
        return fromDocument(this.repository.save(user.toDocument()));
    }
}
