package by.bntu.fitr.lytkina.repo;

import by.bntu.fitr.lytkina.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
