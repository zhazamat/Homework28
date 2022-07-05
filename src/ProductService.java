import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ProductService {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final Path product = Paths.get("product.json");
    public static Product[] readFile() {
        String json = "";
        try {
            json = Files.readString(product);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return GSON.fromJson(json, Product[].class);
    }

    public static void writeFile(Product[] products) {
        String json = GSON.toJson(products);
        try {
            byte[] arr = json.getBytes();
            Files.write(product, arr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
