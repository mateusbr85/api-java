package accessapi.acessapi.adapter.mappers;

import org.springframework.stereotype.Component;

import accessapi.acessapi.adapter.dtos.users.UserDto;
import accessapi.acessapi.adapter.dtos.users.UserDtoReturnig;
import accessapi.acessapi.core.domain.UserEntity;

@Component
public class UserMappers {
    

    public UserEntity mapperUserDomain( UserDto userDto) {
        return new UserEntity(
            userDto.getUser_id(),
            userDto.getUser_email(),
            userDto.getUser_password(),
            userDto.getUser_administrator()
        );
    }


    public UserDtoReturnig mapperUserDto (UserEntity userEntity) {
        return new UserDtoReturnig(
            userEntity.getUser_id(),
            userEntity.getUser_emai(),
            null,
            userEntity.getUser_administrator()
        );
    }
}
