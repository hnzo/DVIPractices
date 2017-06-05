/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beanToEntity;

import java.io.Serializable;


/**
 *
 * @author hnzo
 */
@javax.persistence.Entity
public class Person implements Serializable {
    
   private String vorname;
   private String nachname;
   @javax.persistence.Id
   private long personId;

    public String getNachname() {
        return nachname;
    }

    public String getVorname() {
        return vorname;
    }    
    
    public long getPersonId() {
        return personId;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setPersonId(long personId) {
        this.personId = personId;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (int) (this.personId ^ (this.personId >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (this.personId != other.personId) {
            return false;
        }
        return true;
    }
    
   
    
}
