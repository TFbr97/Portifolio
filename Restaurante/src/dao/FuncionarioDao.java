/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import classe.Funcionario;
import java.sql.Connection;
import conexao.Conexao;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

/**
 *
 * @author 62127512022.2
 */
public class FuncionarioDao {
    
    private Connection con;
    private ResultSet rs;
    
    public FuncionarioDao(){
        this.con = new Conexao().getConnection();
        
    }
    
    public void insertDados(Funcionario funcionario){
        
        try{
            
            PreparedStatement stmt = con.prepareStatement
        ("insert into funcionario(cpf, nome, telefone, usuario, senha, status) values(?,?,?,?,?,?)");
            
            stmt.setString(1, funcionario.getCpf());
            stmt.setString(2, funcionario.getNome());
            stmt.setString(3, funcionario.getTelefone());
            stmt.setString(4, funcionario.getUsuario());
            stmt.setString(5, funcionario.getSenha());
            stmt.setString(6, funcionario.getStatus());
            stmt.execute();
            JOptionPane.showMessageDialog(null,"Funcionario Cadastrado com Sucesso!");
            
        }
        
        catch(SQLException erro){
            
            throw new RuntimeException(erro);
            
        }
        
        
        
    }
    
    public void editDados(Funcionario funcionario){
        
        try{
            
            PreparedStatement stmt = con.prepareStatement
        ("update funcionario set cpf=?, nome=?, telefone=?, usuario=?, senha=? where idfuncionario='"+funcionario.getIdFuncionario()+"'");
            
            stmt.setString(1, funcionario.getCpf());
            stmt.setString(2, funcionario.getNome());
            stmt.setString(3, funcionario.getTelefone());
            stmt.setString(4, funcionario.getUsuario());
            stmt.setString(5, funcionario.getSenha());
            stmt.execute();
            JOptionPane.showMessageDialog(null,"Dados editados com Sucesso!");
            
        }
        
        catch(SQLException erro){
            
            throw new RuntimeException(erro);
            
        }
    
    }
    
    public void buscacpf(Funcionario funcionario){
        try{
            
            PreparedStatement stmt = con.prepareStatement("select * from funcionario where cpf = '"+funcionario.getCpf()+"';");
            
            rs = stmt.executeQuery(); 
            
            if(rs.next()){ 
                funcionario.setIdFuncionario(rs.getInt("idfuncionario")); 
                funcionario.setNome(rs.getString("nome"));
                funcionario.setTelefone(rs.getNString("telefone"));
                funcionario.setUsuario(rs.getNString("usuario"));
                funcionario.setSenha(rs.getNString("senha"));
            }
            
            else{
               
                JOptionPane.showMessageDialog(null,"Cliente não encontrado!!"); 
                
            }
            

            
        }
        
        catch(SQLException erro){
            
            throw new RuntimeException(erro);
        }
            
        }
    
    public void buscanome(Funcionario funcionario){
        try{
            
            PreparedStatement stmt = con.prepareStatement("select * from funcionario where nome = '"+funcionario.getNome()+"';");
            
            rs = stmt.executeQuery(); // executeQuery é usado para fazer select no SQL
            
            if(rs.next()){
                funcionario.setIdFuncionario(rs.getInt("idfuncionario")); 
                funcionario.setCpf(rs.getString("cpf"));
                funcionario.setTelefone(rs.getNString("telefone"));
                funcionario.setUsuario(rs.getNString("usuario"));
                funcionario.setSenha(rs.getNString("senha"));
            }
            
            else{
               
                JOptionPane.showMessageDialog(null,"Cliente não encontrado!!"); 
                
            }
            

            
        }
        
        catch(SQLException erro){
            
            throw new RuntimeException(erro);
        }
            
        }
    
    
    
    }
    

