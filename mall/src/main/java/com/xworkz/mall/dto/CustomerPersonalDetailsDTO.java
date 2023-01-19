package com.xworkz.mall.dto;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
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
//@NamedNativeQuery(name = "findByName1",query = "select * from person_details where name=:nm",resultClass = CustomerPersonalDetailsDTO.class)
@NamedNativeQuery(name = "findByName1", query = "SELECT feedback_details.* \r\n"
		+ "FROM feedback_details \r\n"
		+ "left JOIN person_details\r\n"
		+ "ON feedback_details.feedback_id = person_details.feedback_id\r\n"
		+ "where person_details.name=:nm",resultClass = CustomerFeedBackDetailsDTO.class)
@NamedQuery(name = "findByEmail", query = "select alia from CustomerPersonalDetailsDTO alia where alia.email=:em")
@NamedQuery(name = "findByMobileNo", query = "select alia from CustomerPersonalDetailsDTO alia where alia.mobileNo=:mb")
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
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "feedback_id")
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
