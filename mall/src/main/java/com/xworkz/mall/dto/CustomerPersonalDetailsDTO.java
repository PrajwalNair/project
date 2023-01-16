package com.xworkz.mall.dto;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.transaction.Transactional;
import javax.validation.constraints.Email;
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
@Table(name = "person_details")
public class CustomerPersonalDetailsDTO implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customer_id;
	@NotNull
	@NotEmpty
	@Size(min = 3, max = 25)
	private String name;
	@NotNull
	@NotEmpty
	@Size(min = 3, max = 40)
	@Email
	private String email;
	private long mobileNo;
	private int age;
	@NotNull
	@NotEmpty
	@Size(min = 3, max = 40)
	private String country;
	@NotNull
	@NotEmpty
	@Size(min = 3, max = 40)
	private String state;
	@NotNull
	@NotEmpty
	@Size(min = 3, max = 40)
	private String city;
	private int pincode;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_feedback_id",referencedColumnName = "feedback_id")
	private CustomerFeedBackDetailsDTO feedBackDTO;

	public CustomerPersonalDetailsDTO(@NotNull @NotEmpty @Size(min = 3, max = 25) String name,
			@NotNull @NotEmpty @Size(min = 3, max = 40) @Email String email, long mobileNo, int age,
			@NotNull @NotEmpty @Size(min = 3, max = 40) String country,
			@NotNull @NotEmpty @Size(min = 3, max = 40) String state,
			@NotNull @NotEmpty @Size(min = 3, max = 40) String city, int pincode,
			CustomerFeedBackDetailsDTO feedBackDTO) {
		super();
		this.name = name;
		this.email = email;
		this.mobileNo = mobileNo;
		this.age = age;
		this.country = country;
		this.state = state;
		this.city = city;
		this.pincode = pincode;
		this.feedBackDTO = feedBackDTO;
	}
	
	

}
