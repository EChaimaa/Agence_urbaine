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
    private MembreCommision chefCommision;
    @OneToMany
    private List<CommisionItem> commisionItems;

    public Commission() {
    }

    public Commission(Long id, Date dateDepartCommission, Date dateFinCommission, MembreCommision chefCommision,
            List<CommisionItem> commisionItems) {
        this.id = id;
        this.dateDepartCommission = dateDepartCommission;
        this.dateFinCommission = dateFinCommission;
        this.chefCommision = chefCommision;
        this.commisionItems = commisionItems;
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

    public List<CommisionItem> getCommisionItems() {
        return commisionItems;
    }

    public void setCommisionItems(List<CommisionItem> commisionItems) {
        this.commisionItems = commisionItems;
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

    public MembreCommision getChefCommision() {
        return chefCommision;
    }

    public void setChefCommision(MembreCommision chefCommision) {
        this.chefCommision = chefCommision;
    }

    @Override
    public String toString() {
        return "Commission [id=" + id + ", dateDepartCommission=" + dateDepartCommission + ", dateFinCommission="
                + dateFinCommission + ", chefCommision=" + chefCommision + ", commisionItems=" + commisionItems + "]";
    }

}
