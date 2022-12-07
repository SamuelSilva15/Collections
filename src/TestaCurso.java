public class TestaCurso {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as colecoes do Java",
                "Paulo Silveira");

        //chamando método criado na classe para não permitir alterações de fora
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));

        System.out.println(javaColecoes.getAulas());
    }
}
