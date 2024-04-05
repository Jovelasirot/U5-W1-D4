package jovelAsirot.U5W1D4.entities;

import jakarta.persistence.*;
import jovelAsirot.U5W1D4.enums.OrderStatus;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;


@Entity
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id;

    private int orderNumber;

    private OrderStatus status;

    private int numberOfSeats;

    private LocalDate acquisitionTime;

    private List<MenuItem> menuItemsOrdered;

    private double totalAmount;

    @ManyToOne
    @JoinColumn(name = "table_id")
    private Table table;

    public Order(int numberOfSeats, Table table) {
        this.numberOfSeats = numberOfSeats;
        this.table = table;
    }


    public void addItem(MenuItem item) {
        this.menuItemsOrdered.add(item);
    }

    public double getTotal() {
        return this.menuItemsOrdered.stream().mapToDouble(MenuItem::getPrice).sum() + (this.table.getTableCharge() * this.numberOfSeats);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", status=" + status +
                ", numberOfSeats=" + numberOfSeats +
                ", acquisitionTime=" + acquisitionTime +
                ", menuItemsOrdered=" + menuItemsOrdered +
                ", totalAmount=" + totalAmount +
                ", table=" + table +
                '}';
    }

    public void print() {
        System.out.println("Id of order: " + this.orderNumber);
        System.out.println("Order status: " + this.status);
        System.out.println("Number of seats: " + this.numberOfSeats);
        System.out.println("Date of acquisition: " + this.acquisitionTime);
        System.out.println("Table Number " + this.table.getTableNumber());
        System.out.println("Items ordered: ");
        this.menuItemsOrdered.forEach(System.out::println);
        System.out.println();
        System.out.println("Total: " + this.getTotal());

    }
}
