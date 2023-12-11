function obterHistorico(){
    return JSON.parse(localStorage.getItem('historico')) || [];
}

function registroHistorico(){
    
}

function actionStars(){

    var numeroLinhas = document.getElementById("numberLine").value; 
    var linhas = []; 
    linhas.length = numeroLinhas;
    var estrelaincremento = "⭐";
    var estrelas = "⭐";
    for(var indice = 0; indice < linhas.length; indice++){
        // o for ficou responsável por ler, varrer e imprimir as informações do vetor.
        linhas[indice] = estrelas;
        estrelas = estrelas + estrelaincremento;
    }
    document.getElementById("resultado").innerHTML = linhas.join("<br>");

}
