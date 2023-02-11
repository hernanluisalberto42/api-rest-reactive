package com.example.reacive.demoreactive.repository;

import com.example.reacive.demoreactive.model.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface UserRepository extends ReactiveCrudRepository<User,Integer> {
    Flux<User> findByAge(Integer age);
}
