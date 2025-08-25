package com.opd.opd.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="PDATA")
public class PData {


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

    public PData(String name, long nic_no, int age, String email, int mobile_no, String password) {
        this.name = name;
        this.nic_no = nic_no;
        this.age = age;
        this.email = email;
        this.mobile_no = mobile_no;
        this.password = password;
    }
}
