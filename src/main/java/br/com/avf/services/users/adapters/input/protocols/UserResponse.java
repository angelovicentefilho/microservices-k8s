package br.com.avf.services.users.adapters.input.protocols;

import br.com.avf.services.users.adapters.ouput.repositories.document.UserDocument;
import br.com.avf.services.users.application.core.domain.User;

import java.util.List;

public record UserResponse(String uuid, String name, String profession) {
    public static UserResponse fromDomain(User response) {
        return new UserResponse(response.id().toString(), response.name(), response.profession());
    }

    public static List<UserResponse> fromDomainList(List<User> users) {
        return users.stream().map(UserResponse::fromDomain).toList();
    }
}
