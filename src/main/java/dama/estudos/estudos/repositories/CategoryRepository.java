package dama.estudos.estudos.repositories;

import dama.estudos.estudos.entities.Category;
import dama.estudos.estudos.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
