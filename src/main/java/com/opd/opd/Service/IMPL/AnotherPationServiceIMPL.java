package com.opd.opd.Service.IMPL;

import com.opd.opd.DTO.reqwest.AnotherPation_DTO;
import com.opd.opd.Repo.AnotherPationRepo;
import com.opd.opd.Service.AnotherPationService;
import com.opd.opd.entity.anotherPationData;
import com.opd.opd.entity.enums.Yourconnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnotherPationServiceIMPL implements AnotherPationService {

    @Autowired
    private AnotherPationRepo anotherPationRepo;

    @Override
    public String saveanotherpation(AnotherPation_DTO anotherPationDto) {
        anotherPationData anotherPationData = new anotherPationData(
                anotherPationDto.getName(),
                anotherPationDto.getAge(),
                anotherPationDto.getMaride(),
                anotherPationDto.getYourconnection(),
                anotherPationDto.getPationDataId()

        );
        anotherPationRepo.save(anotherPationData);
        return "saved successfully" ;
    }
}