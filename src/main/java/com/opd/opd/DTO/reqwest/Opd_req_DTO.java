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

        private String day;
        private String start_time;
        private String end_time;
        private long hospitalId;

}
