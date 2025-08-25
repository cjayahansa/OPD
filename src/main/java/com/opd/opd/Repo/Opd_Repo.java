package com.opd.opd.Repo;

import com.opd.opd.entity.opd_time;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Opd_Repo extends JpaRepository<opd_time, Long> {
}
