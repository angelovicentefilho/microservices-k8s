package br.com.avf.services.users.adapters.ouput.repositories;

import br.com.avf.services.users.adapters.ouput.repositories.document.UserDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends MongoRepository<UserDocument, UUID> {
}
