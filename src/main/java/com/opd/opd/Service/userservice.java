package com.opd.opd.Service;

import com.opd.opd.DTO.reqwest.UserreqwestDTO;


public interface userservice {
    String saveuserdata(UserreqwestDTO userreqwestDTO);

    String deleteuserdata(int userid);

    String getuserpassword(long nic_no);
}
