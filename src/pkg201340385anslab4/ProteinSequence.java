/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg201340385anslab4;

/**
 *
 * @author ty
 */
public class ProteinSequence {

    // fasta sequence    
    protected String comment;
    protected String sequence;
    
    public ProteinSequence (String comment, String sequence) {
        this.comment = comment;
        this.sequence = sequence.toUpperCase();
    }
    
    public boolean isProtein() {
        return sequence.matches("[ACDEFGHIKLMNPQRSTVWY]+") && 
                sequence.startsWith("M");
    }
    
    @Override
    public String toString() {
        return this.comment + "\n" + this.sequence + "\n";
    }
    
    public String getID() {
        try {
            return this.comment.split("\\|")[1];
        } catch (Exception e) {
            return this.comment;
        }
    }
}

