package jovelAsirot.U5W1D4;

import jovelAsirot.U5W1D4.entities.Beverage;
import jovelAsirot.U5W1D4.entities.Pizza;
import jovelAsirot.U5W1D4.entities.Table;
import jovelAsirot.U5W1D4.entities.Topping;
import jovelAsirot.U5W1D4.enums.PizzaSize;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("application.properties")
public class AppConfig {
    @Bean(name = "toppings_tomato")
    public Topping toppingTomatoBean() {
        return new Topping("Tomato", 0, 0);
    }

    @Bean(name = "toppings_cheese")
    public Topping toppingCheeseBean() {
        return new Topping("Cheese", 92, 0.69);
    }

    @Bean(name = "toppings_ham")
    public Topping toppingHamBean() {
        return new Topping("Ham", 35, 0.99);
    }

    @Bean(name = "toppings_pineapple")
    public Topping toppingPineappleBean() {
        return new Topping("Pineapple", 24, 0.79);
    }

    @Bean(name = "toppings_salami")
    public Topping toppingSalamiBean() {
        return new Topping("Salami", 86, 0.99);
    }


    @Bean(name = "pizza_margherita")
    public Pizza pizzaMargheritaBean() {
        List<Topping> tList = new ArrayList<>();
        tList.add(toppingTomatoBean());
        tList.add(toppingCheeseBean());
        return new Pizza("Pizza Margherita", tList, 700, 7.50, PizzaSize.XL);
    }

    @Bean(name = "hawaiian_pizza")
    public Pizza pizzaHawaiianBean() {
        List<Topping> tList = new ArrayList<>();
        tList.add(toppingTomatoBean());
        tList.add(toppingCheeseBean());
        tList.add(toppingHamBean());
        tList.add(toppingPineappleBean());
        return new Pizza("Hawaiian Pizza", tList, 700, 7.50, PizzaSize.XL);
    }

    @Bean(name = "salami_pizza")
    public Pizza pizzaSalamiBean() {
        List<Topping> tList = new ArrayList<>();
        tList.add(toppingTomatoBean());
        tList.add(toppingCheeseBean());
        tList.add(toppingSalamiBean());
        return new Pizza("Salami Pizza", tList, 700, 7.50, PizzaSize.XL);
    }

    @Bean(name = "salami_pizza_xl")
    public Pizza pizzaSalamiXlBean() {
        List<Topping> tList = new ArrayList<>();
        tList.add(toppingTomatoBean());
        tList.add(toppingCheeseBean());
        tList.add(toppingSalamiBean());
        return new Pizza("Salami Pizza XL", tList, 700, 7.50, PizzaSize.M);
    }

    @Bean(name = "lemonade")
    public Beverage lemonadeBean() {
        return new Beverage("Lemonade", 128, 1.29);
    }

    @Bean(name = "water")
    public Beverage waterBean() {
        return new Beverage("Water", 0, 1.29);
    }

    @Bean(name = "wine")
    public Beverage wineBean() {
        return new Beverage("Wine", 607, 7.49);
    }

    @Bean("pizzas")
    List<Pizza> pizzaList() {
        List<Pizza> pizzas = new ArrayList<>();
        pizzas.add(pizzaMargheritaBean());
        pizzas.add(pizzaHawaiianBean());
        pizzas.add(pizzaSalamiBean());
        pizzas.add(pizzaSalamiXlBean());
        return pizzas;
    }

    @Bean("drinks")
    List<Beverage> drinksList() {
        List<Beverage> drinks = new ArrayList<>();
        drinks.add(lemonadeBean());
        drinks.add(waterBean());
        drinks.add(wineBean());
        return drinks;
    }

    @Bean("toppings")
    List<Topping> toppingsList() {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(toppingTomatoBean());
        toppings.add(toppingCheeseBean());
        toppings.add(toppingSalamiBean());
        toppings.add(toppingHamBean());
        toppings.add(toppingPineappleBean());
        return toppings;
    }

    @Bean("Tavolo1")
    Table getTable1(@Value("${seat.price}") double seatPrice) {
        return new Table(1, 5, true, seatPrice);
    }

    @Bean("Tavolo2")
    Table getTable2(@Value("${seat.price}") double seatPrice) {
        return new Table(2, 4, true, seatPrice);
    }

    @Bean("Tavolo3")
    Table getTable3(@Value("${seat.price}") double seatPrice) {
        return new Table(3, 8, true, seatPrice);
    }
}
