// Função para obter o número de linhas do LocalStorage
function getSavedNumber() {
    return localStorage.getItem('numeroLinhas');
}

// Função para salvar o número de linhas no LocalStorage
function saveNumber(numeroLinhas) {
    localStorage.setItem('numeroLinhas', numeroLinhas);
}

// Função para preencher o input com o número salvo
window.onload = function() {
    var savedNumber = getSavedNumber();
    if (savedNumber) {
        document.getElementById("numberLine").value = savedNumber;
    }
}

function actionStars(){
    var numeroLinhas = document.getElementById("numberLine").value; 
    saveNumber(numeroLinhas); // Salva o número no LocalStorage

    var linhas = []; //criou um vetor chamado linhas
    linhas.length = numeroLinhas;//responsável por receber o tamanho do número de linhas 
    //que foi fornecido no input
    
    var estrelaincremento = "⭐";
    var estrelas = "⭐";

    for(var indice = 0; indice < linhas.length; indice++){
        // o for ficou responsável por ler, varrer e imprimir as informações do vetor.
        linhas[indice] = estrelas;
        estrelas = estrelas + estrelaincremento;
    }
    document.getElementById("resultado").innerHTML = linhas.join("<br>");
    //join vai juntar os valores do vetor
}