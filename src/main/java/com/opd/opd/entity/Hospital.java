package com.opd.opd.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="hospital")
public class Hospital {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hospital_seq")
    @SequenceGenerator(name = "hospital_seq", sequenceName = "hospital_sequence", allocationSize = 1)
    @Column(name = "hospital_id", length = 255)
    private long id;
    @Column(name="hospital_name",length=255,nullable= false)
    private String name;
    @Column(name="hospital_address",length=255,nullable= false)
    private String address;
    @Column(name="hospital_contact",length=255,nullable= false)
    private long contact;
    @Column(name="hospital_type",length=255,nullable= false)
    private String type;

    @OneToMany(mappedBy = "hospital", cascade = CascadeType.ALL, orphanRemoval = true)
    // cascade = CascadeType.ALL For example, saving or deleting a hospital will also save or delete its associated opd_time records.//
    //orphanRemoval = true: If an opd_time is removed from the hospital's opdTimes list, JPA will automatically delete that opd_time from the database. This keeps the database in sync with the entity relationships. //
    private List<opd_time> opdTimes;


    public Hospital(String name, String address, long contact, String type) {
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.type = type;
    }


}
