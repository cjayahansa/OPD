package com.opd.opd.DTO.reqwest;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Time;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Opd_req_DTO {

    private Date day;
    private Time start_time;
    private Time end_time;
    private Long hospitalId;

}
