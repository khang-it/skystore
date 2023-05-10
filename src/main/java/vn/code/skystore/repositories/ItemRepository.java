package vn.code.skystore.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import vn.code.skystore.models.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
