package com.opd.opd.Controler.admincontroller;

import com.opd.opd.DTO.reqwest.PreqwestDTO;
import com.opd.opd.Service.Pservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pdata")
@CrossOrigin(origins = "*")
public class PationControler {

    @Autowired
    public Pservice pservice;

    @PostMapping ("/Psave")
    public String pdata(@RequestBody PreqwestDTO preqwestDTO) {
      String massage= pservice.savePdata(preqwestDTO);
        return massage;
    }
    @DeleteMapping("/Pdelete")
    public String pdelete (@RequestParam int pid){
        String massage= pservice.deletePdata(pid);
        return massage;
    }

    @GetMapping("/getpassword")
    public String getpassword(@RequestParam long nicNo){
        String password = pservice.getpationpassword(nicNo);
        return password;// Dummy implementation
    }
}
