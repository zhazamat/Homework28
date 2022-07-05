import java.util.Date;

public class Product {
    private Integer id;
    private String productName;
    private Date releaseProduct;
    private Date shelfLife;
    private Integer quantity;
    private Integer cost;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Date getReleaseProduct() {
        return releaseProduct;
    }

    public void setReleaseProduct(Date releaseProduct) {
        this.releaseProduct = releaseProduct;
    }

    public Date getShelfLife() {
        return shelfLife;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setShelfLife(Date shelfLife) {
        this.shelfLife = shelfLife;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", releaseProduct=" + releaseProduct +
                ", shelfLife=" + shelfLife +
                ", quantity=" + quantity +
                ", cost=" + cost +
                '}';
    }
}
