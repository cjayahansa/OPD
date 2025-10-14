package com.opd.opd.Service.IMPL;

import com.opd.opd.DTO.reqwest.UserreqwestDTO;
import com.opd.opd.Repo.UserRepo;
import com.opd.opd.Service.userservice;
import com.opd.opd.entity.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userserviceIMPL implements userservice {
    @Autowired
    public UserRepo UserRepo;

    @Override
    public String saveuserdata(UserreqwestDTO userreqwestDTO) {
        UserData userData = new UserData(
                userreqwestDTO.getName(),
                userreqwestDTO.getNic_no(),
                userreqwestDTO.getAge(),
                userreqwestDTO.getEmail(),
                userreqwestDTO.getMobile_no(),
                userreqwestDTO.getPassword()
        );
        // Save entity to database
     UserData savedUserData =  UserRepo.save(userData);
        // Return a success message
        return "PData saved successfully for: " + savedUserData.getId();
    }
    @Override
    public String deleteuserdata(int uerid) {
        if(UserRepo.existsById(uerid)){
            UserRepo.deleteById(uerid);
            return "PData deleted successfully for ID: " + uerid;
        } else {
            return "No PData found with ID: " + uerid;
        }
    }

    @Override
    public String getuserpassword(long nicNo) {
        if(UserRepo.existsByNicNo(nicNo)){
            UserData userData = UserRepo.findByNicNo(nicNo);
            return "Password for NIC No " + nicNo + " is: " + userData.getPassword();
        } else {
            return "No PData found with NIC No: " + nicNo;
        }

    }
}
