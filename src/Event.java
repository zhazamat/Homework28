import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Event implements Comparable {
    private Integer id;
    private String product;
    private Integer quantity;
    private Integer deliveryCost;

    public Integer getDeliveryCost() {

        return deliveryCost;
    }

    public void setDeliveryCost(Integer deliveryCost) {
        this.deliveryCost = deliveryCost;
    }

    public Integer getQuantity() {

        quantity = (int) (Math.random() * (10 - 1 + 1) + 1);

        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    private City city;
    private Integer distance;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {

        this.product = product;
    }

    public City getCity() {
        City[] cities = new City[4];
        Random random = new Random();

        for (int i = 0; i < cities.length; i++) {
            i = random.nextInt(cities.length);
            switch (i) {
                case 1:
                    return City.Bishkek;

                case 2:
                    return City.Kant;

                case 3:
                    return City.Osh;

                case 4:
                    return City.Tokmok;

                case 5:
                    return City.Karabalta;
            }

        }
        return city;
    }

    public void setCity(City city) {

        this.city = city;
    }

    public Integer getDistance() {
        distance = (int) (Math.random() * (100 - 50 + 1) + 50);

        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    @Override
    public void warehouse() throws Exception {
        Product[] products = ProductService.readFile();
        List<String>s=new ArrayList<>();
        List<Integer>q=new ArrayList<>();
Random random=new Random();
            for (var m : products) {
            s.add(m.getProductName());
                q.add(m.getCost());
           // q.add(p);
            }

       int i=random.nextInt(products.length);

               System.out.println("Product: "+s.get(i));
       int g=getQuantity()*q.get(i);

        System.out.println("Total:"+ (g)+" som ");
        System.out.println("Cost:"+q.get(i)+" som");
        System.out.println("Quantity: "+g/q.get(i)+"kg");
        setDeliveryCost(100);
        int c=0;
        if(getDistance()<=60){
                 c=getDeliveryCost();
        System.out.println("Delivery: "+(c));}
        if(getDistance()>60&&getDistance()<=70){

            c=getDeliveryCost()+60;
            System.out.println("Delivery: "+(c));}
        if(getDistance()>=70&&getDistance()<=80){

            c=getDeliveryCost()+120;
            System.out.println("Delivery: "+(c));}
        if(getDistance()>=80&&getDistance()<=100){

            c=getDeliveryCost()+180;
            System.out.println("Delivery: "+(c));}



    }


}