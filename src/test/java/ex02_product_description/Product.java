package ex02_product_description;

public class Product {
    private String name;
    private Integer size;
    private Double percentage;

    public String productDescription() {
        if (name == null) return null;
        if (size == null && percentage == null) return "";
        if (percentage == null) return "." + size + "CL";
        return " . " + String.format("%.0f%%",percentage);
    }

    public Product(String name, Integer size, Double percentage) {
        this.name = name;
        this.size = size;
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }
}
