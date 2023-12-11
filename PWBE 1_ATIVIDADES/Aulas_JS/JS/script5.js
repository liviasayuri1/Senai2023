/*PARTE JAVA DO FORMULÁRIO FEITO COM O PROFESSOR*/
function limpa_form(){
    document.getElementById('rua').value("");
    document.getElementById('bairro').value("");
    document.getElementById('cidade').value("");
    document.getElementById('uf').value("");
}

function atualiza_campos(conteudo){
    if(!("erro" in conteudo)){
        document.getElementById('rua').value=(conteudo.rua);
        document.getElementById('bairro').value=(conteudo.bairro);
        document.getElementById('cidade').value=(conteudo.cidade);
        document.getElementById('uf').value=(conteudo.uf);
    }else {
        limpa_form();
        alert("CEP nao foi encontrado!");
    }
}

function pesquisacep(valor){
    //variavel cep recebe apenas valores decimais(inteiros)
    var cep = valor.replace(/\D/g,'');
    //condição de validação
    if(cep != ""){
        var validacep = /^[0-9]{8}$/;
        if(validacep.test(cep)){
            document.getElementById('rua').value="carregando"
            document.getElementById('bairro').value="carregando"
            document.getElementById('cidade').value="carregando"
            document.getElementById('uf').value="carregando"
    
    //criou nó
    var elemento = document.createElement('script');
    //adicionou informações no nó
    elemento.src = 'https://viacep.com.br/ws/' + cep + "/json/?callback=atualiza_campos";
    //insere script no documento e carrega seus conteudos
    document.body.appendChild(elemento);

}
else{
    limpa_form();
    alert("Formato de CEP inválido")
}
}//fecha if
else{
    limpa_form();
}
}

    