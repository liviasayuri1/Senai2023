var palavra = prompt("Digite uma palavra: "); //para realizar um polindromo

var palavra_invertida = palavra.split("");
//split é para separação de palavras e letras, entretanto para separar letras 
//é necessário utilizar aspas duplas dento do parenteses e para separar palavras 
//é mecessário utilizar aspas simples dentro do parenteses.

palavra_invertida = palavra_invertida.reverse("");    

palavra_invertida = palavra_invertida.join('');

alert(palavra_invertida);