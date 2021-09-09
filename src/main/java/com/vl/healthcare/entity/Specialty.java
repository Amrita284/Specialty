package com.vl.healthcare.entity;


import lombok.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Specialty {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long specialtyId;
	private String name;
}
