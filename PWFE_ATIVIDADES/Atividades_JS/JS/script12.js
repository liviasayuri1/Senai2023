function categorizar(){  //função categorizar
    let nome = document.getElementById("nome").value;//variavel nome com o id nome
    let idade = parseInt(document.getElementById("idade").value); // variavel com o id idade
    var categoria; //variavel categoria
    if(idade < 13){ //se o atleta tiver menos de 13 anos
        categoria = "Categoria infantil"; //ele será da categoria infantil
    } else if(idade <= 18){  //se o atleta tiver entre 13 e 18 anos
        categoria = "Categoria juvenil"; //ele será da categoria juvenil
    } else { //se o atleta tiver mais de 18 anos 
        categoria = "Categoria adulto"; //ele será da categoria adulto
    }
    return categoria; //caso nenhuma das opções der certo ele retorna 
}

function name(){ //função nome
    let nome = document.getElementById("nome").value; //variavel nome com o id nome
    /*document.getElementById("ficha").textContent = "Nome: " + nome;*/
}

function submit(){ //função submit
let categoria = categorizar(); // chama a função para categorizar
let nome = document.getElementById("nome").value; //document.getElementById("nome") está 
//selecionando o elemento com o id "nome", já o .value está obtendo o valor (texto) 
//inserido neste elemento de entrada.

// adiciona "-" entre o nome e a categoria
let linhaSeparadora = " - ".repeat(nome.length);
let resultado = nome + "<br>" + linhaSeparadora + "<br>" + categoria;

document.getElementById("categoria").innerHTML = resultado; //mostra a categoria do atleta
}