package dio.collections.set.exercicio;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Exercicio_1 {

    public static void main(String[] args) {
        System.out.println("Conjunto de cores Arco-íris: ");
        Set<String> coresArcoIris = new HashSet<>();
        coresArcoIris.add("roxo");
        coresArcoIris.add("azul");
        coresArcoIris.add("verde");
        coresArcoIris.add("amarelo");
        coresArcoIris.add("laranja");
        coresArcoIris.add("vermelho");
        System.out.println(coresArcoIris);

        System.out.println("Exiba as cores uma abaixo da outra: ");
        for (String cor: coresArcoIris) {
            System.out.println(cor);
        }

        System.out.println("Quantidade de cores do Arco Íris: " + coresArcoIris.size());

        System.out.println("Cores do arco-íris em ordem alfabética: ");
        Set<String> coresArcoIris2 = new TreeSet<>(coresArcoIris);
        System.out.println(coresArcoIris2);

        System.out.println("Exiba cores que começam com a letra 'v': ");
        for (String cor: coresArcoIris){
            if(cor.startsWith("v")) System.out.println(cor);
        }

        System.out.println("Remova todas as cores que não começarem com a letra 'v': ");
        Iterator<String> iterator2 = coresArcoIris.iterator();
        while(iterator2.hasNext()) {
            if(!iterator2.next().startsWith("v")) iterator2.remove();
        }
        System.out.println(coresArcoIris);

        System.out.println("Limpe o conjunto: ");
        coresArcoIris.clear();

        System.out.println("Confira se o conjunto está vazio: " + coresArcoIris.isEmpty());
    }

}
