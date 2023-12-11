/*PRIMEIRO JEITO DE SOLUCIONAR O EXERCÍCIO*/
function adicionar(){
    var nome = prompt('Nome: ');
    var email = prompt('email: ');
    var novali = document.createElement("p");
    novali.innerHTML = "Nome: " + nome + "Email" + email;
    var element = document.getElementById("listacontatos");
    element.appendChild(novali);
}

/*FIM DO PRIMEIRO JEITO DE SOLUCIONAR O EXERCÍCIO*/
function add(){
    let x = prompt("Escreva seu nome");
    let y = prompt ("Escreva seu email")
    let lista = document.getElementById("lista").innerHTML;
    lista = lista + "<li>" + "Nome: " + x + "Email: " + y + "</li>"
    document.getElementById("lista").innerHTML = lista;
}