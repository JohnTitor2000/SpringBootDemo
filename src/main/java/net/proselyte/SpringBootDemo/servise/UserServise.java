package net.proselyte.SpringBootDemo.servise;

import net.proselyte.SpringBootDemo.model.User;
import net.proselyte.SpringBootDemo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServise {
    private final UserRepo userRepo;

    public UserServise(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User findById(Long id){
        return  userRepo.getOne(id);
    }

    public List<User> findAll() {
        return userRepo.findAll();
    }

    public User saveUser(User user) {
        return userRepo.save(user);
    }

    public void deleteById(Long id) {
        userRepo.deleteById(id);
    }
}
