/*
//EXEMPLO DE LISTA ARRAY
var pessoas = ["Maria", "José", "Carlos", "Ana"];
var objetos = ["Colher", "Garfo"];
var frutas = ["Uva", "Maça", "Abacaxi"];
pessoas[0];   //representa Maria
pessoas.length;  //resultado igual a 4
objetos[objetos.length] = "Faca";  //add um elemento ao array
frutas.indexOf("Uva");       //resultado 0
document.write("<br> Quem são as pessoas na lista? " + pessoas);
document.write("<br> Quais são os objetos da lista: " + objetos);
document.write("<br> Quais são as frutas da lista?: " + frutas);

//realização do exemplo
var objetos2 = ["Carregador", "Cadeira", "Mesa", "Lapis", "Tenis", "Computador", "Escova"];
objetos2[0];    //representa Carregador
objetos2.length; //resultado igual a 8
document.write("<br> Quais são os itens da lista? " + objetos2);
objetos2[objetos2.length] = "Camiseta";   //adiciona um elemento ao array
objetos2.indexOf("Carregador");   //resultado 0
document.write("<br> Tamanho da lista: " + objetos2.length);
document.write("<br> Qual é o primeiro objeto? " + objetos2[0]);
document.write("<br> Quais são os itens da lista? " + objetos2);
objetos2[objetos2.length] = "Caneta";
document.write("<br> Tamanho da lista: " + objetos2.length);
document.write("<br> Quais são os itens da lista? " + objetos2);
*/

//EXEMPLO DE DATAS
/*
var d = new Date("October 13, 2014, 11:13:00");
document.getElementById("D1").innerHTML = d;

d=new Date (0);
document.getElementById("D2");innerHTML = d;

var d = new Date (99,5,24,11,33,30,0);
document.getElementById("D3").innerHTML = d;
    //O mês vai de 0 (janeiro) a 11 (dezembro)

var d = new Date (2014, 7, 20);  //20 de agosto de 2014
document.getElementById("D4").innerHTML = d;

var d = new Date();
document.write("<br>" + d.toUTCString());
document.write("<br" + d.toDateString());
document.write("<br>" + d.toLocaleDateString());
document.write("<br>" + d.toLocaleTimeString('pt-PT', {hour12: false}))
/*INÍCIO DE UM TESTE ERRADO DE DATAS
d.toUTCString();      //"Fri, 03 Mar 2023 02:11:00 GMT"
d.toDateString();     //"Thu 02 2023"
d.toLocaleDateString  //"02/03/2023"
d.toLocaleTimeString  //"23:11:00"
*/  //FIM DE UM TESTE ERRADO DE DATAS
//FIM DO EXEMPLO DE DATAS

//INÍCIO DO SEGUNDO EXEMPLO DE DATAS
/*
var hoje, prazo;
hoje = new Date();
prazo = new Date();

prazo.setFullYear(2023, 9, 27);
var dia = ["Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"];

document.write("<p> Hoje é: " + dia[hoje.getDay()] + ", "
 + hoje.getDate() + "/" + (prazo.getMonth() + 1) + "/" + prazo.getFullYear() + "<p>");

 document.write("<p> O prazo é " + dia [prazo.getDay] + ", " + prazo.getDate() + "/"
  + (prazo.getMonth()+1) + "/" + prazo.getFullYear() + "<p>");
  */
//FIM DO SEGUNDO EXEMPLO DE DATAS

//EXEMPLO 1 DE TRY E CATCH
/*
try {
    var x;

    if(x=="") throw "vazio";
    if(isNaN(x)) throw "não é um número";
    if (x == 10) throw x;
    console.log(x);
    document.write(x);
}catch(err){
    console.log("Input is " + err);
    document.write("Input is " + err);
}
*/
//FIM DO EXEMPLO 1 DE TRY E CATCH

//EXEMPLO 2 DE TRY E CATCH
/*
    var dividendo = 10;
    var divisor = 0;
    
    try{
        if (divisor == 0){
            Error("Erro: Divisão por zero não é permitida");
        }
        var resultado = dividendo/divisor;
        console.log("Resultado: ", resultado);
    }catch(err){
        console.log(err.message);
    }
    */
//FIM DO EXEMPLO 2 DE TRY E CATCH

//EXEMPLO 3 DE TRY E CATCH
/*
    function myFunction(){
    var message, x;
    message = document.getElementById("message");
    message.innerHTML = "";
    x = document.getElementById("demo").value;
    try{
        if(x == "") throw "empyt";
        if(isNaN(x)) throw "not a number";
        x = Number(x);
        if (x <5) throw "too low";
        if(x > 10) throw "too high";
    }
    catch(err){
        message.innerHTML = "Input is" + err;
    }}
    */
    //FIM DO EXEMPLO 3 DE TRY E CATCH

//TESTE 4 DE TRY CATCH
/*
try{
    adddlert("ERRO!!!");
}catch(err){
    document.write("<br>" + err.message);
}finally{
    document.write("<br> Será mostrado mesmo com o Erro");
}
*/
//FIM DO TESTE 4 DE TRY CATCH

//
