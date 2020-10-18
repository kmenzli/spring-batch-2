package org.training.spring.commons.repository;

import org.training.spring.dto.ActeurDto;

import java.util.List;

public interface UserRepository {
    List<ActeurDto> findAllV2();
}
