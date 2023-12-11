function mostrarTabuada() { //minha função mostrarTabuada
    
    //minhas váriaveis
    const numero = document.getElementById("numero").value;//tem o valor fornecido pelo usuário
    //no campo com o id "numero" e o armazena na variável numero.

    const tabuadaElement = document.getElementById("tabuada");//tem o elemento com o id "tabuada" 
    //e o armazena na variável tabuadaElement.

    tabuadaElement.innerHTML = ""; //limpa o input

    if (numero !== "") { //para verifica se o campo não está vazio
        for (let i = 1; i <= 10; i++) { //um loop que vai de 1 a 10
            const resultado = numero * i; //realiza as multiplicações entre número e o i, 
            tabuadaElement.innerHTML += `${numero} x ${i} = ${resultado}<br>`;//coloca uma linha à tabuadaElement com a multiplicação e o resultado.
        }
    } else { //se o campo estiver vazio
        alert("Por favor, insira um número.");//será enviado um alert para o usuário
    }
}
