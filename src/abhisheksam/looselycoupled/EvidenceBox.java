/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abhisheksam.looselycoupled;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aking
 */
public class EvidenceBox {

    private List<Evidence> allEvidence;
    private List<Evidence> searchedEvidence;
    private String caseName;
    private String caseNumber;

    public EvidenceBox(String name, String number) {
        allEvidence = new ArrayList<>();
        searchedEvidence = new ArrayList<>();
        caseName = name;
        caseNumber = number;
    }

    public List<Evidence> getEvidenceType(String type){
       for (Evidence e : allEvidence){
           if(e.toString().equals(type)){
               searchedEvidence.add(e);
           }
       }
       return searchedEvidence;
    }
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

    public void addEvidence(Evidence obj) {
        allEvidence.add(obj);
    }

    

    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public String getCaseNumber() {
        return caseNumber;
    }

    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }

}
