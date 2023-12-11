//array p/ guardar os dados
let listaProdutos = [];
//funcao p/ add Produtos
function adicionaProduto(){
const nome = document.getElementById("nome-produto").value;

const preco = parseFloat(document.getElementById("preco-produto").value);

if(nome && preco){
listaProdutos.push({nome , preco});
atualizarListaProduto();
limparCampos();
}
}
//funcao atualizar
function atualizarListaProduto(){
const lista = document.getElementById("lista-produtos");
lista.innerHTML = '';
listaProdutos.forEach((produto,index) =>{
const li = document.createElement('li');
li.textContent = `${produto.nome} - R$

${produto.preco.toFixed(2)}`;

//add botao p/ edicao de valores
const botaoEditar = document.createElement('button');
botaoEditar.textContent = 'Editar Dados';
botaoEditar.onclick = () =>

preencherFormularioEditar(index);

li.appendChild(botaoEditar);
lista.appendChild(li);
});
atualizarListaExclusao();
}
//formulario editar
function preencherFormularioEditar(index){
const produto = listaProdutos[index];
document.getElementById("editar-nome-produto").value =

produto.nome;

document.getElementById("editar-preco-produto").value =

produto.preco;
}
//funcao atualizar
function atualizarListaExclusao(){
const selectExcluir = document.getElementById("excluir-produto");
selectExcluir.innerHTML = '';
listaProdutos.forEach((produto,index) => {
const option = document.createElement('option');
option.value = index;
option.textContent = produto.nome;
selectExcluir.appendChild(option);
});
}
//atualizar Produto
function atualizarProduto(){
const index = document.getElementById("excluir-produto").value;

const nome = document.getElementById("editar-nome-produto").value;

const preco = parseFloat(document.getElementById("editar-preco-produto").value);

if(index !== '' && nome && preco){
listaProdutos[index] = {nome, preco};
atualizarListaProduto();
limparFormularioEditar();
}
}
//limpar campos
function limparCampos(){
document.getElementById("nome-produto").value = "";
document.getElementById("preco-produto").value = "";
}
//limpa form
function limparFormularioEditar(){
document.getElementById("editar-nome-produto").value = "";
document.getElementById("editar-preco-produto").value = "";
}
//funcao excluir
function excluirProduto(){
const index = document.getElementById("excluir-produto").value;
if(index !== ''){
listaProdutos.splice(index,1);
atualizarListaProduto();
}
}
//atualiza o browser p/ o usuario
window.onload = function(){
atualizarProduto();
};