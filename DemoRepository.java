package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Demo;

@Repository
public interface DemoRepository extends CrudRepository<Demo , Integer>{

}
