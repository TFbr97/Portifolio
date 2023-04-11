/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import conexao.Conexao;
import java.sql.ResultSet;
import classe.Produto;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author 62127512022.2
 */
public class ProdutoDao {
    
    private Connection con;
    private ResultSet rs;
    
    public ProdutoDao(){
    
        this.con = new Conexao().getConnection();
    
    }
    
    /*public class GuardaProduto(Produto produto){
        
        try{
        
            PreparedStatement stmt = con.prepareStatement
        ("insert into cliente(nome,telefone,email,status)values(?,?,?,?)");
            
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getTelefone());
            stmt.setString(3, cliente.getEmail());
            stmt.setString(4, cliente.getStatus());
            stmt.execute();
            JOptionPane.showMessageDialog(null,"Cliente Cadastrado com Sucesso!"); 
        
        }
        
        catch(SQLException erro){
        
             throw new RuntimeException(erro); 
        
        }
        
    }*/
    
    public List<Produto> BuscarProdutos(){
       
        try{
            List<Produto>produtos = new ArrayList<Produto>();
            PreparedStatement stmt = con.prepareStatement("select * from cardapio");
            
            rs = stmt.executeQuery();
            
            while (rs.next()){
                
                Produto produto = new Produto();
                produto.setIdproduto(rs.getInt("idproduto"));
                produto.setNome(rs.getString("nome"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setValor(rs.getDouble("valor"));
                produtos.add(produto);
                
            }
            
            return produtos;
        }
        
        
        
        catch(SQLException erro){
            
            throw new RuntimeException(erro);
            
        }
    }
        
        
    
    
   
}


