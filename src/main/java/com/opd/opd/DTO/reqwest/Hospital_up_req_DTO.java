package com.opd.opd.DTO.reqwest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hospital_up_req_DTO {
    private long id;
    private String name;
    private String address;
    private long contact;
    private String type;


}
