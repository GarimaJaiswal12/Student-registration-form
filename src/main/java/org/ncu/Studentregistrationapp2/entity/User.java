package org.ncu.Studentregistrationapp2.entity;

import java.util.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class User {
		@NotNull(message="is required")
	@Size(min=2, message="is required")
	private String name;
	@NotNull(message="is required")
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="only char/digit allowed")
	private String password;
	@NotNull(message="is required")
	@Pattern(regexp="^[a-zA-Z0-9]{10}", message="only char/digit allowed")
	private String PhoneNo;
	@NotEmpty(message="is required")
	private String AadharId;
	@NotEmpty(message="is required")
	
	
	
	
	public String getPhoneNo() {
		return PhoneNo;
	}



	public void setPhoneNo(String phoneNo) {
		PhoneNo = phoneNo;
	}



	public String getAadharId() {
		return AadharId;
	}



	public void setAadharId(String aadharId) {
		AadharId = aadharId;
	}

	@NotEmpty(message="is required")
	private String Email;
    public String getEmail() {
		return Email;
	}



	public void setEmail(String email) {
		Email = email;
	}
	
	



		@DateTimeFormat(iso= ISO.DATE)
	@NotNull(message="is required")
	@Past
  private  Date date;
	public String getOptions() {
		return options;
	}

	

	public void setOptions(String options) {
		this.options = options;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	

	private String Name;
	@NotNull(message="is required")
	@Size(min=2, message="is required")
	
	private String Age;
	
	@NotNull(message="is required")
	private String gender;
	
	private List<String> otheroptions;
	
	@NotEmpty(message="is required")
	private String instruction;
	@NotEmpty(message="is required")
	private String options;
	private Map<String, String> ageOptions;
	@NotEmpty(message="is required")
    private String State;
    private Map<String, String> stateOptions;
	public Map<String, String> getStateOptions() {
		return stateOptions;
	}



	public void setStateOptions(Map<String, String> stateOptions) {
		this.stateOptions = stateOptions;
	}



	public User() {
		otheroptions = new ArrayList<String>();
		otheroptions.add("Java");
		otheroptions.add("C/C++");
		otheroptions.add("C#");
		otheroptions.add("Python");
		otheroptions.add("JavaScript");
		
//filling data insi();
		ageOptions = new HashMap<String, String>();
		ageOptions.put("Child", "< 1 year old");
		ageOptions.put("Adult", "<18 year old");
		stateOptions = new HashMap<String, String>();
		stateOptions.put("DL", "Delhi");
		stateOptions.put("HR", "Haryana");

	}
     
	public Map<String, String> getAgeOptions() {
		return ageOptions;
		
	}

	public void setAgeOptions(Map<String, String> ageOptions) {
		this.ageOptions = ageOptions;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
	return "User [name=" + name + ", password=" + password + ",  Age=" + Age + ", gender=" + gender
	+ ", otheroptions=" + otheroptions + ", instruction=" + instruction + "]";
	}

	public String getPassword() {
	return password;
	}

	public void setPassword(String password) {
	this.password = password;
	}

	public String getAge() {
	return Age;
	}

	public void setAge(String age) {
	Age = age;
	}

	public String getGender() {
	return gender;
	}

		public void setGender(String gender) {
		this.gender = gender;
		}

	public List<String> getOtheroptions() {
	return otheroptions;
	}

	public String getState() {
		return State;
	}



	public void setState(String state) {
		State = state;
	}



	public void setOtheroptions(List<String> otheroptions) {
	this.otheroptions = otheroptions;
	}

	public String getInstruction() {
	return instruction;
	}

	public void setInstruction(String instruction) {
	this.instruction = instruction;
	}

	}
