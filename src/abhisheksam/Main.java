/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abhisheksam;

import abhisheksam.tightlycoupled.Evidence;
import abhisheksam.tightlycoupled.EvidenceBox;
import abhisheksam.tightlycoupled.Policeman;

/**
 *
 * @author aking
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Evidence e1 = new Evidence("CCTV Footage");
        Evidence e2 = new Evidence("clothing fibre");
        System.out.println(e1);
        System.out.println(e2);
        
        
        EvidenceBox box = new EvidenceBox("S.Avery's  case", "2005000381");
        box.addEvidence(e1);
        box.addEvidence(e2);
       
      
        box.displayTypesOfEvidence();
        Policeman JLenk = new Policeman("J.Lenk");
        Policeman AColborn = new Policeman("A. Colborn");
        JLenk.addBoxes(box);
        JLenk.getAllPieceEvidence("2005000381", "clothing fibre");

    }

}
