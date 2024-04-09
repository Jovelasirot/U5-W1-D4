package jovelAsirot.U5W1D4.entities;

import jakarta.persistence.Table;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "menu_items")
@NoArgsConstructor
@Getter
@Setter
@ToString
public abstract class MenuItem {

    protected int calories;

    protected double price;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id;

    public MenuItem(int calories, double price) {
        this.calories = calories;
        this.price = price;
    }
}