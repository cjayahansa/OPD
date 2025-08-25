package com.opd.opd.Service;

import com.opd.opd.DTO.reqwest.Hospital_req_DTO;
import com.opd.opd.DTO.reqwest.Hospital_up_req_DTO;
import com.opd.opd.DTO.reqwest.PreqwestDTO;
import com.opd.opd.DTO.response.HospitalNameResDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface HospitalService {
    String addHospital(Hospital_req_DTO hospital_req_DTO);

    String updateHospital(Hospital_up_req_DTO hospitalupReqDto);

    String deletehospital(long id);

    List<HospitalNameResDTO> getAllHospitalNames();
}
