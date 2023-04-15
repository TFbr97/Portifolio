/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import classe.Pedido;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class PedidoDao {
    
    private Connection con;
    private ResultSet rs;
    
    public PedidoDao(){
    
        this.con = new Conexao().getConnection();
    
    }
    
    public void insert(Pedido pedido){
        try{
            
            PreparedStatement stmt = con.prepareStatement
        ("insert into pedido(idcliente,idfuncionario,data)values(?,?,?)");
            
            stmt.setInt(1, pedido.getIdcliente());
            stmt.setInt(2, pedido.getIdfuncionario());
            stmt.setString(3, pedido.getData());
            stmt.execute();
            JOptionPane.showMessageDialog(null,"Pedido Cadastrado com Sucesso!"); 
            //con.close();
            
        }
        catch(SQLException erro){
            
            throw new RuntimeException(erro); 
        }
        
        
    }
    
}
