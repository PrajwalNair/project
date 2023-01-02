package com.xworkz.mall.dto;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "mall_admin")
@NamedQuery(name = "findByNameAndPassword", query = "select alia from AdminDTO alia where alia.name=:nm and alia.password=:ps")
@NamedQuery(name = "findByName", query = "select alia from AdminDTO alia where alia.name=:nm")
@NamedQuery(name = "updateNoOfWrongAttempts", query = "update AdminDTO alia set alia.noOfWrongAttempts=:na where alia.name=:nm")
@NamedQuery(name = "updateLoginStatus", query = "update AdminDTO alia set alia.loginStatus=:lg where alia.name=:nm")
@NamedQuery(name = "updateAccountLocked", query = "update AdminDTO alia set alia.accountLocked=:al where alia.name=:nm")
public class AdminDTO extends AbstractDTO implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String password;
	private String mallName;
	private boolean active;
	private String accountLocked;
	private int noOfWrongAttempts;
	private String mallEmail;
	private int loginStatus;

	public AdminDTO(String createdBy, LocalDate createdDate, String updatedBy, LocalDate updatedDate, String name,
			String password, String mallName, boolean active, String accountLocked, int noOfWrongAttempts,
			String mallEmail, int loginStatus) {
		super(createdBy, createdDate, updatedBy, updatedDate);
		this.name = name;
		this.password = password;
		this.mallName = mallName;
		this.active = active;
		this.accountLocked = accountLocked;
		this.noOfWrongAttempts = noOfWrongAttempts;
		this.mallEmail = mallEmail;
		this.loginStatus = loginStatus;
	}

}
