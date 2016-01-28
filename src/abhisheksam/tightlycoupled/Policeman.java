/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abhisheksam.tightlycoupled;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aking
 */
public class Policeman {

    private String name;
    private List<EvidenceBox> allEvidenceBoxes;
    private List<Evidence> wantedItems;

    public Policeman(String name) {
        this.name = name;
        allEvidenceBoxes = new ArrayList<>();
        wantedItems = new ArrayList<>();

    }

    public String toString() {
        return name;
    }
    public void addBoxes(EvidenceBox o){
        allEvidenceBoxes.add(o);
    }

    public void getAllPieceEvidence(String caseNumber, String typeOfEvidence) {
        wantedItems.removeAll(wantedItems);
        for (EvidenceBox b : allEvidenceBoxes) {
            if (b.getCaseNumber().equals(caseNumber)) {
                for (Evidence e : b.getAllEvidence()) {
                    if (e.toString().equals(typeOfEvidence.toUpperCase())) {
                        wantedItems.add(e);
                    }
                }
            }
        }
        if(!(wantedItems.isEmpty())){
            System.out.println("Pieces of "+typeOfEvidence+" found in evidence box number "+ caseNumber+
            " Found by "+toString()+": "+wantedItems);
        }else{
            System.out.println("Not Found In The Box");
        }
    }

}
