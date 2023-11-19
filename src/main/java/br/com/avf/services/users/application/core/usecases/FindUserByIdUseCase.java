package br.com.avf.services.users.application.core.usecases;

import br.com.avf.services.users.application.core.domain.User;
import br.com.avf.services.users.application.ports.input.FindUserByIdInputGateway;
import br.com.avf.services.users.application.ports.output.FindUserByIdOutputGateway;

public class FindUserByUserIdUseCase implements FindUserByIdInputGateway {

    private final FindUserByIdOutputGateway findUserByIdOutputGateway;

    @Override
    public User findById(String userId) {
        return null;
    }
}
