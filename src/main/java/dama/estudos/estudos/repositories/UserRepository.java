package dama.estudos.estudos.repositories;

import dama.estudos.estudos.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
