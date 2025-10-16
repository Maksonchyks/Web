package org.example.mushyn.user;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository repository;

//    @PostConstruct
//    public void init() {
//        // Ініціалізація стартових даних
//        List<User> users = new ArrayList<>();
//        users.add(new User("1","userFirstName1", "userLastName1", "userEmail1@gmail.com", "12345678", "user1"));
//        users.add(new User("3","userFirstName2", "userLastName2", "userEmail2@gmail.com", "87654321", "user2"));
//        users.add(new User("2","userFirstName3", "userLastName3", "userEmail3@gmail.com", "13247586", "user3"));
//
//        // Збереження у MongoDB
//        repository.saveAll(users);
//    }

    public List<User> getAll() {
        return repository.findAll();
    }

    public User getById(String id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }

    public User create(User user) {
        return repository.save(user);
    }

    public User update(User user) { // виправлено назву
        return repository.save(user);
    }
}
