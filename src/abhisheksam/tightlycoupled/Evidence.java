/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abhisheksam.tightlycoupled;

/**
 *
 * @author aking
 */
public class Evidence {
    private String typeOfEvidence;
    public Evidence(String type){
        typeOfEvidence= type.toUpperCase();
    }
    public String toString(){
        return typeOfEvidence;
    }
    
}
