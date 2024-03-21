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
public class Triglicerídeos extends Exame {
    private int trig;
    private int idadee;
    private String most;
    private String mact;

    public String getMact() {
        return mact;
    }

    public void setMact(String mact) {
        this.mact = mact;
    }

    public int getTrig() {
        return trig;
    }

    public void setTrig(int trig) {
        this.trig = trig;
    }

    public int getIdadee() {
        return idadee;
    }

    public void setIdadee(int idadee) {
        this.idadee = idadee;
    }

    public String getMost() {
        return most;
    }

    public void setMost(String most) {
        this.most = most;
    }
    
     public void cadastrarTriglicerideos(){
        this.trig = Integer.parseInt(JOptionPane.showInputDialog("Qntd de Triglicerídeo"));
}
     public void cadastrarResulTriglicerideos(){
        
         this.idadee = 2023 - getAnoNascimento() ;
     
        if ((idadee >= 0 ) && idadee <= 9){
           if(trig < 75){
               this.most =  "(Triglicerídeo - BOM)";
           }
           else{
               this.most =  "(Triglicerídeo - RUIM)";
           }
       }
        if ((idadee >= 10 ) && idadee <= 19){
           if(trig < 90){
               this.most =  "(Triglicerídeo - BOM)";
           }
           else{
               this.most =  "(Triglicerídeo - RUIM)";
           }
       }
        if (idadee >= 20){
           if(trig < 150){
               this.most =  "(Triglicerídeo - BOM)";
           }
           else{
               this.most =  "(Triglicerídeo - RUIM)";
           }
       }
     
     }
        public void mostarResultadoTriglicerideo(){
            String mact = "Nome: " + getNome()+ "\n";
            mact += "Resultado Triglicerídeo: " + this.trig + "\n";
            mact += "Classificação: " + this.most + "\n";
            
            JOptionPane.showMessageDialog(null, mact);
            
            
        }
     
    
    
    
    
    
}
