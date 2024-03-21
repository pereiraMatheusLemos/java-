/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapaprog1;

import javax.swing.JOptionPane;

/**
 *
 * @author Matheus
 */
public class Exame {
    private String nome;
    private String tipoSanguineo;
    private int anoNascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    
    public void cadastrarExame(){
        this.nome = JOptionPane.showInputDialog("Digite o nome do paciente");
        this.tipoSanguineo = JOptionPane.showInputDialog("Digite o tipo sanguineo");
        this.anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento"));      
    }
    
    public void mostrarExame(){
        String msg = "Nome: " + this.nome + "\n";
        msg += "Tipo Sanguineo: " + this.tipoSanguineo + "\n";
        msg += "Ano de Nascimento: " + this.anoNascimento + "\n";
        JOptionPane.showMessageDialog(null, msg);              
    }

   
    
    
}
