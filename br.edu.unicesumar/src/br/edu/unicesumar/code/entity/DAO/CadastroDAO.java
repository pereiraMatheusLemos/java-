/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.unicesumar.code.entity.DAO;
import br.edu.unicesumar.code.entity.Cadastro;
import br.edu.unicesumar.code.entity.DAO.conexao.conexaojdbc;
import com.mysql.cj.jdbc.result.ResultSetFactory;


import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Matheus
 */
public class CadastroDAO {
    public void inserir(Cadastro Cadastro){
       String sql = "INSERT INTO CADASTRO(NOME, LOGIN, SENHA, EMAIL) VALUES(?,?,?,?)";
        PreparedStatement ps;
        try{
        ps = conexaojdbc.getconexao().prepareStatement(sql);
        ps.setString(1, Cadastro.getNome() );
        ps.setString(2, Cadastro.getLogin() );
        ps.setString(3, Cadastro.getSenha() );
        ps.setString(4, Cadastro.getEmail() );
        
        ps.execute();
       }catch(SQLException e){
        e.printStackTrace();
        
    }
}
    public Cadastro buscarCadastroPorNome(String Login){
        
        String sql = "SELECT ID, NOME, LOGIN, SENHA, EMAIL WHERE LOGIN = ? AND SENHA = ?";
        
        PreparedStatement ps;
        ResultSet rs;
        
        try{
            ps = conexaojdbc.getconexao().prepareStatement(sql);
            ps.setString(1, Login);
            rs = ps.executeQuery();
            Cadastro cadastro = new Cadastro();
            if(rs.next()){
                cadastro.setLogin(rs.getString("LOGIN"));
                cadastro.setSenha(rs.getString("SENHA"));
                
            }
            return cadastro;
        }
        catch(SQLException e){
            
        }
           return null; 
        
    } 
}
