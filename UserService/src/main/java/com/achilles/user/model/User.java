package com.achilles.user.model;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.achilles.user.model.UserConstants.Gender;

public class User {
	private String id;
	@Length(min = 5, max = 20)
	private String userName;
	@Email
	private String email;
	@Length(min = 5, max = 50)
	private String firstName;
	private String middleName;
	@NotEmpty
	private String lastName;
	@NotNull
	private Gender gender;
	private LocalDate dateOfBirth;
	private List<Entity<?>> entities;
	private List<Tag> tags;

	public User() {
		super();
	}

	public User(String id, @Min(5) @Max(20) @Length(min = 5, max = 20) String userName, @Email String email,
			@Length(min = 5, max = 50) String firstName, String middleName, @NotEmpty String lastName,
			@NotNull Gender gender, LocalDate dateOfBirth, List<Entity<?>> entities, List<Tag> tags) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.entities = entities;
		this.tags = tags;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public List<Entity<?>> getEntities() {
		return entities;
	}

	public void setEntities(List<Entity<?>> entities) {
		this.entities = entities;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", email=" + email + ", firstName=" + firstName
				+ ", middleName=" + middleName + ", lastName=" + lastName + ", gender=" + gender + ", dateOfBirth="
				+ dateOfBirth + ", entities=" + entities + ", tags=" + tags + "]";
	}
}
