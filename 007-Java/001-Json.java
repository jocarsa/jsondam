package cargarjson;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.json.*;

public class CargarJson {

    public static void main(String[] args) {
        
        try{
            String archivo = new String(Files.readAllBytes(Paths.get("C:\\Users\\Jose Vicente\\Documents\\GitHub2\\jsondam\\007-Java\\clientes.json")));
            JSONObject objeto = new JSONObject(archivo);
            System.out.println(objeto.get("nombre"));
        }catch(IOException | JSONException e){
            e.printStackTrace();
        }
    }
}