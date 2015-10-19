/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author user
 */
@Entity
@Table(name = "centers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Centers.findAll", query = "SELECT c FROM Centers c"),
    @NamedQuery(name = "Centers.findByCntrNum", query = "SELECT c FROM Centers c WHERE c.cntrNum = :cntrNum"),
    @NamedQuery(name = "Centers.findByCntrName", query = "SELECT c FROM Centers c WHERE c.cntrName = :cntrName")})
public class Centers implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "cntrNum")
    private Integer cntrNum;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "cntrName")
    private String cntrName;

    public Centers() {
    }

    public Centers(Integer cntrNum) {
        this.cntrNum = cntrNum;
    }

    public Centers(Integer cntrNum, String cntrName) {
        this.cntrNum = cntrNum;
        this.cntrName = cntrName;
    }

    public Integer getCntrNum() {
        return cntrNum;
    }

    public void setCntrNum(Integer cntrNum) {
        this.cntrNum = cntrNum;
    }

    public String getCntrName() {
        return cntrName;
    }

    public void setCntrName(String cntrName) {
        this.cntrName = cntrName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cntrNum != null ? cntrNum.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Centers)) {
            return false;
        }
        Centers other = (Centers) object;
        if ((this.cntrNum == null && other.cntrNum != null) || (this.cntrNum != null && !this.cntrNum.equals(other.cntrNum))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.entities.Centers[ cntrNum=" + cntrNum + " ]";
    }
    
}
