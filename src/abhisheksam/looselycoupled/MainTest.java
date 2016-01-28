/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abhisheksam.looselycoupled;

/**
 *
 * @author aking
 */
public class MainTest {

    public MainTest() {
    }
    public static void main(String[] args) {
         Evidence e1 = new Evidence("CCTV Footage");
        Evidence e2 = new Evidence("DNA");
        Evidence e3 = new Evidence("dna");
        EvidenceBox box = new EvidenceBox("S.Avery's  case", "2005000381");
        box.addEvidence(e1);box.addEvidence(e2); box.addEvidence(e3);
        Policeman JLenk = new Policeman("J.Lenk");
        JLenk.addBoxes(box);
        JLenk.getAllPieceEvidence("2005000381", "DNA");
    }
}
