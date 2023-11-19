package br.com.avf.services.users.application.ports.output;

import br.com.avf.services.users.application.core.domain.User;

public interface CreateUserOutputGateway {
    User create(User user);
}
