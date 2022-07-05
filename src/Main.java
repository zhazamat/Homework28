import java.util.ArrayList;
import java.util.List;

public class Main {
    static void run() throws Exception {

        Product[] products = ProductService.readFile();
        for (var m : products) {
            System.out.println(m);
        }
        Event drive = new Event();
        List<String> p = new ArrayList<>();
        for (var m : products) {
            p.add(m.getProductName());
        }


        for (int i = 0; i <3; i++) {
            System.out.println("----------------------------------------------");
            System.out.println("City: "+drive.getCity());
            System.out.println("Distance: "+drive.getDistance()+" km ");

            drive.warehouse();




        }


    }




    public static void main(String[] args) throws Exception {
        run();
    }
}
