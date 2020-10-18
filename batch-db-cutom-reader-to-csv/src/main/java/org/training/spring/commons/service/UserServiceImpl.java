package org.training.spring.commons.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.training.spring.commons.repository.UserRepository;
import org.training.spring.dto.ActeurDto;

import java.util.List;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    public List<ActeurDto> findActeur() {
        return userRepository.findAllV2();
    }
}
