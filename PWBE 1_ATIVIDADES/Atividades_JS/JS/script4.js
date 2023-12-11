function exibirNotas(){
    let valorTotal = document.getElementById("inValor").value;
if(isNaN(valorTotal)){
    alert("Digite um número");
}else if(valorTotal == ""){
    alert("Digite um número")
}else if(valorTotal == 10){
    document.getElementById("dez").innerHTML = "Notas de dez: 1";
    document.getElementById("cinquenta").innerHTML = "Notas de cinquenta: 0";
    document.getElementById("cem").innerHTML = "Notas de cem: 0";
}else if(valorTotal == 50){
    document.getElementById("dez").innerHTML = "Notas de dez: 0";
    document.getElementById("cinquenta").innerHTML = "Notas de cinquenta: 1";
    document.getElementById("cem").innerHTML = "Notas de cem: 0";
}else if(valorTotal == 100){
    document.getElementById("dez").innerHTML = "Notas de dez: 0";
    document.getElementById("cinquenta").innerHTML = "Notas de cinquenta: 0";
    document.getElementById("cem").innerHTML = "Notas de cem: 1";
}else{
    notasCem = valorTotal/100;
    x = valorTotal%100;
    notasCinquenta = x/50;
    y = x%50;
    notasDez = y/10;

    if(y%10 == 0){
        document.getElementById("dez").innerHTML = "Notas de dez: " + notasDez;
        document.getElementById("cinquenta").innerHTML = "Notas de cinquenta: " + notasDez;
        document.getElementById("cem").innerHTML = "Notas de cem: " + notasDez;
    }else{
        alert("Este valor não está disponível");
    }
  }
}