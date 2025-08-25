package com.opd.opd.Service;

import com.opd.opd.DTO.reqwest.PreqwestDTO;
import org.springframework.stereotype.Service;


public interface Pservice {
    String savePdata(PreqwestDTO preqwestDTO);

    String deletePdata(int pid);

    String getpationpassword(long nic_no);
}
