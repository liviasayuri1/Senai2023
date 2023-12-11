function informe() {
    
    var dado = document.getElementById('dado').value;
    
    // Verifica o dado e exibe as informações correspondentes
    var informacoesDiv = document.getElementById('informacoes');
    
    if (confirm ('Quer vizualizar informações do CEP?')) {
        informacoesDiv.innerHTML = 'CEP: 13690-000 <br> Cidade: Descalvado <br> Estado: São Paulo';
    } else {
        informacoesDiv.innerHTML = 'não reconhecido.';
    }
} 