package accessapi.acessapi.core.ports;

import accessapi.acessapi.core.domain.User;

public interface UserServicePort {
    User createUser(User user);
}
