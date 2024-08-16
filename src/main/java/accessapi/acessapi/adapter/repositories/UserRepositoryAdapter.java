package accessapi.acessapi.adapter.repositories;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import accessapi.acessapi.adapter.entities.UserEntity;
import accessapi.acessapi.core.domain.User;
import accessapi.acessapi.core.ports.UserRepositoryPort;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class UserRepositoryAdapter implements UserRepositoryPort {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    @Override
    public User create(User user) {
        UserEntity entity =  modelMapper.map(user, UserEntity.class);
        UserEntity newUserSave = userRepository.save(entity);
        return modelMapper.map(newUserSave, User.class);
    }
}
