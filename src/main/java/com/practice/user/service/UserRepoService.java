package com.practice.user.service;

import org.springframework.data.repository.CrudRepository;

import com.practice.user.model.UserRepo;

public interface UserRepoService extends CrudRepository<UserRepo, Integer> {

	Iterable<UserRepo> findByUserAccessLevel(String access);
}
