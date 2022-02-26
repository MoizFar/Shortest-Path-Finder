/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_xyz;

/**
 *
 * @author MoiZ
 */
public class Project_XYZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Spash_Screen sc=new Spash_Screen();
        sc.setVisible(true);
        for(int i=0;i<100;i++)
        {
            Thread.sleep(10);
            Spash_Screen.Prog_bar.setValue(i);
            Spash_Screen.Prog_txt.setText(Integer.toString(i)+"%");
        }
        two sp=new two();
        sc.dispose();
        sp.setVisible(true);
    }
    
}
