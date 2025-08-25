package com.opd.opd.Controler.admincontroller;

import com.opd.opd.DTO.reqwest.Opd_req_DTO;
import com.opd.opd.Service.OpdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/opd")
@CrossOrigin(origins = "*")
public class Opd_time_Controller {

    @Autowired
    private OpdService OpdService;


    @PostMapping("/add/opd-time")
    public String addOpdTime(@RequestBody  Opd_req_DTO opd_req_DTO) {
        String massage = OpdService.addOpdTime(opd_req_DTO);
        return massage;
    }
}
