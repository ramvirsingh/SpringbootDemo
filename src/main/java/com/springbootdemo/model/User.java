/**
 * 
 */
package com.springbootdemo.model;

/**
 * @author RAM
 *
 */

public class User {

	private String userName;
	private int age;
	private String address;

	public User() {

	}

	public User(String userName, int age, String address) {
		super();
		this.userName = userName;
		this.age = age;
		this.address = address;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}



}
