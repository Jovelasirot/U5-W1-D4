package jovelAsirot.U5W1D4.entities;

import jakarta.persistence.*;
import lombok.*;


@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Table {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id;

    private int tableNumber;

    private int maxSeats;

    private boolean occupied;

    private double tableCharge;

    @OneToOne(mappedBy = "table")
    private Order order;

    public Table(int i, int i1, boolean b, double seatPrice) {
    }

    @Override
    public String toString() {
        return "Table{" +
                "tableNumber=" + tableNumber +
                ", maxSeats=" + maxSeats +
                ", occupied=" + occupied +
                ", tableCharge=" + tableCharge +
                '}';
    }
}
