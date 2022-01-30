package com.example.demo.module.user;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

        // usually we use final as best practice to prevent beans deletion, used in constructors and method invocations
        private final UserService service;

        public UserController(final UserService service) {
                this.service = service;
        }

        @GetMapping("/{id}")
        public User getMapping(@PathVariable final Long id) {
                return this.service.getUser(id);
        }

        @GetMapping
        public List<User> getMapping() {
                return this.service.getUsers();
        }

        @PostMapping
        public User postMapping(@RequestBody final User user) {
                return this.service.createUser(user);
        }

        @PutMapping
        public User putMapping(@RequestBody final User user) {
                return this.service.updateUser(user);
        }
}
