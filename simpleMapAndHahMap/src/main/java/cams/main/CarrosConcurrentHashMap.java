package cams.main;

import java.util.Enumeration;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author Carlos
 */
public class CarrosConcurrentHashMap {

    public static void exibeCarrosConcurrentHashMap() throws Exception {
        System.out.println("");
        System.out.println("Exemplo com TreeMap");
        System.out.println("");
        ConcurrentHashMap carros = obtemCarrosConcurrentHashMap();

        carros.keySet().forEach((key) -> {
            System.out.println(key + " - " + carros.get(key));
        });

        System.out.println();

        String searchKey = "Audi";
        if (carros.containsKey(searchKey)) {
            System.out.println("Total encontrado " + carros.get(searchKey) + " "
                    + searchKey + " carros!\n");
        }

        Enumeration elems = carros.elements();
        while (elems.hasMoreElements()) {
            System.out.println(elems.nextElement());
        }
        System.out.println();

        Integer val = (Integer) carros.putIfAbsent("Audi", 8);
        if (val != null) {
            System.out.println("Audi foi encontrato no map e seu valor foi atualizado!");
        }
        val = (Integer) carros.putIfAbsent("Nissan", 9);
        if (val == null) {
            System.out.println("Nissan não foi encontrado no map, mas foi criado!");
        }
        System.out.println();

        carros.keySet().forEach((key) -> {
            System.out.println(key + " - " + carros.get(key));
        });

        System.out.println();

        carros.clear();
        System.out.println("Após executar o clear, total: " + carros.size());
    }

    private static ConcurrentHashMap obtemCarrosConcurrentHashMap() {
        ConcurrentHashMap carros = new ConcurrentHashMap();
        carros.put("BMW", 5);
        carros.put("Mercedes", 3);
        carros.put("Audi", 4);
        carros.put("Ford", 10);
        System.out.println("Total de carros: " + carros.size());
        return carros;
    }

}
