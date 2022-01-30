package com.example.demo.module.user;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {

        // usually we use final as best practice to prevent beans deletion, used in constructors and method invocations
        private final UserRepository repository;

        public UserService(final UserRepository repository) {
                this.repository = repository;
        }

        public User getUser(final Long id) {
                // read more about Optional<> in java
                return this.repository
                        .findById(id) // this will return Optional object, in case of data not found then will throw the error
                        .orElseThrow(() -> new  IllegalArgumentException("Id not found"));
        }

        public List<User> getUsers() {
                return this.repository.findAll();
        }

        @Transactional
        public User createUser(final User user) {
                return this.repository.save(user);
        }

        @Transactional
        public User updateUser(final User user) {
                this.repository
                        .findById(user.getId())
                        .orElseThrow(() -> new  IllegalArgumentException("Id not found"));
                return this.repository.save(user);
        }

}
