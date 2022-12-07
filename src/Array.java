import java.util.ArrayList;
import java.util.Collections;

public class Array {
    public static void main(String[] args) {
       String aula1 = "Conhecendo mais de listas";
       String aula2 = "Modelando a classe aula";
       String aula3 = "Trabalhando com Cursos e Sets";

       ArrayList<String> aulas = new ArrayList();
       //Adicionando elementos para um array
       aulas.add(aula1);
       aulas.add(aula2);
       aulas.add(aula3);

       System.out.println(aulas);

       //Removendo elementos de um array
       aulas.remove(0);

        System.out.println(aulas);

        //Criando um foreach para aulas
        //leia-se para cada aula dentro de aulas
        for (String aula : aulas) {
            System.out.println("Aula: " + aula);
        }

        //Pegando elementos especifico dentro de um array
        String primeiraAula = aulas.get(0);
        System.out.println("A primeira aula é " + primeiraAula);

        for (int i = 0; i < aulas.size(); i++) {
            System.out.println("aula: " + aulas.get(i));
        }

        System.out.println(aulas.size());

        //Utilizando método forEach do java
        //dentro dele cria-se uma lambda e diz o que fazer dentro das chaves
        aulas.forEach(aula -> {
            System.out.println("Percorrendo: ");
            System.out.println("Aula: " + aula);
        });

        //Ordendo por ordem alfabética com Collections
        Collections.sort(aulas);


    }
}