# **Estrutura de dados - A3 da Universidade Anehmbi Morumbi**
--------------------------
### Enunciado
--------------------------

>Implemente um projeto no qual serão inseridos números de forma ordenada, e que atenda as especificações a seguir: 
> 
> **Passo 1:** Insira os números [1, 2, 3, 4 e 5] em uma lista - com 5 células; 
> 
> **Passo 2:** Remova todos os dados da lista e insira-os em uma Pilha - com 5 células. Deve-se sempre remover os dados da célula inicial da lista; 
> 
> **Passo 3:** Remova os dados da Pilha e insira-os em uma Fila - com 10 células); 
> 
> **Passo 4:** Insira os números [6, 7, 8, 9 e 10] na lista; 
> 
> **Passo 5:** Repita os passos 2 e 3.
>  
> **Passo 6:** Exiba todos os números que foram inseridos na fila. 
> 
>Analise a ordem dos números exibidos e verifique se estão na mesma forma que foram inseridos. Se a exibição foi diferente, justifique o ocorrido.

---------------------

### Resultados

 Os valores apresentados na fila não estavam em ordem, na verdade o resultado final é: **[5, 4, 3, 2, 1, 10, 9, 8, 7, 6]**.
 Isso ocorre por causa da transferencia dos dados entre estruturas de dados, nesse caso a lista se assemelha muito a fila, já que os primeiros dados a chegarem foram os primeiros a sair da estrutura (FIFO), mas esses dados entraram em uma estrutura de pilha, onde o último a entrar é o primeiro a sair (LIFO), logo o número 5 e o número 10 que eram os últimos em ambas as transferencias assumiram uma posição mais próxima do início da fila, já que eles eram o topo das pilhas.

 Executar o programa desse repositório vai permitir que você visualize o passo a passo do que aconteceu ao levar os dados de uma estrutura para outra, você deve obter a seguinte saída:

 >\>\> Objetos Vazios:
>  
>Lista[Capacidade - 5e]: []
>
>Pilha[Capacidade - 5e]: []
>
>Fila[Capacidade - 10e]: []
>
>
>\>\> Inserindo 5 nº na lista
>
>Lista[Capacidade - 5e]: [1, 2, 3, 4, 5]
>
>Pilha[Capacidade - 5e]: []
>
>Fila[Capacidade - 10e]: []
>
>
>\>\> Incrementando a Pilha e esvaziando a Lista
>
>Lista[Capacidade - 5e]: []
>
>Pilha[Capacidade - 5e]: [5, 4, 3, 2, 1]
>
>Fila[Capacidade - 10e]: []
>
>
>\>\> Incrementando a Fila e esvaziando a Pilha
>
>Lista[Capacidade - 5e]: []
>
>Pilha[Capacidade - 5e]: []
>
>Fila[Capacidade - 10e]: [5, 4, 3, 2, 1]
>
>
>\>\> Inserindo dados na Lista
>
>Lista[Capacidade - 5e]: [6, 7, 8, 9, 10]
>
>Pilha[Capacidade - 5e]: []
>
>Fila[Capacidade - 10e]: [5, 4, 3, 2, 1]
>
>
>\>\> Incrementando a Pilha e esvaziando a Lista
>
>Lista[Capacidade - 5e]: []
>
>Pilha[Capacidade - 5e]: [10, 9, 8, 7, 6]
>
>Fila[Capacidade - 10e]: [5, 4, 3, 2, 1]
>
>
>\>\> Incrementando a Fila e esvaziando a Pilha
>
>Lista[Capacidade - 5e]: []
>
>Pilha[Capacidade - 5e]: []
>
>Fila[Capacidade - 10e]: [5, 4, 3, 2, 1, 10, 9, 8, 7, 6]

-----------------------
##### Observação

Como indicado pelo enunciado e a saída as estrutura de dados tem um limite de capacidade de elementos indicados pela letra **e**, no entanto os objetos instanciados como ArrayList() representando uma lista e ArrayDeque() representando a pilha conseguem aumentar sua capacidade ao chegar no limite, o que não gera problemas na execução, mas a classe ArrayQueue() representando a fila não consegue fazer o mesmo, portanto aumentar qualquer uma dessas estruturas deve ocasionar em uma falha do programa que nem a falha a seguir:

> <span style="color:red">Exception in thread "main" java.lang.IndexOutOfBoundsException: Queue full</span>

