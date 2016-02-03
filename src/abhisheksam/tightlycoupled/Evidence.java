/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abhisheksam.tightlycoupled;

/**
 * This implements a piece of evidence from a crime scence.
 * @author aking
 */
public class Evidence {
    private String typeOfEvidence;
    public Evidence(String type){
        typeOfEvidence= type;
    }

    /**
     * This method prints the type of the evidence.
     * 
     */
    public String toString(){
        return typeOfEvidence;   //Prints the evidence's type as a String.
    }
    
}
