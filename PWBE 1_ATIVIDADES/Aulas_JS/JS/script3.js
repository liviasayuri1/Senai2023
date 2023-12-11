//PARTE JAVA DO PRIMEIRO EXEMPLO
/*
function myFunction(){
    alert('ola');
} 
*/

//PARTE JAVA DO SEGUNDO EXEMPLO
/*começo do comentário
var myVar = setInterval(myTimer, 1000);

function myTimer(){
    var d = new Date();
    document.getElementById("demo").innerHTML = d.toLocaleTimeString();
}
fim do comentario*/

//PARTE JAVA DO TERCEIRO EXEMPLO
/*
function mostrarHora(){
    let d = new Date();
    document.body.innerHTML = "<h3>hora" + d.getHours() + d.getMinutes() + d.getSeconds() 
    + d.toLocaleTimeString();
}
mostrarHora();

function Hora(){
    const tempo = new Date();
    const hora = tempo.getHours();
    const min = tempo.getMinutes();
    const seg = tempo.getSeconds();
    console.log(`${hora} : ${min}: ${seg}`);
    document.body.innerHTML = `Hora ${hora} : ${min} : ${seg}`;
    setInterval(Hora,1000);
}
Hora();
*/
//FIM DA PARTE JAVA DO TERCEIRO EXEMPLO

//anuncio
function functionAnuncio(){
    document.body.style.backgroundImage = "url(IMG/lua.jfif)";
}