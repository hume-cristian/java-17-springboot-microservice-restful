package com.java17.springboot3.microservice.restful.models;

import java.util.List;

/**
 * @author Hume Cristian
 * @version 1.0.0
 * @since 2024-11-25
 */
public class UserModel {

    private Integer id;
    private String firstName;
    private String lastName;
    private String nationality;
    private String occupation;
    private String phone;
    private String email;
    private List<String> knownFor;
    private List<String> awards;

    // Constructor privado para forzar el uso del builder
    private UserModel(Builder builder) {
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.nationality = builder.nationality;
        this.occupation = builder.occupation;
        this.phone = builder.phone;
        this.email = builder.email;
        this.knownFor = builder.knownFor;
        this.awards = builder.awards;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getKnownFor() {
        return knownFor;
    }

    public void setKnownFor(List<String> knownFor) {
        this.knownFor = knownFor;
    }

    public List<String> getAwards() {
        return awards;
    }

    public void setAwards(List<String> awards) {
        this.awards = awards;
    }

    // Método estático para obtener el builder
    public static Builder builder() {
        return new Builder();
    }

    // Builder estático interno
    public static class Builder {

        private Integer id;
        private String firstName;
        private String lastName;
        private String nationality;
        private String occupation;
        private String phone;
        private String email;
        private List<String> knownFor;
        private List<String> awards;

        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder nationality(String nationality) {
            this.nationality = nationality;
            return this;
        }

        public Builder occupation(String occupation) {
            this.occupation = occupation;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder knownFor(List<String> knownFor) {
            this.knownFor = knownFor;
            return this;
        }

        public Builder awards(List<String> awards) {
            this.awards = awards;
            return this;
        }

        public UserModel build() {
            return new UserModel(this);
        }
    }

}
