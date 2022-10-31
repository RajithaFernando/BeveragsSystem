package com.example.vue.demo.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.transaction.Transactional;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@Table(name= "campaign", schema = "targetSchemaName")

@Transactional
@org.springframework.transaction.annotation.Transactional
@NoArgsConstructor
@AllArgsConstructor
public class Campaign {
   private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long campaignId;
    private String name;
    private String status;
    private String createDate;
    private String createdBy;
    private String description;
    private String startDate;
    private String startTime;
    private String site;
    private String endDate;
     


}
