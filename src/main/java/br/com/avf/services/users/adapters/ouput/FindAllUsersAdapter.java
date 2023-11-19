package br.com.avf.services.users.adapters.ouput;

import br.com.avf.services.users.adapters.ouput.repositories.UserRepository;
import br.com.avf.services.users.application.core.domain.User;
import br.com.avf.services.users.application.ports.output.FindAllUsersOutputGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static br.com.avf.services.users.application.core.domain.User.fromDocumentList;

@Service
@RequiredArgsConstructor
public class FindAllUsersAdapter implements FindAllUsersOutputGateway {

    private final UserRepository repository;

    @Override
    public List<User> findAll() {
        return fromDocumentList(this.repository.findAll());
    }
}
