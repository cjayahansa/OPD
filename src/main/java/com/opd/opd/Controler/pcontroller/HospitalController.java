package com.opd.opd.Controler.pcontroller;

import com.opd.opd.DTO.reqwest.Hospital_req_DTO;
import com.opd.opd.DTO.response.HospitalNameResDTO;
import com.opd.opd.Service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hospital")
@CrossOrigin(origins = "*")
public class HospitalController {


    @Autowired
    private HospitalService hospitalService;


    @GetMapping("/getallName-hospital")
    private List<HospitalNameResDTO> hospital() {
        List<HospitalNameResDTO> hospitalNameResDTO = hospitalService.getAllHospitalNames();
        return hospitalNameResDTO;

    }

}
//@GetMapping(path="/get-all-customer")
//public List<CustomerDto> getAllCustomer() {
//    List<CustomerDto> customerDto = controlerSeirvice.getAllCustomer();
//    return customerDto;
//}