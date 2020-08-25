package net.proselyte.SpringBootDemo.repo;

import net.proselyte.SpringBootDemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepo extends JpaRepository<User, Long> {

}
