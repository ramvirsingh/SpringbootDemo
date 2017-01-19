/**
 *
 */
package com.springbootdemo.web.dto;

import com.springbootdemo.model.User;

/**
 * @author RamS
 *
 */
public class UserDTO {

    private Long id;

    private String userName;

    private String firstName;

    private String lastName;

    private String department;

    private String password;

    public UserDTO() {
        super();
    }

    /**
     * @param id
     * @param userName
     * @param firstName
     * @param lastName
     * @param department
     * @param password
     */
    public UserDTO(Long id, String userName, String firstName, String lastName, String department, String password) {
        super();
        this.id = id;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.password = password;
    }

    public UserDTO(User user) {
        super();
        id = user.getId();
        userName = user.getUserName();
        firstName = user.getFirstName();
        lastName = user.getLastName();
        department = user.getDepartment();
        password = user.getPassword();
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
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
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "UserDTO [id=" + id + ", userName=" + userName + ", firstName=" + firstName + ", lastName=" + lastName + ", department=" + department + ", password=" + password + "]";
    }

}
