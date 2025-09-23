package com.opd.opd.Service.IMPL;

import com.opd.opd.DTO.reqwest.Clinic_req_DTO;
import com.opd.opd.DTO.reqwest.Opd_req_DTO;
import com.opd.opd.Repo.*;
import com.opd.opd.Service.clinicService;
import com.opd.opd.entity.*;
import com.opd.opd.entity.enums.ClinicType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.util.Date;
import java.util.List;

@Service
public class ClinicServiceIMPL implements clinicService {

    @Autowired
    public ClinicRepo clinicRepo;
    @Autowired
    public HospitalRepo HospitalRepo;
    @Autowired
    public AnotherPationRepo AnotherPationRepo;

    @Autowired
    public PRepo PRepo;

    @Override
    public String addClinic(Clinic_req_DTO clinicReqDto) {

        List<Hospital> hospitals = HospitalRepo.findAllById(clinicReqDto.getHospitalIds());
        List<PationData> patients = PRepo.findAllById(clinicReqDto.getPationDataIds());
        List<anotherPationData> anotherPatients = AnotherPationRepo.findAllById(clinicReqDto.getAnotherPationDataIds());

        Clinic_time clinicTime = new Clinic_time(
                clinicReqDto.getClinic_type(),
                clinicReqDto.getDate(),
                clinicReqDto.getTime(),
                hospitals,
                patients,
                anotherPatients
        );


        clinicRepo.save(clinicTime);
        return "saved successfully";
    }
}
