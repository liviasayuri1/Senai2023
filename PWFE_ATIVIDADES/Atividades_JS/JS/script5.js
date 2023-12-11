function parimpar(){
    var value = document.getElementById("digite").value;
    if(isNaN(value)){
        alert("Não é um número")
    }else if(value == ""){
        alert("digite algum numero")
    }else if(value % 2 == 0){
        document.getElementById("resultado").innerHTML = "O valor fornecido é par";
    }else{
        document.getElementById("resultado").innerHTML = "O valor fornecido é ímpar";
    }
}


//FUNCTION --- é uma função responsável por conectar um conjunto de instruções para serem 
//utilizadas em vários lugares do programa sem que eu tenha que refazer o código 
//diversas vezes, ou seja, ele também serve para a reutilização do código.

//VAR --- é utilizado para declarar uma variável ao código, a váriavel é utilizada para
//armazenar ou acessar alguma informação, (também pode ser utilizado o 'let' ou 'const'),
//a utilização do 'let' é voltada para criar variáveis que podem ser reatribuídas, 
//já o 'const' é voltada para criar variáveis que não podem ser reatribuídas 
//(reatribuir uma variável significa dar um novo valor a ela).

//VALUE --- é uma propriedade que contém o valor atual inserido/selecionado pelo usuário.
//EX.:se você tem um campo de texto (<input type="text">) e o usuário digitou "Olá Mundo"
//nesse campo, você pode acessar o valor digitado usando elemento.value, 
//onde elemento é a referência ao elemento HTML.

//DOCUMENT --- é uma interface que permite que os scripts possam interagir com o documento
//HTML, juntamente com o document os métodos mais utilizados com ele são 
//'getElementById', 'getElementsByClassName' e 'getElementsByTagName'

//getElementById --- elementos HTML podem conter atributos id, portanto dois elementos 
//no mesmo documento não podem ter a mesma identificação, portanto o usuário pode 
//selecionar um elemento com base nessa identificação exclusiva com o método getElementById

//getElementsByClassName --- é usada para obter uma coleção de elementos HTML que 
//tenham uma determinada classe. Ela retorna uma NodeList, que é semelhante a um 
//array, contendo todos os elementos que possuem a classe especificada, sendo muito útil 
//para quando você quer interagir com vários elementos que compartilham uma classe 
//específica em uma página web.

//getElementsByTagName ---- utilizada para selecionar elementos com base no nome da 
//tag (por exemplo, "div", "p", "a", etc.), retornando uma coleção de elementos com a 
//tag especificada, assim como getElementsByClassName, retorna um "array-like object".


//IF --- permite que um programa tome decisões e execute diferentes ações com base nas 
//condições que são encontradas durante a execução.

//ELSE IF --- é utilizada para fornecer múltiplas condições de execução de código,
//permitindo que você especifique um bloco de código a ser executado se a condição 
//associada ao 'if' for false e uma nova condição for verdadeira, permitindo que você
//controle o fluxo de execução do seu programa com base em múltiplas condições.

//ISNAN --- Esta função é usada para verificar se um valor não é um número 
//(NaN - Not a Number), ela retorna um valor booleano, ou seja, true se o valor 
//não for um número e false se for.

//INNER.HTML --- é uma propriedade que permite inserir ou substituir HTML dentro de um 
//elemento, ao utiliza-lo para modificar o conteúdo de um elemento, você estará
//substituindo todo o HTML dentro dele. Portanto, se houver outros elementos dentro 
//do elemento alvo, eles serão removidos e substituídos pelo novo conteúdo.