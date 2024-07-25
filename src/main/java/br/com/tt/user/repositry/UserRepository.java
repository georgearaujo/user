package br.com.tt.user.repositry;


import br.com.tt.user.dto.User;
import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.util.UUID;

@Component
public class UserRepository {

    public User findByExternalId(UUID id) {
        return buildUser();
    }

    private User buildUser() {
        return new User(BigInteger.ONE, UUID.randomUUID(), "George", "123");
    }
}
