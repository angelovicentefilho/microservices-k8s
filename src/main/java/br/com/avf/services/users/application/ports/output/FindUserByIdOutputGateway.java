package br.com.avf.services.users.application.ports.output;

import br.com.avf.services.users.application.core.domain.User;

public interface FindUserByIdOutputGateway {
    User findById(String userId);
}
