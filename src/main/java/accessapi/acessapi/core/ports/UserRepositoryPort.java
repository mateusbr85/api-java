package accessapi.acessapi.core.ports;

import accessapi.acessapi.core.domain.User;

public interface UserRepositoryPort {
    public User create(User user);
}