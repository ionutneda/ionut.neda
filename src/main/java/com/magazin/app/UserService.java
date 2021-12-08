package com.magazin.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUseri(){
        List<User> useri = new ArrayList<>();
        userRepository.findAll().forEach(useri::add);
        return useri;
    }

    public User getUser(Long id) {
        return userRepository.findById(id).get();
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    // nesigur
    public void updateUser(Long id, User user) {
        userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
