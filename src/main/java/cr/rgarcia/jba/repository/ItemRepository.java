package cr.rgarcia.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cr.rgarcia.jba.entity.Item;;

public interface ItemRepository extends JpaRepository<Item, Integer>{

}
