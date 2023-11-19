package br.com.avf.services.users.adapters.input.controllers;

import br.com.avf.services.users.adapters.input.protocols.UserResponse;
import br.com.avf.services.users.adapters.ouput.repositories.UserRepository;
import br.com.avf.services.users.application.ports.input.FindUserByIdInputGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static br.com.avf.services.users.adapters.input.protocols.UserResponse.fromDomain;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
public class FindUserByIdController {

    private final FindUserByIdInputGateway findUserByIdInputGateway;

    @GetMapping("/{userId}")
    public ResponseEntity<UserResponse> findByUserId(@PathVariable String userId) {
        return ResponseEntity.ok(fromDomain(findUserByIdInputGateway.findById(userId)));
    }

}
