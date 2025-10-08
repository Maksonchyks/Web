package org.example.mushyn.user;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@AllArgsConstructor
public class UserController {

    private final UserService service;

    @GetMapping
    public List<User> getUsers() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public User getOneUser(@PathVariable String id) {
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        service.deleteById(id);
    }

    @PostMapping
    public User create(@RequestBody User user) {
        return service.create(user);
    }

    @PutMapping
    public User uptade(@RequestBody User user) {
        return service.update(user);
    }






}