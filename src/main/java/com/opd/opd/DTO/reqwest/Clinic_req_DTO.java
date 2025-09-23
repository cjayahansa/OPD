package com.opd.opd.DTO.reqwest;

import com.opd.opd.entity.Hospital;
import com.opd.opd.entity.PationData;
import com.opd.opd.entity.anotherPationData;
import com.opd.opd.entity.enums.ClinicType;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Clinic_req_DTO {
    private ClinicType clinic_type;
    private Date date;
    private Time time;
    private List<Long> hospitalIds;
    private List<Integer> pationDataIds;
    private List<Long> anotherPationDataIds;

}
