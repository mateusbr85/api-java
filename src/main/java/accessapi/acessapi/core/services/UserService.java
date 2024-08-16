package accessapi.acessapi.core.services;

import accessapi.acessapi.core.domain.User;
import accessapi.acessapi.core.ports.UserRepositoryPort;
import accessapi.acessapi.core.ports.UserServicePort;

public class UserService implements UserServicePort {

    private final UserRepositoryPort userRepositoryPort;

    public UserService(UserRepositoryPort userRepositoryPort) {
        this.userRepositoryPort = userRepositoryPort;
    }

    @Override
    public User createUser(User user) {
        return userRepositoryPort.create(user);
    }
}
