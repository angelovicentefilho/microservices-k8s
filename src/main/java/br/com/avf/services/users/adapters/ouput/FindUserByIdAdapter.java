package br.com.avf.services.users.adapters.ouput;

import br.com.avf.services.users.adapters.ouput.repositories.UserRepository;
import br.com.avf.services.users.application.core.domain.User;
import br.com.avf.services.users.application.ports.output.FindUserByIdOutputGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class FindUserByIdAdapter implements FindUserByIdOutputGateway {

    private final UserRepository repository;

    @Override
    public User findById(String userId) {
        return User.fromDocument(this.repository.findById(UUID.fromString(userId))
                .orElseThrow(() -> new IllegalArgumentException("User not found!")));
    }
}
