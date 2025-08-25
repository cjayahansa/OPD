package com.opd.opd.Controler.admincontroller;

import com.opd.opd.DTO.reqwest.Hospital_req_DTO;
import com.opd.opd.DTO.reqwest.Hospital_up_req_DTO;
import com.opd.opd.Service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/hospital")
@CrossOrigin(origins = "*")
public class HospitaladminController {

    @Autowired
    private HospitalService hospitalService;

    @PostMapping("/add-hospital")
    public String addHospital(@RequestBody Hospital_req_DTO hospital_req_DTO) {
        String massage = hospitalService.addHospital(hospital_req_DTO);
        return massage;
    }

    @PostMapping("/update-hospital")
    public String updateHospital(@RequestBody Hospital_up_req_DTO hospital_up_req_DTO) {
        String massage = hospitalService.updateHospital(hospital_up_req_DTO);
        return massage;
    }

    @DeleteMapping("/delete-hospital/{id}")
    public String deleteHospital(@PathVariable(value = "id") long id) {
        // Assuming you have a delete method in your service
        String massage = hospitalService.deletehospital(id); // hospitalService.deleteHospital(id);
        return massage;
    }
}
