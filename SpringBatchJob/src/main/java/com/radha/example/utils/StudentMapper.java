package com.radha.example.utils;


import java.sql.ResultSet;

import java.sql.SQLException;

 

import org.springframework.jdbc.core.RowMapper;

 

public class StudentMapper implements RowMapper {

 

    public StudentModel mapRow(ResultSet rs, int rowNum) throws SQLException {

        StudentModel student = new StudentModel();

        student.setFirstName(rs.getString("FirstName"));
        student.setLastName(rs.getString("LastName"));

        student.setSchool(rs.getString("School"));

        student.setRollNumber(rs.getInt("RollNumber"));

        return student;

    }

}
