import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SellerService {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final Path seller = Paths.get("seller.json");
    public static Seller[] readFile() {
        String json = "";
        try {
            json = Files.readString(seller);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return GSON.fromJson(json, Seller[].class);
    }

    public static void writeFile(Seller[] sellers) {
        String json = GSON.toJson(sellers);
        try {
            byte[] arr = json.getBytes();
            Files.write(seller, arr);
        } catch (IOException e) {
            e.printStackTrace();
        }
}}

