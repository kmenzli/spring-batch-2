package org.training.spring.commons.service;

import org.training.spring.dto.ActeurDto;

import java.util.List;

public interface UserService {

    public List<ActeurDto> findActeur();
}
