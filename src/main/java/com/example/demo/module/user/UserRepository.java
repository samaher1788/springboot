package com.example.demo.module.user;

import org.springframework.data.jpa.repository.JpaRepository;

// not a public interface, which used only in user-package context
interface UserRepository extends JpaRepository<User, Long> {
}
