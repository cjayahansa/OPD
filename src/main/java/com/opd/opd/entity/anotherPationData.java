package com.opd.opd.entity;

import com.opd.opd.entity.enums.Yourconnection;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
}
