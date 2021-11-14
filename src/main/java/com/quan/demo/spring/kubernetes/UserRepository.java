package com.quan.demo.spring.kubernetes;

import com.quan.demo.spring.kubernetes.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
