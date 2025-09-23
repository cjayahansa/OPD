package com.opd.opd.Repo;

import com.opd.opd.entity.Hospital;
import com.opd.opd.entity.PationData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PRepo extends JpaRepository<PationData, Integer> {

    @Query("SELECT CASE WHEN COUNT(p) > 0 THEN true ELSE false END FROM PationData p WHERE p.nic_no = :nicNo")
    boolean existsByNicNo(long nicNo);
    @Query("SELECT p FROM PationData p WHERE p.nic_no = :nicNo")
    PationData findByNicNo(long nicNo);

}
