
function mostrarPromocao(){
    let nomeMedicamento = document.getElementById("remedio").textContent;//peguei o valor do nome
    let precoMedicamento = document.getElementById("preco").textContent;//peguei o valor do preço 

    
    // 1
    var ele1 = document.createElement("label");//criação de nó
    var info1 = document.createTextNode("Promoção de " + nomeRemedio);

    ele1.appendChild(info1); //coloquei a informação no elemento

    var elemento1 = document.getElementById("form");
    elemento1.appendChild(ele1); //escrevi p ele1 no lugar do elemento1

    // 2
    precoMedicamentoPromocao = (precoMedicamento * 2 * 0,10)
    var ele2 = document.createElement("label"); //criei meu 2 no 
    var info2 = document.createTextNode("Leve dois por apenas R$: " + precoMedicamentoPromocao);

    ele2.appendChild(info2);

    var elemento2 = document.getElementById("form");
    elemento2.appendChild(ele2);


}

//*MANEIRA DIFERENTE DE REALIZAR ESSA ATIVIDADE DE FARMÁCIA 
let nome = document.getElementById("pro");
let preco = document.getElementById("pro2");

preco = Math.trunc(preco.value);

let para = document.createElement("b");
let node = document.createTextNode("o medicamento" + nome.value + "leve 2 e sai por " + preco);
para.appendChild(node);
var element = document.getElementById("pro");
element.appendChild(para);
