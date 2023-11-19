package br.com.avf.services.users.application.core.usecases;

import br.com.avf.services.users.application.core.domain.User;
import br.com.avf.services.users.application.ports.input.FindUserByIdInputGateway;
import br.com.avf.services.users.application.ports.output.FindUserByIdOutputGateway;
import br.com.avf.services.users.application.validation.UserValidator;

import static br.com.avf.services.users.application.validation.UserValidator.isUserIdValid;

public class FindUserByIdUseCase implements FindUserByIdInputGateway {

    private final FindUserByIdOutputGateway findUserByIdOutputGateway;

    public FindUserByIdUseCase(FindUserByIdOutputGateway findUserByIdOutputGateway) {
        this.findUserByIdOutputGateway = findUserByIdOutputGateway;
    }

    @Override
    public User findById(String userId) {
        isUserIdValid(userId);
        return findUserByIdOutputGateway.findById(userId);
    }
}
