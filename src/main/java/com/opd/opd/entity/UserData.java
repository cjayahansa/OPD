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
@Table(name="USERDATA")
public class UserData {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_data_seq")
    @SequenceGenerator(name = "user_data_seq", sequenceName = "user_data_sequence", allocationSize = 1)
    @Column(name = "user_id", length = 255)
    private int id;
    @Column(name="user_name",length =255 ,nullable = false)
    private String name;
    @Column(name="user_nic",nullable = false)
    private long nic_no;
    @Column(name="user_age",length =255 ,nullable = false)
    private int age;
    @Column(name="user_email",length =255,nullable = false )
    private String email;
    @Column(name="user_mobile_no",length =255 ,nullable = false)
    private int mobile_no;
    @Column(name="user_password",length=255,nullable = false)
    private String password;


    public UserData(String name, long nic_no, int age, String email, int mobile_no, String password) {
        this.name = name;
        this.nic_no = nic_no;
        this.age = age;
        this.email = email;
        this.mobile_no = mobile_no;
        this.password = password;
    }
}
