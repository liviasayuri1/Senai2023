function parcelas() {
    var numero = document.getElementById("numero").value;
    var resultado = document.getElementById("resultado");
    
    resultado.innerHTML = ""; // Limpa qualquer resultado anterior

    for (var i = 1; i <= 10; i++) {
        var divisao = numero / i;
        resultado.innerHTML += i + " x de R$: " + divisao.toFixed(2) + "<br>";
    }
}