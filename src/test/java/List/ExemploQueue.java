package List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {

    public static void main(String[] args){

        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Pamela");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Patrícia");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        String clienteaSerAtendido = filaBanco.poll();

        System.out.println(clienteaSerAtendido);

        System.out.println(filaBanco);

        //filaBanco.clear();

        String primeiroCliente = filaBanco.peek();

        System.out.println(primeiroCliente);

        System.out.println(filaBanco);

        String primeiroClienteOuErro = filaBanco.element();

        System.out.println(primeiroClienteOuErro);

        System.out.println(filaBanco);

        for (String client: filaBanco){
            System.out.println(client);
        }

        Iterator<String> iteratorfilaBanco = filaBanco.iterator();

        while (iteratorfilaBanco.hasNext()){
            System.out.println("--->> " + iteratorfilaBanco.next());
        }

        System.out.println(filaBanco.size());

        filaBanco.clear();

        System.out.println(filaBanco.isEmpty());

        filaBanco.add("Wesley");

        System.out.println(filaBanco);

    }

}
