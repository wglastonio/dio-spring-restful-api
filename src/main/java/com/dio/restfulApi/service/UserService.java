package com.dio.restfulApi.service;

import com.dio.restfulApi.domain.models.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
