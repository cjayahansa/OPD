package com.opd.opd.Service.IMPL;

import com.opd.opd.DTO.reqwest.Hospital_req_DTO;
import com.opd.opd.DTO.reqwest.Hospital_up_req_DTO;
import com.opd.opd.DTO.response.HospitalNameResDTO;
import com.opd.opd.Repo.HospitalRepo;
import com.opd.opd.Service.HospitalService;
import com.opd.opd.entity.Hospital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HospitalIMPL implements HospitalService {

    @Autowired
    private HospitalRepo hospitalRepo;

    @Override
    public String addHospital(Hospital_req_DTO hospital_req_DTO) {
        Hospital hospital = new Hospital(
                hospital_req_DTO.getName(),
                hospital_req_DTO.getAddress(),
                hospital_req_DTO.getContact(),
                hospital_req_DTO.getType()
        );
        //save the entity database
        hospitalRepo.save(hospital);
        return "saved successfully" + hospital.getId();
    }

    @Override
    public String updateHospital(Hospital_up_req_DTO hospitalupReqDto) {
          if(hospitalRepo.existsById(hospitalupReqDto.getId())){
              Hospital hospital= hospitalRepo.getReferenceById(hospitalupReqDto.getId());
                hospital.setName(hospitalupReqDto.getName());
                hospital.setAddress(hospitalupReqDto.getAddress());
                hospital.setContact(hospitalupReqDto.getContact());
                hospital.setType(hospitalupReqDto.getType());
                hospitalRepo.save(hospital);
                return "update successfully"+hospital.getId();
          }else  {
              throw new RuntimeException("hospital not found");
        }
    }

    @Override
    public String deletehospital(long id) {
        if(hospitalRepo.existsById(id))
        {
            hospitalRepo.deleteById(id);
            return "deleted successfully"+id;
    }else{
        throw new RuntimeException("hospital not found");
        }
    }

    @Override
    public List<HospitalNameResDTO> getAllHospitalNames() {
        return hospitalRepo.getAllHospitalNames();
    }


}
//@Override
//public List<CustomerDto> getAllCustomer() {
//    List<CustomerEntity> getallcustomer = coustomerRepo.findAll();
//    if (!getallcustomer.isEmpty()) {
//
//        List<CustomerDto> customerDtolist = new ArrayList<>();
//        for (CustomerEntity customerEntity : getallcustomer) {
//            CustomerDto customerDto = new CustomerDto(
//                    customerEntity.getCustomerid(),
//                    customerEntity.getCustomername(),
//                    customerEntity.getCustomeraddress(),
//                    customerEntity.getCustomerSalary(),
//                    customerEntity.getContactNumber(),
//                    customerEntity.getNic(),
//                    customerEntity.isActive()
//            );
//            customerDtolist.add(customerDto);
//        }
//
//        return customerDtolist;
//    } else {
//        throw new NotFoundExceptio("no data found");
//    }
//}