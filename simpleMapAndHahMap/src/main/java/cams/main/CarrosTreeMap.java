package cams.main;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Carlos
 */
public class CarrosTreeMap {

    public static void exibeCarrosTreeMap() throws Exception{
        System.out.println("");
        System.out.println("Exemplo com TreeMap");
        System.out.println("");
        TreeMap carros = obtemCarrosTreeMap();

        carros.keySet().forEach((key) -> {
            System.out.println(key + " - " + carros.get(key));
        });
        System.out.println();
        
        System.out.println("Primeiro Item: " + carros.firstKey());
        System.out.println("Último Item: " + carros.lastKey());

        System.out.println("\nExibir todos os valores:");

        carros.values().forEach((val) -> {
            System.out.println(val);
        });
        
        System.out.println();
        
        carros.clear();
        System.out.println("Após executar o clear, total: " + carros.size());
    }

    private static TreeMap obtemCarrosTreeMap() {
        TreeMap carros = new TreeMap();

        carros.put("BMW", 5);
        carros.put("Mercedes", 3);
        carros.put("Audi", 4);
        carros.put("Ford", 10);
        System.out.println("Total de carros: " + carros.size());
        return carros;
    }

}
