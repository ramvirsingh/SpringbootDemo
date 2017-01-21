/**
 *
 */
package com.springbootdemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.springbootdemo.util.ValidEmail;
import com.springbootdemo.web.dto.UserDTO;

/**
 * @author RAM
 *
 */

@Entity
@Table(name = "USERS")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "USER_ID")
    private Long id;

    @Column(name = "USER_NAME", unique = true, nullable = false)
    @NotNull
    private String userName;

    @Column(name = "FIRST_NAME", nullable = false)
    @NotNull
    private String firstName;

    @Column(name = "LAST_NAME", nullable = false)
    @NotNull
    private String lastName;

    @Column(name = "Department", nullable = false)
    private String department;

    @Column(name = "PASSWORD", nullable = false)
    @NotNull
    private String password;

    @Column(name = "AGE", nullable = false)
    @Min(0)
    @Max(100)
    @NotNull
    private int age;

    @Column(name = "EMAIL", nullable = false)
    @NotNull
    @ValidEmail
    private String email;

    public User() {
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
    public User(Long id, String userName, String firstName, String lastName, String department, String password, int age, String email) {
        super();
        this.id = id;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.password = password;
        this.age = age;
        this.email = email;
    }

    public User(UserDTO userdto) {
        super();
        userName = userdto.getPassword();
        firstName = userdto.getFirstName();
        lastName = userdto.getLastName();
        department = userdto.getDepartment();
        password = userdto.getPassword();
        age = userdto.getAge();
        email = userdto.getEmail();
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
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("User [");
        if (id != null) {
            builder.append("id=").append(id).append(", ");
        }
        if (userName != null) {
            builder.append("userName=").append(userName).append(", ");
        }
        if (firstName != null) {
            builder.append("firstName=").append(firstName).append(", ");
        }
        if (lastName != null) {
            builder.append("lastName=").append(lastName).append(", ");
        }
        if (department != null) {
            builder.append("department=").append(department).append(", ");
        }
        if (password != null) {
            builder.append("password=").append(password).append(", ");
        }
        builder.append("age=").append(age).append(", ");
        if (email != null) {
            builder.append("email=").append(email);
        }
        builder.append("]");
        return builder.toString();
    }

}
