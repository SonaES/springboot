package com.UST.districts.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "final")
public class districtState {
        private @Id String state;
        private  String district;
    }

