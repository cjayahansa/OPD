package com.opd.opd.Service.IMPL;

import com.opd.opd.DTO.reqwest.PreqwestDTO;
import com.opd.opd.Repo.PRepo;
import com.opd.opd.Service.Pservice;
import com.opd.opd.entity.PationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class pserviceIMPL implements Pservice {
    @Autowired
    public PRepo PRepo;

    @Override
    public String savePdata(PreqwestDTO preqwestDTO) {
        PationData pationData = new PationData(
                preqwestDTO.getName(),
                preqwestDTO.getNic_no(),
                preqwestDTO.getAge(),
                preqwestDTO.getEmail(),
                preqwestDTO.getMobile_no(),
                preqwestDTO.getPassword()
        );
        // Save entity to database
     PationData savedPationData =  PRepo.save(pationData);
        // Return a success message
        return "PData saved successfully for: " + savedPationData.getId();
    }
    @Override
    public String deletePdata(int pid) {
        if(PRepo.existsById(pid)){
            PRepo.deleteById(pid);
            return "PData deleted successfully for ID: " + pid;
        } else {
            return "No PData found with ID: " + pid;
        }
    }

    @Override
    public String getpationpassword(long nicNo) {
        if(PRepo.existsByNicNo(nicNo)){
            PationData pationData = PRepo.findByNicNo(nicNo);
            return "Password for NIC No " + nicNo + " is: " + pationData.getPassword();
        } else {
            return "No PData found with NIC No: " + nicNo;
        }

    }
}
