import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAluno {

    public static void main(String[] args) {

        //Não há ordenação, os elementos são salvos e exibidos de maneira aleatório
        Set<String> alunos = new HashSet<>();
        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Sergio Lopes");
        alunos.add("Renan Saggio");
        alunos.add("Mauricio Aniche");


        boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");


        for (String aluno : alunos) {
            System.out.println(aluno);
        }

        System.out.println(alunos);

        //Se for necessário utilizar algum recurso de List
        //é possível salvar um Set dentro de uma list
        List<String> alunosEmLista = new ArrayList<>(alunos);
    }
}