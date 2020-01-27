package com.gonuclei.authentication.authwithreact.model;

import java.util.Objects;

public class Course {
    private Long id;
    private String username;
    private String description;

    public Course() {
    }

    public Course(Long id, String username, String description) {
        this.id = id;
        this.username = username;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;
        Course course = (Course) o;
        return getId().equals(course.getId()) &&
                getUsername().equals(course.getUsername()) &&
                Objects.equals(getDescription(), course.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getUsername(), getDescription());
    }
}