package com.xworkz.mall.dto;

import java.time.LocalDate;

import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class AbstractDTO {
	private String createdBy;
	private LocalDate createdDate;
	private String updatedBy;
	private LocalDate updatedDate;

}
