package com.opd.opd.Controler.admincontroller;

import com.opd.opd.DTO.reqwest.AnotherPation_DTO;
import com.opd.opd.DTO.reqwest.Clinic_req_DTO;
import com.opd.opd.Service.AnotherPationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/AnotherPation")
@CrossOrigin(origins = "*")
public class AnotherPationController {

    @Autowired
    private AnotherPationService anotherPationService;

    @PostMapping("/add_anotherPation")
    public String addAnotherPation(@RequestBody AnotherPation_DTO anotherPation_DTO) {
        String massage = anotherPationService.saveanotherpation(anotherPation_DTO); // Placeholder implementation
        return massage;
    }
}
//@PostMapping("/add-clinic")
//public String addClinic(@RequestBody Clinic_req_DTO clinic_req_DTO) {
//    String massage = clinicService.addClinic(clinic_req_DTO);
//    return massage;
//}