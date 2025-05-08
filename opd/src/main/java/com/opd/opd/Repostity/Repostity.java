package com.opd.opd.Repostity;

import com.opd.opd.Model.PData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repostity extends JpaRepository<PData, Integer> {
}
