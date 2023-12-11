/*INÍCIO DO EXEMPLO 1 
var titulo = document.getElementById("titulo"); //Seleciona elemento

var conteudo = titulo.textContent; //seleciona o conteudo texto do elemento

console.log(conteudo);    //Imprime "meu cabeçalho"
FIM DO EXEMPLO 1*/






/*INÍCIO DO EXEMPLO 2*/
/*
var x =document.getElementsByTagName("li");
document.getElementById("demo").innerHTML = x[1].innerHTML;
console.log("pegando " + x[1].innerHTML);
*/
/*FIM DO EXEMPLO 2*/






/*INÍCIO DO EXEMPLO 3*/
/*COMENTÁRIO
var elemento = document.getElementsByClassName("exemplo1");
elemento[0].innerHTML = "testando classe";
console.log("JS" + elemento[0].innerHTML);
COMENTÁRIO*/
/*FIM DO EXEMPLO 3*/






/*INÍCIO DO EXEMPLO 4*/
/*COMENTÁRIO
var num = document.getElementsByName("cor").length;
document.getElementById("seletor").innerHTML = num;
console.log("JS numero" + num);
COMENTÁRIO*/
/*FIM DO EXEMPLO 4*/





/*INÍCIO DO EXEMPLO 5*/
/*var element=document.getElementById("cabeçalho");
element.innerHTML="novo cabecalho";
document.getElementById("imagem").src="IMG/borboleta.png";
document.getElementById("p2").style.color="blue";*/
/*FIM DO EXEMPLO 5*/
/*INÍCIO DO EXEMPLO 5.1*/
/*
var txt=document.getElementById("intro").childNodes[0].textContent;
Document.write(txt);
*/
/*FIM DO EXEMPLO 5.1*/




/*INÍCIO DO EXEMPLO 6*/
/*
var x = document.getElementById("left");
var txt = "";
for (var i = 0; i < x.childNodes.length; i++){
    txt += "Nodo: " + x.childNodes[i].nodeName + "Valor: " + x.childNodes[i].nodeValue + "<br>";
}
alert(txt);
*/
/*FIM DO EXEMPLO 6*/





/*INÍCIO DO EXEMPLO 7*/
/*COMENTÁRIO
var para=document.createElement("p");
var node = document.createTextNode("Esse é o número...")
para.appendChild (node);

var element = document.getElementById("left");
element.appendChild(para);
COMENTÁRIO*/
/*FIM DO EXEMPLO 7*/




/*INÍCIO DO EXEMPLO 8*/
/*
var para=document.createElement("p");
var node=document.createTextNode("Este é novo.");
para.appendChild(node);

var element=document.getElementById("div1");
var child=document.getElementById("p1");
element.insertBefore(para,child);
*/
/*FIM DO EXEMPLO 8*/



/*INÍCIO DO EXEMPLO 9*/
/*
alert('bummmmmmmmmmmmmm!')
if(confirm ('Alerta confirmado?') )
    alert('Positivo central')
        else
    alert('Negativo central');
*/
/*FIM DO EXEMPLO 9*/




/*INÍCIO DO EXEMPLO 10*/
/*document.write(document,images.length);*/
/*FIM DO EXEMPLO 10*/

/*INICIO DO EXEMPLO 11*/
/*function bemvindo (nome1, nome2){
    alert("Bem vindo " + nome1 + "e" + nome2);
}*/
/*FIM DO EXEMPLO 11*/



/*INÍCIO DO EXEMPLO 12*/
/*
function multiplicacao(a,b){
    return a*b;
}

document.getElementById("resposta").innerHTML = multiplicacao (4,3);
*/
/*FIM DO EXEMPLOM 12*/