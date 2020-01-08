package forlearn;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("E:\\IntelijIDEA\\json.txt");
        Gson gson = new GsonBuilder().create();
        JSON json = (JSON) gson.fromJson(new FileReader(file), JSON.class);
        System.out.println(json.name);

    }
}
