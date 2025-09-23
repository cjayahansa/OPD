package com.opd.opd.entity;

import com.opd.opd.entity.enums.Yourconnection;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="another_pation_data")
public class anotherPationData {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "anotherpdata_seq")
    @SequenceGenerator(name = "anotherpdata_seq", sequenceName = "anotherpdata_sequence", allocationSize = 1)
    @Column(name="another_pation_id", length = 255)
    private long anotherPationid;
    @Column(name="another_pation_nic")
    private long anotherPationnic;
    @Column(name="another_pation_name",length =255 ,nullable = false)
    private String Name;
    @Column(name="another_pation_age",nullable = false)
    private int age;
    @Column(name="another_pation_maride",nullable = false)
    private Boolean maride;
    @Enumerated(EnumType.STRING)
    @Column(name="another_pation_type",length =255,nullable = false )
    private Yourconnection yourconnection;

    @ManyToOne
    @JoinColumn(name = "pid", nullable = false)
    private PationData pationData;

    @ManyToMany
    @JoinTable(
            name = "another_pation_clinic",
            joinColumns = @JoinColumn(name = "another_pation_id"),
            inverseJoinColumns = @JoinColumn(name = "clinic_time_id")
    )
    private List<Clinic_time> clinicTimes;

    public anotherPationData(String name, int age, Boolean maride, Yourconnection yourconnection, long pationDataId) {
        Name = name;
        this.age = age;
        this.maride = maride;
        this.yourconnection = yourconnection;
        this.pationData = new PationData();
        this.pationData.setId((int) pationDataId);
    }
}
