package cams.exemploarraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 *
 * @author Carlos
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("Item1");
        list.add("Item2");
        list.add(2, "Item3");
        list.add("Item4");
        System.out.println("Elementos contidos no arraylist: " + list);

        int pos = list.indexOf("Item2");
        System.out.println("\nO index do Item2 é: " + pos);

        boolean check = list.isEmpty();
        System.out.println("\nVerifica se o arraylist esta vazio: " + check);

        int size = list.size();
        System.out.println("\nO tamanho da lista é: " + size);

        boolean element = list.contains("Item5");
        System.out.println("\nVerifica se o arraylist contem o Item5: " + element);

        String item = list.get(0);
        System.out.println("\nO item de index 0 é: " + item);

        System.out.println("\nUtilizando um loop para exibir o index e o tamanho dos itens na lista");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Index: " + i + " - Item: " + list.get(i));
        }

        System.out.println("Retrieving items using foreach loop");
        for (String str : list) {
            System.out.println("Item é: " + str);
        }

        System.out.println("Utilizando um iterator para exibir os itens");
        for (Iterator<String> it = list.iterator(); it.hasNext();) {
            System.out.println("\nItem é: " + it.next());
        }

        list.set(1, "NewItem");
        System.out.println("\nO arraylist after the replacement is: " + list);

        list.remove(0);

        list.remove("Item3");

        System.out.println("\nThe final contents of the arraylist are: " + list);

        String[] simpleArray = list.toArray(new String[list.size()]);
        System.out.println("\nO array criado depois de converter para arraylist é: "
                + Arrays.toString(simpleArray));

    }

}
