package jovelAsirot.U5W1D4.DAO;

import jovelAsirot.U5W1D4.entities.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuItemDAO extends JpaRepository<MenuItem, Long> {


}
