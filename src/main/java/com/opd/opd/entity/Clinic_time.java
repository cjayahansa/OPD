package com.opd.opd.entity;

import com.opd.opd.entity.enums.ClinicType;
import com.opd.opd.entity.enums.Yourconnection;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="clinic_time")
public class Clinic_time {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="clinic_time_seq")
    @SequenceGenerator(name="clinic_time_seq",sequenceName="clinic_time_sequence",allocationSize = 1)
    @Column(name="clinic_time_id")
    private long clinic_id;

    @Enumerated(EnumType.STRING)
    @Column(name="clinic_type",nullable = false)
    private ClinicType clinic_type;

    @Column(name="clinic_date",nullable= false)
    private Date date;

    @Column(name="clinic_time",nullable= false)
    private Time time;

    // ✅ Owning side of relationships
    @ManyToMany
    @JoinTable(
            name = "clinic_hospital",
            joinColumns = @JoinColumn(name = "clinic_id"),
            inverseJoinColumns = @JoinColumn(name = "hospital_id")
    )
    private List<Hospital> hospitals;

    @ManyToMany
    @JoinTable(
            name = "clinic_pation",
            joinColumns = @JoinColumn(name = "clinic_id"),
            inverseJoinColumns = @JoinColumn(name = "pation_id")
    )
    private List<PationData> pationData;

    @ManyToMany
    @JoinTable(
            name = "clinic_another_pation",
            joinColumns = @JoinColumn(name = "clinic_id"),
            inverseJoinColumns = @JoinColumn(name = "another_pation_id")
    )
    private List<anotherPationData> anotherPationData;

    // Constructor using entities
    public Clinic_time(ClinicType clinicType, Date date, Time time,
                       List<Hospital> hospitals,
                       List<PationData> pationData,
                       List<anotherPationData> anotherPationData) {
        this.clinic_type = clinicType;
        this.date = date;
        this.time = time;
        this.hospitals = hospitals;
        this.pationData = pationData;
        this.anotherPationData = anotherPationData;
    }
}
