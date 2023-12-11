package br.org.produtos_educacionais.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet; 
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.org.produtos_educacionais.controller.Conexao;
import br.org.produtos_educacionais.model.Produto;

public class CrudDAO {
	//CRUD C-Cread  R - Read  U - Update  D - delete
	
	//CREATE (inserir DADOS)
	public void create(Produto produto) {
		String sql = "INSERT INTO produtos (categoria, nome, valor) VALUES (?, ?, ?)";
		Connection conn = null;
		PreparedStatement p = null;
		try {
			conn = Conexao.criandoConexao();
			p = (PreparedStatement) conn.prepareStatement(sql); //cast
			p.setString(1, produto.getCategoria());
			p.setString(2, produto.getNome());
			p.setFloat(3, produto.getValor());
			p.execute();
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao inserir dados \nERRO: " + e);
		}finally {
			try {
				if (p != null);
				p.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
}
	}
	//********************* UPDATE *************************
		public void update(Produto produto) {
		String sql = "UPDATE produtos SET categoria = ?, nome = ?, valor = ? WHERE ni = ?";
		Connection conn = null;
		PreparedStatement p = null; //link com banco
		try {
			conn = Conexao.criandoConexao();
			p = (PreparedStatement) conn.prepareStatement(sql);
			p.setInt(1, produto.getNi());
			p.setString(2, produto.getCategoria());
			p.setString(3, produto.getNome());
			p.setFloat(4, produto.getValor());
			p.execute();
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao inserir dados! \nERRO: "+ e);
		}finally {
			try {
				if(p != null) {
				p.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}//fim update(atualizar)
		
		
		//read
		public List<Produto> read(){
			String sql = "SELECT * FROM produtos";
			List<Produto> produto = new ArrayList<Produto>();
			Connection conn = null;
			PreparedStatement p = null;
			ResultSet resultado = null;
			
			try {
				conn = Conexao.criandoConexao();
				p = (PreparedStatement) conn.prepareStatement(sql); //cast classe de pai ve a filha
				resultado = p.executeQuery(); //mostra os dados da consulta sql
				while(resultado.next()) {
					Produto ver_produto = new Produto();
					//recuperar ra
					ver_produto.setNi(resultado.getInt("ni"));
					//recuperar categoria
					ver_produto.setCategoria(resultado.getString("categoria"));
					//recuperar o nome
					ver_produto.setNome(resultado.getString("nome"));
					//recuperar idade 
					ver_produto.setValor(resultado.getInt("valor"));
					//adicionar na lista
					produto.add(ver_produto);
				}
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(p != null);
					p.close();
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
			return produto;
		}
		//**************************************************************************************************
		//D - Delete
		public boolean delete(int ni) {
			String sql = "DELETE FROM produtos WHERE ni = ?";
			Connection conn = null;
			PreparedStatement p = null; 
			try {
				conn = Conexao.criandoConexao();
				p = (PreparedStatement) conn.prepareStatement(sql); //cast
				p.setInt(1, ni);
				p.execute();
				JOptionPane.showMessageDialog(null, "dados excluídos com sucesso!");
				System.out.println("Dados excluidos com sucesso!");
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Erro ao inserir dados! \nERRO: " + e);
			}finally {
				try {
					if(p != null);
					p.close();
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
			return false;
		} //fim delete
		
		
}//fim da classe crud
