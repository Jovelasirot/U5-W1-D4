package jovelAsirot.U5W1D4.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Beverage extends MenuItem {

    private String name;

    public Beverage(String name, int calories, double price) {
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
        return "Beverage{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}