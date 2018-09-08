package com.example.demo;

import org.springframework.data.repository.CrudRepository;

interface Users extends CrudRepository<User,Integer> {
}
