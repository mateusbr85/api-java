package accessapi.acessapi.core.ports;

import accessapi.acessapi.core.domain.UserEntity;

public interface UserServicePort {
    UserEntity createUser(UserEntity user);
}
