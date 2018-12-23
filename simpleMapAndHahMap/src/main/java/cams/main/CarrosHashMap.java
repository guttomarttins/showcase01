package cams.main;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Carlos
 */
public class CarrosHashMap {

    public static void exibeCarrosHashMap() throws Exception{
        System.out.println("");
        System.out.println("Exemplo com HashMap");
        System.out.println("");
        Map carros = obtemCarrosHashMap();

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

    private static Map obtemCarrosHashMap() {
        Map carros = new HashMap();
        carros.put("BMW", 5);
        carros.put("Mercedes", 3);
        carros.put("Audi", 4);
        carros.put("Ford", 10);
        System.out.println("Total de carros: " + carros.size());
        return carros;
    }

}
