package accessapi.acessapi.adapter.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import accessapi.acessapi.core.ports.UserServicePort;
import accessapi.acessapi.adapter.dtos.users.UserDto;
import accessapi.acessapi.adapter.dtos.users.UserDtoReturnig;
import accessapi.acessapi.adapter.mappers.UserMappers;
import accessapi.acessapi.core.domain.UserEntity;

@RestController
@RequestMapping("api/users")
public class UserController {

    private final UserServicePort userServicePort;
    private final UserMappers userMappers;

    public UserController(UserServicePort userServicePort, UserMappers userMappers) {
        this.userServicePort = userServicePort;
        this.userMappers = userMappers;
    }
    
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public UserDtoReturnig create(@RequestBody UserDto userDto) {
        UserEntity newUser = userMappers.mapperUserDomain(userDto);
        UserEntity creteNewUser = userServicePort.createUser(newUser);
        UserDtoReturnig returnigUser = userMappers.mapperUserDto(creteNewUser);
        return returnigUser;
    }
}
