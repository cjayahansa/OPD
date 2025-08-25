package com.opd.opd.DTO.reqwest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PreqwestDTO {
 //dto eka data illana ewa
    private String name;
    private long nic_no;
    private int age;
    private String email;
    private int mobile_no;
    private String password;


}
