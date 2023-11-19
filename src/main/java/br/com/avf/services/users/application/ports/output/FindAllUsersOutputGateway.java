package br.com.avf.services.users.application.ports.output;

import br.com.avf.services.users.application.core.domain.User;

import java.util.List;

public interface FindAllUsersOutputGateway {
    List<User> findAll();
}
