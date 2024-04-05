package jovelAsirot.U5W1D4;

import com.github.javafaker.Faker;
import jovelAsirot.U5W1D4.DAO.MenuItemService;
import jovelAsirot.U5W1D4.entities.Topping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MenuItemRunner implements CommandLineRunner {
    @Autowired
    private MenuItemService menuItemService;

    @Override
    public void run(String... args) throws Exception {

        Faker faker = new Faker();
        Random rdm = new Random();

        Topping topping = new Topping(faker.dragonBall().character() + "' pizza", rdm.nextInt(10, 200), rdm.nextDouble(1.50, 3.50));

        menuItemService.save(topping);


    }


}
