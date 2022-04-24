package Celebarity;

public class Product {

    private Integer id;
    private String name;
    private String description;
    private String status;


    public Product(String name, String description, String status) {
        this.name = name;
        this.description = description;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }


}
