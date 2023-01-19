package com.xworkz.mall.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.transaction.Transactional;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="feedback_details")
public class CustomerFeedBackDetailsDTO implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int feedback_id;
	@NotNull
	@NotEmpty
	@Size(min = 3, max = 50)
	private String purpose;
	@NotNull
	@NotEmpty
	private String ambience;
	@NotNull
	@NotEmpty
	private String visitedFoodCourt;
	@NotNull
	@NotEmpty
	private String visitedRestRooms;
	private String parkingExperience;
	private String totalExperience;
	@NotNull
	@NotEmpty
	@Size(min = 3, max = 50)
	private String feedBack;

	public CustomerFeedBackDetailsDTO(@NotNull @NotEmpty @Size(min = 3, max = 50) String purpose,
			@NotNull @NotEmpty String ambience, @NotNull @NotEmpty String visitedFoodCourt,
			@NotNull @NotEmpty String visitedRestRooms, String parkingExperience, String totalExperience,
			@NotNull @NotEmpty @Size(min = 3, max = 50) String feedBack) {
		super();
		this.purpose = purpose;
		this.ambience = ambience;
		this.visitedFoodCourt = visitedFoodCourt;
		this.visitedRestRooms = visitedRestRooms;
		this.parkingExperience = parkingExperience;
		this.totalExperience = totalExperience;
		this.feedBack = feedBack;
	}

}
