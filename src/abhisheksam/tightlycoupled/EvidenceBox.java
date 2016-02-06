
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abhisheksam.tightlycoupled;

import java.util.ArrayList;
import java.util.List;

/**
 * Implements a box that contains multiple pieces of evidence for a crime.
 *
 * @author aking
 */
public class EvidenceBox {

    private List<Evidence> allEvidence;  //Record of all Evidence
    private String caseName;
    private String caseNumber;

    /**
     * This creates an evidence box with a case name and number.
     *
     * @param name The name of the case
     * @param number Case number
     */
    public EvidenceBox(String name, String number) {
        allEvidence = new ArrayList<>();
        caseName = name;
        caseNumber = number;
    }

    /**
     * This method displays the types of evidence in the box.
     *
     */
    public void displayTypesOfEvidence() {
        ArrayList<String> types = new ArrayList<>();
        for (Evidence o : allEvidence) {
            if (!(types.contains(o.toString()))) {
                types.add(o.toString());
            }

        }
        for (String t : types) {
            int amount = 0;
            for (Evidence o : allEvidence) {

                if (o.toString().equals(t)) {
                    amount++;
                }
            }
            System.out.println(amount + " x " + t);
        }
    }
    //This methods adds a evidence object to the evidence box 

    /**
     * This will add evidence to the evidence list.
     *
     * @param obj Evidence Object
     */
    public void addEvidence(Evidence obj) {
        allEvidence.add(obj);
    }

    /**
     * This method prints the evidences in the box.
     *
     * @return Every Evidence in the box
     */
    public List<Evidence> getAllEvidence() {
        return allEvidence;
    }

    /**
     * This method gives the name of the case.
     *
     * @return Name of the case
     */
    public String getCaseName() {
        return caseName;
    }

    /**
     * This method allows for the setting of case name.
     *
     * @param caseName Name of the case
     */
    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    /**
     * This method prints the case number.
     *
     * @return Case number
     */
    public String getCaseNumber() {
        return caseNumber;
    }

    /**
     * This method allows for the setting of case number.
     *
     * @param caseNumber Case number
     */
    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }

}
