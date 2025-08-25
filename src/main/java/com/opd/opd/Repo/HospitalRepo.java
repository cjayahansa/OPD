package com.opd.opd.Repo;

import com.opd.opd.DTO.response.HospitalNameResDTO;
import com.opd.opd.entity.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface HospitalRepo extends JpaRepository<Hospital, Long>{
    @Query("SELECT new com.opd.opd.DTO.response.HospitalNameResDTO(name) FROM Hospital ")
    List<HospitalNameResDTO> getAllHospitalNames();
}


//@Repository
//public interface Repostity extends JpaRepository<PData, Integer> {
//}
