package Json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class JSONRead {

	
  public static void main(String[] args) {
		
		JSONParser parser = new JSONParser();

		try {
			System.out.println("entra al try....");
			Object obj = parser.parse(new FileReader("C:\\Users\\David\\Desktop\\Semestre 9\\Software 3\\Proyecto\\Repositorio\\DSL\\src\\Json/factura.json"));
			
			

			JSONObject jsonObject = (JSONObject) obj;

			String blog = (String) jsonObject.get("Blog");
			System.out.println(jsonObject);

			

		} catch (FileNotFoundException e) {
			//manejo de error
		} catch (IOException e) {
			//manejo de error
		} catch (ParseException e) {
			//manejo de error
		}

	}

}