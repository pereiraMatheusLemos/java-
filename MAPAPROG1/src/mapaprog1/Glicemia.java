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
public class Glicemia  extends Exame{
   private  int qntdglicose;
   private String res;

    public int getQntdglicose() {
        return qntdglicose;
    }

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }

    public void setQntdglicose(int qntdglicose) {
        this.qntdglicose = qntdglicose;
    }
    
        public void cadastrarglicose(){
        this.qntdglicose = Integer.parseInt(JOptionPane.showInputDialog("Qntd de glicose"));
    }   
    @SuppressWarnings("empty-statement")
        public void cadastraResultado(){
            if(qntdglicose <100){
              this.res =  "Normoglicemia";
            }
            else if((qntdglicose >=100) && qntdglicose <126){
                this.res =  "Pré-diabetes";
            }
            else{
                this.res =  "Diabetes estabelecido";
            }
         
        }
        public void mostarResultado(){
            String mes = "Nome: " + getNome()+ "\n";
            mes += "Resultado glicose: " + this.qntdglicose + "\n";
            mes += "Classificação: " + this.res + "\n";
            JOptionPane.showMessageDialog(null, mes);
            
            
        }
}