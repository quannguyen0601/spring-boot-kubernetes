package com.quan.demo.spring.kubernetes;

import com.quan.demo.spring.kubernetes.entity.User;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RequestMapping("/api")
@RestController
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @PostMapping(value = "/users")
    public User saveUsers(@RequestBody @Validated User user) {
        user.setCreatedDate(LocalDateTime.now());
        return userRepository.save(user);
    }
}
