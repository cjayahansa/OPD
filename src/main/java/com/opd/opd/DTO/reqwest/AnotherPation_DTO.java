package com.opd.opd.DTO.reqwest;

import com.opd.opd.entity.Clinic_time;
import com.opd.opd.entity.PationData;
import com.opd.opd.entity.enums.Yourconnection;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnotherPation_DTO {
    private long anotherPationnic;
    private String Name;
    private int age;
    private Boolean maride;
    private Yourconnection yourconnection;
    private long pationDataId;
}
