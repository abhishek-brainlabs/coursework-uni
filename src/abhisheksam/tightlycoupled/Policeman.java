/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abhisheksam.tightlycoupled;

import java.util.ArrayList;
import java.util.List;

/**
 * Implements a Policeman with a name and a collection of evidence boxes.
 *
 * @author aking
 */
public class Policeman {

    private String name;
    private List<EvidenceBox> allEvidenceBoxes;
    private List<Evidence> wantedItems;

    /**
     * This constructs a Policeman with a name.
     *
     * @param name Name of the Policeman
     */
    public Policeman(String name) {
        this.name = name;
        allEvidenceBoxes = new ArrayList<>();  //Creates new ArrayLists
        wantedItems = new ArrayList<>();

    }

    /**
     * Returns the name of the Policeman
     *
     * @return Will output the name of the policeman
     */
    public String toString() {
        return name;
    }

    /**
     * This method adds box o.
     *
     * @param o Adds the Evidence Box to the ArrayList
     */
    public void addBoxes(EvidenceBox o) {
        allEvidenceBoxes.add(o);
    }

    /**
     * Get all pieces of evidence of a certain type and case number.
     *
     * @param caseNumber Case number
     * @param typeOfEvidence The type of evidence
     */
    public void getAllPieceEvidence(String caseNumber, String typeOfEvidence) {
        wantedItems.removeAll(wantedItems);
        for (EvidenceBox b : allEvidenceBoxes) {
            if (b.getCaseNumber().equals(caseNumber)) {
                for (Evidence e : b.getAllEvidence()) {
                    if (e.toString().equals(typeOfEvidence)) {
                        wantedItems.add(e);
                    }
                }
            }
        }
        if (!(wantedItems.isEmpty())) {
            System.out.println("Pieces of " + typeOfEvidence + " found in evidence box number " + caseNumber
                    + " Found by " + toString() + ": " + wantedItems);
        } else {
            System.out.println("Not Found In The Box");
        }
    }

}
