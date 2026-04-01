package org.example;
import jakarta.persistence.*;
@Entity
@Table(name = "RestaurantTable")
public class RestaurantTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "table_name", nullable = false)
    private String table_name;
    @Column(name = " capacity")
    private int capacity;
    @Column(name = "is_available")
    private String is_available;
    public RestaurantTable() {}
    public RestaurantTable (String table_name, int capacity, String is_available) {
        this.table_name = table_name;
        this.capacity = capacity;
        this.is_available =is_available;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTable_name() {
        return table_name;
    }
    public void setTable_name(String table_name) {
        this.table_name = table_name;
    }
    public int getCapacity() {
        return this.capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public String getIs_available() {
        return is_available;
    }
    public void setIs_available(String is_available) {
        this.is_available = is_available;
    }
}
