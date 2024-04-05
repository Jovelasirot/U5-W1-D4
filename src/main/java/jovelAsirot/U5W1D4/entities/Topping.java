package jovelAsirot.U5W1D4.entities;


import jakarta.persistence.*;
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
    @ManyToMany(mappedBy = "toppings")
    private List<Pizza> pizzasList;

    public Topping(String name, int calories, double price) {
        super(calories, price);
        this.name = name;
    }

    @Override
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return super.getId();
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
