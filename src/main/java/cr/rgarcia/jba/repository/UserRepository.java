package cr.rgarcia.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cr.rgarcia.jba.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
