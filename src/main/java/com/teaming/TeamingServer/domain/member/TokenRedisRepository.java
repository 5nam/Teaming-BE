package com.teaming.TeamingServer.domain.member;

import org.springframework.data.repository.CrudRepository;

public interface TokenRedisRepository extends CrudRepository<String, String> {
}
