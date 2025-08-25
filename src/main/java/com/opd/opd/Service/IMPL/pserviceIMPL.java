package com.opd.opd.Service.IMPL;

import com.opd.opd.DTO.reqwest.PreqwestDTO;
import com.opd.opd.Repo.Repostity;
import com.opd.opd.Service.Pservice;
import com.opd.opd.entity.PData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class pserviceIMPL implements Pservice {
    @Autowired
    public Repostity repostity;

    @Override
    public String savePdata(PreqwestDTO preqwestDTO) {
        PData pData = new PData (
                preqwestDTO.getName(),
                preqwestDTO.getNic_no(),
                preqwestDTO.getAge(),
                preqwestDTO.getEmail(),
                preqwestDTO.getMobile_no(),
                preqwestDTO.getPassword()
        );
        // Save entity to database
     PData savedPData =  repostity.save(pData);
        // Return a success message
        return "PData saved successfully for: " + savedPData.getId();
    }
    @Override
    public String deletePdata(int pid) {
        if(repostity.existsById(pid)){
            repostity.deleteById(pid);
            return "PData deleted successfully for ID: " + pid;
        } else {
            return "No PData found with ID: " + pid;
        }
    }

    @Override
    public String getpationpassword(long nicNo) {
        if(repostity.existsByNicNo(nicNo)){
            PData pData = repostity.findByNicNo(nicNo);
            return "Password for NIC No " + nicNo + " is: " + pData.getPassword();
        } else {
            return "No PData found with NIC No: " + nicNo;
        }

    }
}
