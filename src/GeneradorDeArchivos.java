import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;

public class GeneradorDeArchivos {
    public void guardarJson(Moneda monedas) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escritura = new FileWriter(monedas.base_code() + ".json");
        escritura.write(gson.toJson(monedas));
        escritura.close();
    }
}
