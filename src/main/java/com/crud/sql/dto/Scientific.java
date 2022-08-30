// Generated with g9.

package com.crud.sql.dto;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="scientific")
public class Scientific implements Serializable {

    /** Primary key. */
    protected static final String PK = "dni";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    /**
     * Access method for the lockFlag property.
     *
     * @return the current value of the lockFlag property
     */
    public Integer getLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     *
     * @param aLockFlag the new value of the lockFlag property
     */
    public void setLockFlag(Integer aLockFlag) {
        lockFlag = aLockFlag;
    }

    @Id
    @Column(unique=true, nullable=false, length=9)
    private String dni;
    @Column(name="surname_name", length=255)
    private String surnameName;
    @OneToMany(mappedBy="scientific")
    private Set<Assignment> assignment;

    /** Default constructor. */
    public Scientific() {
        super();
    }

    /**
     * Access method for dni.
     *
     * @return the current value of dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * Setter method for dni.
     *
     * @param aDni the new value for dni
     */
    public void setDni(String aDni) {
        dni = aDni;
    }

    /**
     * Access method for surnameName.
     *
     * @return the current value of surnameName
     */
    public String getSurnameName() {
        return surnameName;
    }

    /**
     * Setter method for surnameName.
     *
     * @param aSurnameName the new value for surnameName
     */
    public void setSurnameName(String aSurnameName) {
        surnameName = aSurnameName;
    }

    /**
     * Access method for assignment.
     *
     * @return the current value of assignment
     */
    public Set<Assignment> getAssignment() {
        return assignment;
    }

    /**
     * Setter method for assignment.
     *
     * @param aAssignment the new value for assignment
     */
    public void setAssignment(Set<Assignment> aAssignment) {
        assignment = aAssignment;
    }

    /**
     * Compares the key for this instance with another Scientific.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Scientific and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Scientific)) {
            return false;
        }
        Scientific that = (Scientific) other;
        Object myDni = this.getDni();
        Object yourDni = that.getDni();
        if (myDni==null ? yourDni!=null : !myDni.equals(yourDni)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Scientific.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Scientific)) return false;
        return this.equalKeys(other) && ((Scientific)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        if (getDni() == null) {
            i = 0;
        } else {
            i = getDni().hashCode();
        }
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Scientific |");
        sb.append(" dni=").append(getDni());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("dni", getDni());
        return ret;
    }

}
