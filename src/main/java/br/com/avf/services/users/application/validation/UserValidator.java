package br.com.avf.services.users.application.validation;

import br.com.avf.services.users.application.core.domain.User;
import lombok.experimental.UtilityClass;

import java.util.UUID;

import static java.util.Objects.nonNull;

@UtilityClass
public class UserValidator {

    public static void isValid(User user) {
        var isValid = nonNull(user)
                && nonNull(user.id())
                && nonNull(user.name())
                && nonNull(user.profession());
        if (!isValid) {
            throw new IllegalArgumentException("User not valid. All fields required!");
        }
    }

    public static void isUserIdValid(String userId) {
        try {
            UUID.fromString(userId);
        } catch (Exception e) {
            throw new IllegalArgumentException("UUID not valid!");
        }
    }
}
