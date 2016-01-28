/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abhishek;

import abhishek.tightlycoupled.Evidence;
import abhishek.tightlycoupled.EvidenceBox;
import abhishek.tightlycoupled.Policeman;

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
        Evidence e2 = new Evidence("DNA");
        EvidenceBox box = new EvidenceBox("S.Avery's  case", "2005000381");
        box.addEvidence(e1);box.addEvidence(e2);
        Policeman JLenk = new Policeman("J.Lenk");
        JLenk.addBoxes(box);
        JLenk.getAllPieceEvidence("2005000381", "DNA");
        //BLAHALHALAHLAHLAHALA
    }

}
