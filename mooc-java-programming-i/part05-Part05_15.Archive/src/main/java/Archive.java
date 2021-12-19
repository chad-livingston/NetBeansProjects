/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chad
 */
public class Archive {

    private String name;
    private String identifier;
    
    public Archive(String name, String id) {
        this.name = name;
        this.identifier = id;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (!(compared instanceof Archive)) {
            return false;
        }
        Archive comparedArch = (Archive) compared;
        if (this.identifier.equals(comparedArch.identifier)) {
            return true;
        }
        
        return false;
    }

    public String toString() {
        return this.identifier + ": " + this.name;
    }
}
