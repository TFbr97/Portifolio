
package dao;

import classe.Cliente;
import java.sql.Connection;
import conexao.Conexao;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class ClienteDao {
    
    private Connection con;
    private ResultSet rs;
    
    public ClienteDao(){
        this.con = new Conexao().getConnection();
        
        
    }
    
    public void insert(Cliente cliente){
        try{
            
            PreparedStatement stmt = con.prepareStatement
        ("insert into cliente(nome,telefone,email,status)values(?,?,?,?)");
            
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getTelefone());
            stmt.setString(3, cliente.getEmail());
            stmt.setString(4, cliente.getStatus());
            stmt.execute();
            JOptionPane.showMessageDialog(null,"Cliente Cadastrado com Sucesso!"); 
            //con.close();
            
        }
        catch(SQLException erro){
            
            throw new RuntimeException(erro); 
        }
        
        
    }
    
    public void edit(Cliente cliente){
        
       try{
            
            PreparedStatement stmt = con.prepareStatement
        ("update cliente set nome=?, telefone=?, email=? where idcliente='"+cliente.getIdcliente()+"'");
            
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getTelefone());
            stmt.setString(3, cliente.getEmail());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Cliente Atualizado com Sucesso!"); 
            //con.close();
            
        }
        catch(SQLException erro){
            
            throw new RuntimeException(erro); 
        } 
        
    }
    
    public void inativo(Cliente cliente){
        
        try{
            PreparedStatement stmt = con.prepareStatement("update cliente set status = ? where idcliente='"+cliente.getIdcliente()+"'");
            
            stmt.setString(1, cliente.getStatus());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Cliente Inativo"); 
            //con.close();
            
        }
        catch(SQLException erro){
            
            throw new RuntimeException(erro); 
        } 
        
    }
    
    
    public void buscaid(Cliente cliente){
        try{
            
            PreparedStatement stmt = con.prepareStatement("select * from cliente where status = 'A' and idcliente = '"+cliente.getIdcliente()+"';");
            
            rs = stmt.executeQuery(); // executeQuery é usado para fazer select no SQL
            
            if(rs.next()){ // rs é a instancia do Resulte Set para armazenar os dados do banco de dados na variável
                cliente.setIdcliente(rs.getInt("idCliente")); // Chamando cliente.set estamos colocando valores na classe cliente de acordo com o comando e utilizando o rs.get pegamos os valores no banco colocando o nome da coluna entre aspas
                cliente.setNome(rs.getString("nome"));
                cliente.setTelefone(rs.getNString("telefone"));
                cliente.setEmail(rs.getNString("email"));
                cliente.setStatus("email");
            }
            
            else{
               
                JOptionPane.showMessageDialog(null,"Cliente não encontrado!!"); 
                
            }
            

            
        }
        
        catch(SQLException erro){
            
            throw new RuntimeException(erro);
        }
        
        
    }
    
    public void buscanome(Cliente cliente){
        try{
            
            PreparedStatement stmt = con.prepareStatement("select * from cliente where status = 'A' and nome = '"+cliente.getNome()+"';");
            
            rs = stmt.executeQuery(); // executeQuery é usado para fazer select no SQL
            
            if(rs.next()){ // rs é a instancia do Resulte Set para armazenar os dados do banco de dados na variável
                cliente.setIdcliente(rs.getInt("idCliente")); // Chamando cliente.set estamos colocando valores na classe cliente de acordo com o comando e utilizando o rs.get pegamos os valores no banco colocando o nome da coluna entre aspas
                cliente.setNome(rs.getString("nome"));
                cliente.setTelefone(rs.getNString("telefone"));
                cliente.setEmail(rs.getNString("email"));
                cliente.setStatus(rs.getNString("status"));
            }
            
            else{
               
                JOptionPane.showMessageDialog(null,"Cliente não encontrado!!"); 
                
            }
            

            
        }
        
        catch(SQLException erro){
            
            throw new RuntimeException(erro);
        }
    
    
    
    }
    
    public List<Cliente> BuscaClientes(){
        
        try{
            
            List<Cliente> clientes = new ArrayList<Cliente>();
            PreparedStatement stmt = con.prepareStatement("select * from cliente where status = 'A'");
            
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                
              Cliente cliente = new Cliente();
              cliente.setIdcliente(rs.getInt("idcliente"));
              cliente.setNome(rs.getString("nome"));
              cliente.setTelefone(rs.getString("telefone"));
              cliente.setEmail(rs.getString("email"));
              clientes.add(cliente);
                
            }
            
            return clientes;
                        
        }
        
        catch(SQLException erro){
            
            throw new RuntimeException(erro);
        }
        
        
        
    }
    
}
