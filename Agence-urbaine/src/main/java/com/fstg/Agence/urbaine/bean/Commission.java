package com.fstg.Agence.urbaine.bean;

import java.util.Date;
import java.util.List;

//import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Commission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ref;
    @Temporal(TemporalType.DATE)
    private Date dateDepartCommission;
    @Temporal(TemporalType.DATE)
    private Date dateFinCommission;
    @ManyToOne
    private MembreCommission chefCommission;
    @OneToMany
    private List<CommissionItem> commissionItems;

    public Commission() {
    }

    public Commission(Long id, Date dateDepartCommission, Date dateFinCommission, MembreCommission chefCommision,
            List<CommissionItem> commissionItems) {
        this.id = id;
        this.dateDepartCommission = dateDepartCommission;
        this.dateFinCommission = dateFinCommission;
        this.chefCommission = chefCommision;
        this.commissionItems = commissionItems;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateDepartCommission() {
        return dateDepartCommission;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public List<CommissionItem> getCommissionItems() {
        return commissionItems;
    }

    public void setCommissionItems(List<CommissionItem> commissionItems) {
        this.commissionItems = commissionItems;
    }

    public void setDateDepartCommission(Date dateDepartCommission) {
        this.dateDepartCommission = dateDepartCommission;
    }

    public Date getDateFinCommission() {
        return dateFinCommission;
    }

    public void setDateFinCommission(Date dateFinCommission) {
        this.dateFinCommission = dateFinCommission;
    }

    public MembreCommission getChefCommision() {
        return chefCommission;
    }

    public void setChefCommision(MembreCommission chefCommision) {
        this.chefCommission = chefCommision;
    }

    @Override
    public String toString() {
        return "Commission [id=" + id + ", dateDepartCommission=" + dateDepartCommission + ", dateFinCommission="
                + dateFinCommission + ", chefCommission=" + chefCommission + ", commisionItems=" + commissionItems + "]";
    }

}
