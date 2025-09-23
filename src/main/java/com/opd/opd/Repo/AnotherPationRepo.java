package com.opd.opd.Repo;

import com.opd.opd.entity.anotherPationData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnotherPationRepo extends JpaRepository<anotherPationData,Long> {
}
