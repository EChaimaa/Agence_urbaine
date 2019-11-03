package com.fstg.Agence.urbaine.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.Agence.urbaine.bean.CommisionItem;
import com.fstg.Agence.urbaine.bean.Commission;

@Repository
public interface CommissionItemDao extends JpaRepository<CommissionItemDao, Long> {
    public List<CommisionItem> findByCommission(Commission commission);
}
