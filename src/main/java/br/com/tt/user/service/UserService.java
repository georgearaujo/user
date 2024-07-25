package br.com.tt.user.service;

import br.com.tt.user.dto.User;
import br.com.tt.user.dto.Users;
import br.com.tt.user.repositry.UserRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Users getAllUsers() {
        return userRepository.findAllUsers();
    }

    public User getUserByExternalId(UUID id) {
        return userRepository.findByExternalId(id);
    }
}
