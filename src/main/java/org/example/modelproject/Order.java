package org.example.modelproject;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {

    private long id;
    private long customerId;

    public Order() {
    }

    public Order(long customerId) {
        this.customerId = customerId;
    }

    @Id
    @Column(name = "order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "customer_id")
    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "org.example.model.Order{" +
                "id='" + id + '\'' +
                ", customerId='" + customerId + '\'' +
                '}';
    }
}
