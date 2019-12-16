package com.fstg.Agence.urbaine.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.fstg.Agence.urbaine.bean.Commission;
import com.fstg.Agence.urbaine.bean.MembreCommission;

@Repository
public interface CommissionDao extends JpaRepository<Commission, Long> {
   public Commission findByRef(String ref);
   public List<Commission> findByDateDepartCommission(Date date);
   public List<Commission> findByDateFinCommission(Date date);
   
   @Query("select c from Commission c where ?1 between dateDepartCommission and dateFinCommission")
   public List<Commission> findCommissionGoingOn(Date date);
   
   public List<Commission> findByDateDepartCommissionAfter(Date date);
   public List<Commission> findByDateFinCommissionBefore(Date date);
   public List<Commission> findByChefCommission(MembreCommission chefCommission);
   
}
