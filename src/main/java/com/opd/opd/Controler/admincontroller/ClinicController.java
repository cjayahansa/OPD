package com.opd.opd.Controler.admincontroller;

import com.opd.opd.DTO.reqwest.Clinic_req_DTO;
import com.opd.opd.DTO.reqwest.Hospital_req_DTO;
import com.opd.opd.DTO.reqwest.Hospital_up_req_DTO;
import com.opd.opd.Service.clinicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/clinic")
@CrossOrigin(origins = "*")
public class ClinicController {

    @Autowired
    private clinicService clinicService;

    @PostMapping("/add-clinic")
    public String addClinic(@RequestBody Clinic_req_DTO clinic_req_DTO) {
        String massage = clinicService.addClinic(clinic_req_DTO);
        return massage;
    }
}
