package br.com.avf.services.users.application.ports.input;

import br.com.avf.services.users.application.core.domain.User;

public interface CreateUserInputGateway {
    User create(User user);
}
