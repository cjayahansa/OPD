package com.opd.opd.Repo;

import com.opd.opd.entity.Clinic_time;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClinicRepo extends JpaRepository<Clinic_time, Long> {
}
