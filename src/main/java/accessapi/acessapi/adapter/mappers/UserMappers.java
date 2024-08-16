package accessapi.acessapi.adapter.mappers;

import org.springframework.stereotype.Component;

import accessapi.acessapi.adapter.dtos.users.UserDto;
import accessapi.acessapi.adapter.dtos.users.UserDtoReturnig;
import accessapi.acessapi.core.domain.User;

@Component
public class UserMappers {
    

    public User mapperUserDomain( UserDto userDto) {
        return new User(
            userDto.getUser_id(),
            userDto.getUser_email(),
            userDto.getUser_password(),
            userDto.getUser_administrator()
        );
    }


    public UserDtoReturnig mapperUserDto (User user) {
        return new UserDtoReturnig(
            user.getUser_id(),
            user.getUser_emai(),
            null,
            user.getUser_administrator()
        );
    }
}
