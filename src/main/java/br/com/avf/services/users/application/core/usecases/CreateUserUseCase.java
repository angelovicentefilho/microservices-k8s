package br.com.avf.services.users.application.core.usecases;

import br.com.avf.services.users.application.core.domain.User;
import br.com.avf.services.users.application.ports.input.CreateUserInputGateway;
import br.com.avf.services.users.application.ports.output.CreateUserOutputGateway;

import static br.com.avf.services.users.application.validation.UserValidator.isValid;

public class CreateUserUseCase implements CreateUserInputGateway {

    private final CreateUserOutputGateway createUserOutputGateway;

    public CreateUserUseCase(CreateUserOutputGateway createUserOutputGateway) {
        this.createUserOutputGateway = createUserOutputGateway;
    }

    @Override
    public User create(User user) {
        isValid(user);
        return createUserOutputGateway.create(user);
    }

}
