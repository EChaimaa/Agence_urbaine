package com.fstg.Agence.urbaine.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.Agence.urbaine.bean.Commission;
import com.fstg.Agence.urbaine.bean.MembreCommission;

@Repository
public interface CommissionDao extends JpaRepository<Commission, Long> {
   public Commission findByRef(String ref);
   public List<Commission> findByDateDepartCommission(Date date);
   public List<Commission> findByDateFinCommission(Date date);
   public List<Commission> findByDateCommission(Date dateDepart, Date dateFin);
   public List<Commission> findByChefCommission(MembreCommission chefCommission);
   //public List<Commission> findByDateFinCommissionGreaterThanAndDateDepartCommissionLowerThan(Date date1, Date date2);
   
}
