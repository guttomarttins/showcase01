package cams.main;

import java.util.Hashtable;
import java.util.Map;

/**
 *
 * @author Carlos
 */
public class CarrosHashTable {

    public static void exibeCarrosHashTable() throws Exception{
        System.out.println("");
        System.out.println("Exemplo com HashTable");
        System.out.println("");
        Map carros = obtemCarrosHashTable();

        carros.keySet().forEach((key) -> {
            System.out.println(key + " - " + carros.get(key));
        });
        System.out.println();
        String searchKey = "Audi";
        if (carros.containsKey(searchKey)) {
            System.out.println("Total encontrado " + carros.get(searchKey) + " "
                    + searchKey + " carros!\n");
        }
        carros.clear();
        System.out.println("Após executar o clear, total: " + carros.size());
    }

    private static Map obtemCarrosHashTable() {
        Map carros = new Hashtable();
        carros.put("BMW", 5);
        carros.put("Mercedes", 3);
        carros.put("Audi", 4);
        carros.put("Ford", 10);
        System.out.println("Total de carros: " + carros.size());
        return carros;
    }

}
