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
public class Colesterol extends Exame {
    
    private int ldl;
    private int hdl;
    private String risq;
    private int idade; 
    private String rec;
    private String rec2;
    private String mest;
    

    public String getRec2() {
        return rec2;
    }

    public String getMest() {
        return mest;
    }

    public void setMest(String mest) {
        this.mest = mest;
    }

    public void setRec2(String rec2) {
        this.rec2 = rec2;
    }

    public String getRec() {
        return rec;
    }

    public void setRec(String rec) {
        this.rec = rec;
    }
    
    public int getIdade() {
   
        return idade;
    }
 
    public void setIdade(int idade) {
        this.idade = idade;        
    }

    public int getLdl() {
        return ldl;
    }

    public String getRisq() {
        return risq;
    }

    public void setRisq(String risq) {
        this.risq = risq;
    }

    public void setLdl(int ldl) {
        this.ldl = ldl;
    }

    public int getHdl() {
        return hdl;
    }

    public void setHdl(int hdl) {
        this.hdl = hdl;
    }
    public void cadastrarColesterol(){
        this.ldl = Integer.parseInt(JOptionPane.showInputDialog("Qntd de LDL"));
        this.hdl = Integer.parseInt(JOptionPane.showInputDialog("Qntd de HDL")); 
        
}
   
    public void cadastrarResulColesterol(){
       this.idade = 2023 - getAnoNascimento() ;
       //Estrutura HDL
       if ((idade >= 0 ) && idade <= 19){
           if(hdl > 45){
               this.rec =  "(HDL - BOM)";
           }
           else{
               this.rec =  "(HDL - RUIM)";
           }
       }
       else {
           if(hdl > 40){
                this.rec =  "(HDL - BOM)";
           }
           else{
               this.rec =  "(HDL - RUIM)";
           }
       }
        this.risq = (JOptionPane.showInputDialog("Risco(A - Alto, M - Médio, B - Baixo)"));
//Estrutura LDL
        if(risq.equals("B"))
        {
            if(ldl <100){
                    this.rec2 =  "(LDL - BOM)";
                    }
            else{
                this.rec2 =  "(LDL - Ruim)";
            }
        }
         if(risq.equals("M"))
        {
            if(ldl <75){
                    this.rec2 =  "(LDL - BOM)";
                    }
            else{
                this.rec2 =  "(LDL - Ruim)";
            }
        }
         if(risq.equals("A"))
        {
            if(ldl <50){
                    this.rec2 =  "(LDL - BOM)";
                    }
            else{
                this.rec2 =  "(LDL - Ruim)";
            }
        }
        
       
    }
            public void mostarResultadoColesterol(){
            String mest = "Nome: " + getNome()+ "\n";
            mest += "Resultado LDL: " + this.ldl + "\n";
            mest += "Resultado HDL: " + this.hdl + "\n";
            mest += "Resultado de Risco: " + this.risq + "\n";
            mest += "Classificação: " + this.rec + "\n";
            mest += "Classificação: " + this.rec2 + "\n";
            
            JOptionPane.showMessageDialog(null, mest);
            
            
        }
         
      
      
      
    
}
    

    