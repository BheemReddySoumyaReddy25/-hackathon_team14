package com.dbs.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name="APPOINTMENT")
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="date")
    private Date date;
    @Column(name="status")
    private String status;
    @Column(name="time")
    private Time time;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "WM_id")
    private WM wm;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "HNI_id")
    private HNI hni;
}
