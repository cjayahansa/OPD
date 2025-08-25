package com.opd.opd.Repo;

import com.opd.opd.entity.PData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface Repostity extends JpaRepository<PData, Integer> {

    @Query("SELECT CASE WHEN COUNT(p) > 0 THEN true ELSE false END FROM PData p WHERE p.nic_no = :nicNo")
    boolean existsByNicNo(long nicNo);
    @Query("SELECT p FROM PData p WHERE p.nic_no = :nicNo")
    PData findByNicNo(long nicNo);
}
