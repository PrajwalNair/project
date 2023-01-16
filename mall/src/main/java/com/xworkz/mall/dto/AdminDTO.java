package com.xworkz.mall.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

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
@NamedQuery(name = "updateNoOfWrongAttemptsByName", query = "update AdminDTO alia set alia.noOfWrongAttempts=:na where alia.name=:nm")
@NamedQuery(name = "updateFirstLoginByName", query = "update AdminDTO alia set alia.firstLogin=:lg where alia.name=:nm")
@NamedQuery(name = "updateAccountLockedByName", query = "update AdminDTO alia set alia.accountLocked=:al where alia.name=:nm")
@NamedQuery(name = "updateGeneratedPasswordByName", query = "update AdminDTO alia set alia.generatedPassword=:gpas where alia.name=:nm")
@NamedQuery(name = "updatePasswordByGeneratedPassword", query = "update AdminDTO alia set alia.password=:ps where alia.generatedPassword=:gs")
@NamedQuery(name = "findByMallName", query = "select alia from AdminDTO alia where alia.mallName=:mn")
@NamedQuery(name = "updateGeneratedPasswordByMallName", query = "update AdminDTO alia set alia.generatedPassword=:gp where alia.mallName=:mn")
@NamedQuery(name = "updateLoginCountByName", query = "update AdminDTO alia set alia.loginCount=:lc where alia.name=:nm")
@NamedQuery(name = "updateTimeByMallName", query = "update AdminDTO alia set alia.time=:ti where alia.mallName=:ml")
@NamedQuery(name = "updateAcountUnlockByName", query = "update AdminDTO alia set alia.accountLocked=:st where alia.mallName=:nm")
@NamedQuery(name = "updateNoOfWrongAttemptsByMallName", query = "update AdminDTO alia set alia.noOfWrongAttempts=:no where alia.mallName=:mn")
@NamedQuery(name = "findByGeneratedPassword", query = "select alia from AdminDTO alia where alia.generatedPassword=:ps")
@NamedQuery(name = "updateGeneratedPasswordTimeByGeneratedPassword", query = "update AdminDTO alia set alia.generatedPasswordTime=:gpt where alia.generatedPassword=:gp")
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
	private int firstLogin;
	private String generatedPassword;
	private int loginCount;
	private LocalTime time;
	private LocalTime generatedPasswordTime;

	public AdminDTO(String createdBy, LocalDate createdDate, String updatedBy, LocalDate updatedDate, String name,
			String password, String mallName, boolean active, String accountLocked, int noOfWrongAttempts,
			String mallEmail, int firstLogin, String generatedPassword, int loginCount, LocalTime time, LocalTime generatedPasswordTime) {
		super(createdBy, createdDate, updatedBy, updatedDate);
		this.name = name;
		this.password = password;
		this.mallName = mallName;
		this.active = active;
		this.accountLocked = accountLocked;
		this.noOfWrongAttempts = noOfWrongAttempts;
		this.mallEmail = mallEmail;
		this.firstLogin = firstLogin;
		this.generatedPassword = generatedPassword;
		this.loginCount = loginCount;
		this.time = time;
		this.generatedPasswordTime=generatedPasswordTime;
	}

}
