package com.opd.opd.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Time;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="opd_time")
public class opd_time {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "opd_seq")
    @SequenceGenerator(name = "opd_seq", sequenceName = "opd_sequence", allocationSize = 1)
    @Column(name="opd_id", length = 255)
    private long id;
    @Column(name="opd_day",length=255,nullable= false)
    private Date day;
    @Column(name="opd_start_time",length=255,nullable= false)
    private Time start_time;
    @Column(name="opd_end_time",length=255,nullable= false)
    private Time end_time;

    @ManyToOne
    @JoinColumn(name = "hospital_id", nullable = false)
    private Hospital hospital;

    public opd_time(Date day, Time startTime, Time endTime, long hospitalId) {
        this.day = day;
        this.start_time = startTime;
        this.end_time = endTime;
        this.hospital = new Hospital();
        this.hospital.setId(hospitalId);
    }
}
