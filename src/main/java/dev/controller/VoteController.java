package dev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.entity.Vote;
import dev.repository.VoteRepository;

@RestController
@RequestMapping("/vote")
@CrossOrigin
public class VoteController {

	@Autowired
	VoteRepository voteRepo;

	@GetMapping
	public List<Vote> listerCollegues() {
		return this.voteRepo.findAll();
	}
}
