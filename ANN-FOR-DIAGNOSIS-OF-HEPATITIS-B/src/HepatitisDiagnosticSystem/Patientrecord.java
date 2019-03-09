/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HepatitisDiagnosticSystem;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Esther
 */
@Entity
@Table(name = "patientrecord", catalog = "myproject", schema = "")
@NamedQueries({
    @NamedQuery(name = "Patientrecord.findAll", query = "SELECT p FROM Patientrecord p"),
    @NamedQuery(name = "Patientrecord.findByPatientId", query = "SELECT p FROM Patientrecord p WHERE p.patientId = :patientId"),
    @NamedQuery(name = "Patientrecord.findByLastName", query = "SELECT p FROM Patientrecord p WHERE p.lastName = :lastName"),
    @NamedQuery(name = "Patientrecord.findByFirstName", query = "SELECT p FROM Patientrecord p WHERE p.firstName = :firstName"),
    @NamedQuery(name = "Patientrecord.findByAge", query = "SELECT p FROM Patientrecord p WHERE p.age = :age"),
    @NamedQuery(name = "Patientrecord.findByGender", query = "SELECT p FROM Patientrecord p WHERE p.gender = :gender"),
    @NamedQuery(name = "Patientrecord.findByAddress", query = "SELECT p FROM Patientrecord p WHERE p.address = :address"),
    @NamedQuery(name = "Patientrecord.findByPhoneNo", query = "SELECT p FROM Patientrecord p WHERE p.phoneNo = :phoneNo")})
public class Patientrecord implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PatientId")
    private Integer patientId;
    @Basic(optional = false)
    @Column(name = "LastName")
    private String lastName;
    @Basic(optional = false)
    @Column(name = "FirstName")
    private String firstName;
    @Basic(optional = false)
    @Column(name = "Age")
    private int age;
    @Basic(optional = false)
    @Column(name = "Gender")
    private String gender;
    @Basic(optional = false)
    @Column(name = "Address")
    private String address;
    @Basic(optional = false)
    @Column(name = "PhoneNo")
    private String phoneNo;

    public Patientrecord() {
    }

    public Patientrecord(Integer patientId) {
        this.patientId = patientId;
    }

    public Patientrecord(Integer patientId, String lastName, String firstName, int age, String gender, String address, String phoneNo) {
        this.patientId = patientId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        Integer oldPatientId = this.patientId;
        this.patientId = patientId;
        changeSupport.firePropertyChange("patientId", oldPatientId, patientId);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        String oldLastName = this.lastName;
        this.lastName = lastName;
        changeSupport.firePropertyChange("lastName", oldLastName, lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        String oldFirstName = this.firstName;
        this.firstName = firstName;
        changeSupport.firePropertyChange("firstName", oldFirstName, firstName);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        int oldAge = this.age;
        this.age = age;
        changeSupport.firePropertyChange("age", oldAge, age);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        String oldGender = this.gender;
        this.gender = gender;
        changeSupport.firePropertyChange("gender", oldGender, gender);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        String oldPhoneNo = this.phoneNo;
        this.phoneNo = phoneNo;
        changeSupport.firePropertyChange("phoneNo", oldPhoneNo, phoneNo);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (patientId != null ? patientId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Patientrecord)) {
            return false;
        }
        Patientrecord other = (Patientrecord) object;
        if ((this.patientId == null && other.patientId != null) || (this.patientId != null && !this.patientId.equals(other.patientId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "HepatitisDiagnosticSystem.Patientrecord[ patientId=" + patientId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
