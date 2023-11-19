package br.com.avf.services.users.application.core.domain;

import br.com.avf.services.users.adapters.ouput.repositories.document.UserDocument;

import java.util.List;
import java.util.UUID;

public record User(UUID id, String name, String profession) {
    public static User fromDocument(UserDocument document) {
        return new User(document.getId(), document.getName(), document.getProfession());
    }

    public static List<User> fromDocumentList(List<UserDocument> documents) {
        return documents.stream().map(User::fromDocument).toList();
    }

    public UserDocument toDocument() {
        return new UserDocument(this.id(), this.name(), this.profession());
    }
}
