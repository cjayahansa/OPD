package com.opd.opd.Model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Data
@Table(name="pData")
public class PData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private int NIC_no;
    private int age;
    private String email;
}
