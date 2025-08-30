package com.example.webfluxdemo.service;

import com.example.webfluxdemo.model.User;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private final List<User> users = List.of(
            new User(UUID.randomUUID().toString(), "Alice", "alice@example.com"),
            new User(UUID.randomUUID().toString(), "Bob", "bob@example.com"),
            new User(UUID.randomUUID().toString(), "Charlie", "charlie@example.com")
    );

    public Flux<User> getAllUsers() {
        // Reactive non-blocking stream
        return Flux.fromIterable(users);
    }

    public Mono<User> getUserById(String id) {
        return Flux.fromIterable(users)
                   .filter(user -> user.id().equals(id))
                   .next();
    }
}
