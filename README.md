# Collections
Aprendendo e aperfeiçoando o uso de Collections

- Caso a modelagem do sistema ainda não esteja bem definida, o desenvolvedor irá utilizar a interface Collection<E>. 
Dessa maneira, terá acesso aos métodos básicos de todas as implementações, como size(), add(), remove() e contains(). Conforme for sentindo necessidade em algo específico, o desenvolvedor fará poucas mudanças em seu código.

- Caso sinta necessidade de fazer uma requisição a um elemento específico através da sua posição, trocará de Collection<E> para List<E>. Caso perceba que ordem não importa, porém é necessária uma busca bem rápida (e sem repetições), um Set<E> é mais apropriado.

- List é uma sequência e aceita elementos duplicados. Set não aceita duplicados e não define ordem.

- A implementação TreeSet já ordena os seus elementos na hora da inserção. Qual é o critério da ordenação depende e pode ser definido através de um Comparator.

- Em Map, se uma chave for repetida, a antiga permanece, porém, o valor é sobrescrito pelo novo valor contido na chave passada, sendo o antigo valor "esquecido" pelo Map.
Ela funciona da seguinte maneira, mapeia valores para chaves, e através da chave conseguimos acessar o valor correspondente. Por isso ela não pode ser repetida, ao contrário do valor, que podem existir iguais.

- O LinkedHashMap continua nos dando a performance de um HashMap, mas com acesso previsível e ordenado, seguindo a inserção dos seus elementos.

