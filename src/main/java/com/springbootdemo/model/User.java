/**
 *
 */
package com.springbootdemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.springbootdemo.common.NameableDtoIFace;

/**
 * @author RAM
 *
 */

@Entity
public class User implements NameableEntityIFace, NameableDtoIFace {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "USER_ID")
    private Long id;

    @Column(name = "USER_NAME", unique = true, nullable = false)
    private String name;

    @Column(name = "PASSWORD", nullable = false)
    private String password;

    @Column(name = "AGE", nullable = false)
    private int age;

    @Column(name = "ADDRESS", nullable = false)
    private String address;

    public User(final String nameToSet, final String passwordToSet, final String addressToSet) {
        super();

        name = nameToSet;
        password = passwordToSet;
        address = addressToSet;
    }

    public User() {
        super();

    }

    @Override
    public Long getId() {
        // TODO Auto-generated method stub
        return id;
    }

    @Override
    public void setId(final Long idToSet) {

        id = idToSet;

    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return name;
    }

    /** @param name the name to set
    */
    public void setName(String name) {
        this.name = name;
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("name", name).toString();
    }

}
