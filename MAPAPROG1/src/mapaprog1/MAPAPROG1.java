/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mapaprog1;

/**
 *
 * @author Matheus
 */
public class MAPAPROG1 {

   
    public static void main(String[] args) {
        
        Glicemia g = new Glicemia();
        g.cadastrarExame();
        g.cadastrarglicose();
        g.cadastraResultado();
        g.mostarResultado();
        
        Colesterol c = new Colesterol();
        c.cadastrarExame();
        c.cadastrarColesterol();
        c.cadastrarResulColesterol();
        c.mostarResultadoColesterol();
        
        Triglicerídeos t = new Triglicerídeos();
        t.cadastrarExame();
        t.cadastrarTriglicerideos();
        t.cadastrarResulTriglicerideos();
        t.mostarResultadoTriglicerideo();
    }
        
}
