/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.unicesumar.code.entity.DAO.conexao;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Matheus
 */
public class conexaojdbc {
    private static final String URL = "jdbc:mysql://localhost:3306/mapa";
    private static final String USER = "root";
    private static final String PASSWORD = "1955";
    
    public static Connection conn;
    
    public static Connection getconexao(){
        try{
            if(conn == null){
                conn = DriverManager.getConnection(URL, USER, PASSWORD);
            return conn;
            }
            else{
                return conn;
                }}
        catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Houve um erro ao tentar conectar com o banco de dados");
                }     
        return null;
}
}