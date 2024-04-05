package jovelAsirot.U5W1D4.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@NoArgsConstructor
@MappedSuperclass
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