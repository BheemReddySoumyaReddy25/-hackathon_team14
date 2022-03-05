package com.dbs.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="hni")
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class HNI {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "full_name")
    private String fullName;

}
