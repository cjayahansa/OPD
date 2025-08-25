package com.opd.opd.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="PDATA")
public class PationData {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pdata_seq")
    @SequenceGenerator(name = "pdata_seq", sequenceName = "pdata_sequence", allocationSize = 1)
    @Column(name = "pid", length = 255)
    private int id;
    @Column(name="pname",length =255 ,nullable = false)
    private String name;
    @Column(name="pnic",nullable = false)
    private long nic_no;
    @Column(name="page",length =255 ,nullable = false)
    private int age;
    @Column(name="pemail",length =255,nullable = false )
    private String email;
    @Column(name="pmobile_no",length =255 ,nullable = false)
    private int mobile_no;
    @Column(name="password",length=255,nullable = false)
    private String password;

    @OneToMany(mappedBy = "pationData", cascade = CascadeType.ALL)
    private List<anotherPationData> anotherPations;

    public PationData(String name, long nic_no, int age, String email, int mobile_no, String password) {
        this.name = name;
        this.nic_no = nic_no;
        this.age = age;
        this.email = email;
        this.mobile_no = mobile_no;
        this.password = password;
    }
}
