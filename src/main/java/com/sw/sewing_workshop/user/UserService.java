package com.sw.sewing_workshop.user;

import com.sw.sewing_workshop.user.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto getUserById(Long id);

    List<UserDto> getAllUsers();

    void deleteUserById(Long id);

    UserDto updateUser(UserDto user, Long id);

    UserDto createUser(UserDto user);

    User getUserForBookingMapper(Long id);
}
