package com.opd.opd.Controler.admincontroller;

import com.opd.opd.DTO.reqwest.UserreqwestDTO;
import com.opd.opd.Service.userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user/data")
@CrossOrigin(origins = "*")
public class UserControler {

    @Autowired
    public userservice userservice;

    @PostMapping ("/user/save")
    public String pdata(@RequestBody UserreqwestDTO userreqwestDTO) {
      String massage= userservice.saveuserdata(userreqwestDTO);
        return massage;
    }
    @DeleteMapping("/user/delete")
    public String pdelete (@RequestParam int userid){
        String massage= userservice.deleteuserdata(userid);
        return massage;
    }

    @GetMapping("/getpassword")
    public String getpassword(@RequestParam long nicNo){
        String password = userservice.getuserpassword(nicNo);
        return password;// Dummy implementation
    }
}
