package com.example.reacive.demoreactive.repository;

import com.example.reacive.demoreactive.model.Department;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface DepartmentRepository extends ReactiveCrudRepository<Department,Integer> {
    Mono<Department> findByUserId(Integer userId);
}
