package org.springboot.jpa.rest.Services;

import java.util.List;

import org.springboot.jpa.rest.entity.User;

public interface UserService {
	User createUser(User user);

    User getUserById(Long userId);

    List<User> getAllUsers();

    User updateUser(User user);

    void deleteUser(Long userId);
}
