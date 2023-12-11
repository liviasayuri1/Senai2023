function submit(){
    // Recebendo a senha
    var senha = document.getElementById("inSenha").value;

    // Condições para validação da senha
    if(senha.length < 8 ||
         senha.length > 15 || 
         !senha.match(/\d/) || 
         !senha.match(/[a-z]/) || 
         !senha.match(/[A-Z]/) || 
         !senha.match(/[!@#$%^&*(),.?":{}|<>]/)
         ) 
         {
        document.getElementById("alerta").innerHTML = "Erro... A senha deve possuir entre 8 e 15 caracteres, pelo menos 1 número, pelo menos 1 letra minúscula, pelo menos 2 letras maiúsculas e pelo menos 1 símbolo.";
    } else {
        document.getElementById("alerta").innerHTML = "Senha válida!";
    }
}

//senha.length < 8: verifica se o número de caracteres é menor que 8, pois a senha deve ter pelo menos 8 caracteres.

//senha.length > 15: verifica se o número de caracteres é maior que 15, pois a senha deve ter no máximo 15 caracteres.

//!senha.match(/\d/): O ! no início nega o resultado do match. \d é uma expressão regular que corresponde a qualquer dígito (0-9). 
//Portanto, !senha.match(/\d/) verifica se a senha não contém nenhum dígito. Ou seja, ela precisa ter pelo menos um dígito.

//!senha.match(/[a-z]/): verifica se a senha não contém pelo menos uma letra minúscula.

//!senha.match(/[A-Z]/): verifica se a senha não contém pelo menos uma letra maiúscula.

//!senha.match(/[!@#$%^&*(),.?":{}|<>]/): verifica se a senha não contém pelo menos um dos caracteres especiais listados dentro dos colchetes.


//SEGUNDA OPÇÃO DE RESOLUÇÃO:
function submit(){
    //recebendo a senha (value da input) digitada no input
    var senha = document.getElementById("inSenha").value;
    //vetor de erros
    var erros = [];
    //condições de validação
    if(senha.length < 8 || senha.length > 15){
        console.log(senha);
        erros.push("Erro. A senha deve conter entre 8 a 15 caracteres");
    }else if (senha.length == 0){
        erros.push("Possuir numeros (no minimo,1)");
    }
    //escrevendo se tem erro ou se validou
    if(erros.length == 0){
        document.getElementById("alerta").innerHTML = "Senha válida";
    }else {
        document.getElementById("alerta").innerHTML = "Erro...senha inválida" + erros.join(", ");
    }
}