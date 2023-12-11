//criando um número aleatório fora da função, pois é necessário sortear um número antes
//do jogo iniciar.
let numero = Math.floor(Math.random()*100); //o math.random e o math.floor
// o random pega número aleatório porém em decimal podendo ser no intervalo [0, 1),
// por isso é multiplicado por 100,
//mas ainda assim é necessário utilizar o floor para que ele se torne um número inteiro
//após este processo o número escolhido irá ficar armazenado na variável numero

console.log(numero);//escrevendo no console o número sorteado para teste

    var chance = 3;
    document.getElementById("chance").innerHTML = "Chance " + chance;

function submit(){
    //pegando o valor digitado pelo jogador
    let inNumberPlayer = document.getElementById("tentativa").value;
    if(isNaN(inNumberPlayer)){  //caso a informação inserida não seja um número...
        document.getElementById("coment").innerHTML = "Isso não é um número"
    }else if(inNumberPlayer == " "){  
        document.getElementById("coment").innerHTML = "Tente para acertar o valor"
    }else if(inNumberPlayer > numero){ //caso o valor inserido seja maior que o sorteado...
        document.getElementById("coment").innerHTML = "O valor é mais baixo do que o fornecido";
        chance --;
        document.getElementById("chance").innerHTML = "Chance " + chance;
    }else if(inNumberPlayer < numero){  //caso o valor inserido seja menor que o sorteado...
        document.getElementById("coment").innerHTML = "O valor é mais alto do que o fornecido"
        chance --;
        document.getElementById("chance").innerHTML = "Chance " + chance;
        if(chance == 0){
            document.getElementById("chance").innerHTML = "Suas chances acabaram";
        }
    }else{  //caso você consiga acertar o número sorteado...
        document.getElementById("coment").innerHTML = "Você acertou o número sorteado"
    }
} 
    