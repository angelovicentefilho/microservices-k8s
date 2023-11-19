package br.com.avf.services.users.adapters.input.controllers;

import br.com.avf.services.users.adapters.input.protocols.UserResponse;
import br.com.avf.services.users.adapters.ouput.repositories.document.UserDocument;
import br.com.avf.services.users.application.ports.output.FindAllUsersOutputGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
public class FindAllUsersController {

    private final FindAllUsersOutputGateway findAllUsersOutputGateway;

    @GetMapping
    public ResponseEntity<List<UserResponse>> findAll() {
        var users = findAllUsersOutputGateway.findAll();
        return ResponseEntity.ok(UserResponse.fromDomainList(users));
    }

}
