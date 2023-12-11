function referencia(){
    let fullname = document.getElementById("digite").value;
    let vetor = fullname.split(' ');//virou vetor:)
    let nome = vetor[0];
    let segundonome = vetor[1];
    let sobrenome = vetor [2];
    document.getElementById("referencia").innerHTML = "Citação bibliográfica: " 
    + sobrenome.toUpperCase() + ", " + nome.toUpperCase().charAt() + ". " + 
    segundonome.toUpperCase().charAt();
}
