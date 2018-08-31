package models;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Pizza")
public class Pizza {


    private String id;
    private String size;
    private Integer price;


    public Pizza() {
    }


    public Pizza(String id, String size, Integer price) {
        this.id = id;
        this.size = size;
        this.price = price;

    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }



}
