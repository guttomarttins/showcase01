package cams.main;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 *
 * @author Carlos
 */
public class Main {

    static int i = 4;

    public static void main(String[] args) {
        try {
            switch (i) {
                case 1:
                    CarrosHashMap.exibeCarrosHashMap();
                    break;
                case 2:
                    CarrosHashTable.exibeCarrosHashTable();
                    break;
                case 3:
                    CarrosTreeMap.exibeCarrosTreeMap();
                    break;
                case 4:
                    CarrosConcurrentHashMap.exibeCarrosConcurrentHashMap();
                    break;
                default:
                    CarrosHashMap.exibeCarrosHashMap();
                    break;
            }
        } catch (Exception e) {
            System.out.println("Erro: ".concat(e.toString()));
        }

    } 
}
