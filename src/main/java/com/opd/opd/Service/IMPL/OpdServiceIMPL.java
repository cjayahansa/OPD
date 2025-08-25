package com.opd.opd.Service.IMPL;

import com.opd.opd.DTO.reqwest.Opd_req_DTO;
import com.opd.opd.Repo.Opd_Repo;
import com.opd.opd.Service.OpdService;
import com.opd.opd.entity.opd_time;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.sql.Time;

@Service
public class OpdServiceIMPL implements OpdService {

    @Autowired
    public Opd_Repo opd_Repo;


    @Override
    public String addOpdTime(Opd_req_DTO opd_req_DTO) {
        java.sql.Date day = java.sql.Date.valueOf(opd_req_DTO.getDay());
        java.sql.Time startTime = java.sql.Time.valueOf(opd_req_DTO.getStart_time());
        java.sql.Time endTime = java.sql.Time.valueOf(opd_req_DTO.getEnd_time());

        opd_time opdtime = new opd_time(day, startTime, endTime, opd_req_DTO.getHospitalId());

        opd_Repo.save(opdtime);
        return "saved successfuly"+ opdtime.getId();
    }
}
