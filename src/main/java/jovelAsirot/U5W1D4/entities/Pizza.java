package jovelAsirot.U5W1D4.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jovelAsirot.U5W1D4.enums.PizzaSize;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Pizza extends MenuItem {

    private String name;

    @ManyToMany
    @JoinTable(name = "pizza_toppings", joinColumns = @JoinColumn(name = "pizza_id"),
            inverseJoinColumns = @JoinColumn(name = "toppings_id"))
    private List<Topping> toppingList;

    private PizzaSize pizzaSize;

    public Pizza(String name, List<Topping> toppingList, int calories, double price, PizzaSize pizzaSize) {
        super(calories, price);
        this.name = name;
        this.toppingList = toppingList;
        this.pizzaSize = pizzaSize;
    }


    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", toppingList=" + toppingList +
                ", pizzaSize=" + pizzaSize +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}
