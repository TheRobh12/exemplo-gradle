package List;

import java.util.*;

public class ExemploList {

    public static void main(String[] args) {

        List<String> nomes =  new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Anderson");
        nomes.add("Juliana");
        nomes.add("Maria");
        nomes.add("João");

        //for (String nomeDoItem: nomes ) {

            //System.out.println("==>" + nomeDoItem);

        Iterator<String> iterator = nomes.iterator();

        while (iterator.hasNext()) {

            System.out.println("==>" + iterator.next());

            System.out.print(nomes);

            //nomes.set(2, "Larissa");

            System.out.print(nomes);

            //Collections.sort(nomes);


        }

    }
}
