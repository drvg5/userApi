package com.practice.user.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practice.user.model.UserRepo;
import com.practice.user.service.UserRepoService;

@RestController
public class UserRepoController {

	@Autowired
	UserRepoService userRepoService;

	@PostMapping("/users")
	UserRepo createOb(@RequestBody UserRepo user) {
		return userRepoService.save(user);
	}

	@GetMapping("/users")
	Iterable<UserRepo> findAllUsers() {
		return userRepoService.findAll();
	}

	@PutMapping("/users")
	UserRepo updateUser(@RequestBody UserRepo user) {
		return userRepoService.save(user);
	}

	@GetMapping("/users/findById/{id}")
	Optional<UserRepo> getUser(@PathVariable Integer id) {
		return userRepoService.findById(id);
	}

	@GetMapping("/users/findByAccess")
	Iterable<UserRepo> findUser(@RequestParam(value="accessParam", required = true)  List<String> accessParamList) {

		ArrayList<UserRepo> usrListFinal = new ArrayList<UserRepo>();

		for (String userLvl : accessParamList) {
			usrListFinal.addAll((Collection<? extends UserRepo>) userRepoService.findByUserAccessLevel(userLvl));
		}
		return usrListFinal;

	}

}
