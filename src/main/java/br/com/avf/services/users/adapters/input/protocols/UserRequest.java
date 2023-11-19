package br.com.avf.services.users.adapters.input.protocols;

import br.com.avf.services.users.application.core.domain.User;

import java.util.UUID;

public record UserRequest(String uuid, String name, String profession) {
    public User toDomain() {
        return new User(hasId(uuid), name, profession);
    }

    private UUID hasId(String uuid) {
        return (uuid != null && !uuid.isBlank()) ? UUID.fromString(uuid) : UUID.randomUUID();
    }
}
