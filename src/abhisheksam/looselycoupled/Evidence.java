/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abhisheksam.looselycoupled;

/**
 * This implements a piece of evidence from a crime scene.
 *
 * @author aking
 */
public class Evidence {

    private String typeOfEvidence;

    /**
     * This constructor will set the type of the evidence to the value of the
     * parameter
     *
     * @param type Is the type of the evidence
     */
    public Evidence(String type) {
        //Constructor which sets the type of the evidence.
        typeOfEvidence = type;
    }

    /**
     * This method returns the type of the evidence.
     *
     * @return returns the type of evidence
     */
    public String toString() {
        return typeOfEvidence;   //return the evidence's type when the object is called.
    }

}
