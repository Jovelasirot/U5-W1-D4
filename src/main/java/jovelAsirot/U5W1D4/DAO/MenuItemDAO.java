package jovelAsirot.U5W1D4.DAO;

import jovelAsirot.U5W1D4.entities.MenuItem;
import jovelAsirot.U5W1D4.entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuItemDAO extends JpaRepository<MenuItem, Long> {

    List<Pizza> findByNameIs(String name);

    List<Pizza> findByNameEquals(String name);

    @Query("SELECT p FROM Pizza p WHERE p.pizzaSize = 'XL' ")
    List<Pizza> filterPizzaXls();

}
