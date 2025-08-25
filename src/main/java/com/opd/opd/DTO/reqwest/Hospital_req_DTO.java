package com.opd.opd.DTO.reqwest;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hospital_req_DTO {

    private String name;
    private String address;
    private long contact;
    private String type;



}
