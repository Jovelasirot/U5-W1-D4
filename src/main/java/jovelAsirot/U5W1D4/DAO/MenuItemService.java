package jovelAsirot.U5W1D4.DAO;

import jovelAsirot.U5W1D4.entities.MenuItem;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class MenuItemService {

    @Autowired
    private MenuItemDAO miDAO;

    public void save(MenuItem menuItem) {
        miDAO.save(menuItem);
        log.info("Menu item saved correctly");
    }

    public List<MenuItem> findAll() {
        return miDAO.findAll();
    }
}
