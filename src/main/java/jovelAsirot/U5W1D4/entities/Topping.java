package jovelAsirot.U5W1D4.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Topping extends MenuItem {

    private String name;

    //    @ManyToMany(mappedBy = "toppings")

    @ManyToMany(mappedBy = "toppingList")
    private List<Pizza> pizzasList;

    public Topping(String name, int calories, double price) {
        super(calories, price);
        this.name = name;
    }


    @Override
    public String toString() {
        return "Topping{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}
