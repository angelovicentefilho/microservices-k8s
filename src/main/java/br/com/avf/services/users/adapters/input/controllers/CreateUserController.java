package br.com.avf.services.users.adapters.input.controllers;

import br.com.avf.services.users.adapters.input.protocols.UserRequest;
import br.com.avf.services.users.adapters.input.protocols.UserResponse;
import br.com.avf.services.users.application.ports.input.CreateUserInputGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
public class CreateUserController {

    private final CreateUserInputGateway createUserInputGateway;


    @PostMapping
    public ResponseEntity<UserResponse> create(@RequestBody UserRequest request) {
        var response = createUserInputGateway.create(request.toDomain());
        return ResponseEntity.ok(UserResponse.fromDomain(response));
    }

}
