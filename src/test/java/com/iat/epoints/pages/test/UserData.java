package com.iat.epoints.pages.test;
/**
 * This class stores all the user data fields that are used for signup page along with the constructors, setters and getters.
 */

public class UserData {
	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private String promoCode;
	private String emailPath;
	private String passwordPath;
	private String firstNamePath;
	private String lastNamePath;
	private String promoCodePath;
	private String submittPath;
	
	public UserData(String email, String password, String firstName, String lastName, String promoCode,
			String emailPath, String passwordPath, String firstNamePath, String lastNamePath, String promoCodePath,
			String submittPath) {
		this.email = email;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.promoCode = promoCode;
		this.emailPath = emailPath;
		this.passwordPath = passwordPath;
		this.firstNamePath = firstNamePath;
		this.lastNamePath = lastNamePath;
		this.promoCodePath = promoCodePath;
		this.submittPath = submittPath;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassward() {
		return password;
	}

	public void setPassward(String passward) {
		this.password = passward;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPromoCode() {
		return promoCode;
	}

	public void setPromoCode(String promoCode) {
		this.promoCode = promoCode;
	}

	public String getEmailPath() {
		return emailPath;
	}

	public void setEmailPath(String emailPath) {
		this.emailPath = emailPath;
	}

	public String getPasswordPath() {
		return passwordPath;
	}

	public void setPasswordPath(String passwordPath) {
		this.passwordPath = passwordPath;
	}

	public String getFirstNamePath() {
		return firstNamePath;
	}

	public void setFirstNamePath(String firstNamePath) {
		this.firstNamePath = firstNamePath;
	}

	public String getLastNamePath() {
		return lastNamePath;
	}

	public void setLastNamePath(String lastNamePath) {
		this.lastNamePath = lastNamePath;
	}

	public String getPromoCodePath() {
		return promoCodePath;
	}

	public void setPromoCodePath(String promoCodePath) {
		this.promoCodePath = promoCodePath;
	}

	public String getSubmittPath() {
		return submittPath;
	}

	public void setSubmittPath(String submittPath) {
		this.submittPath = submittPath;
	}

}
