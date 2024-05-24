import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeneradorArchivo {

    public void guardarJson(Moneda moneda, String resultado, String nombreArchivo) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escritura = new FileWriter(nombreArchivo);
        //escritura.write(gson.toJson(moneda));
        escritura.write(resultado);
        escritura.close();
    }
}
