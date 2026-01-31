package com.example.demo.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Students;

@Repository
public class StudentRepo {

    private JdbcTemplate jdbc;

    public void save(Students s) {
        String sql = "insert into students (rollNo, name, marks) values (?,?,?)";
        // TODO Auto-generated method stub
        // System.out.println("Added from repository");
        int rows = jdbc.update(sql, s.getRollNo(), s.getName(), s.getMarks());
        System.out.println(rows + " Affected ");
    }

    public List<Students> findAll() {
        
        String sql = "select * from Students";

        // ROWMAPPER IS A FUCNTIONAL INTERFACE SO I HAVE WRITTEN THIS USING LAMBDA
        // EXPRESSION
        return jdbc.query(sql, (ResultSet rs, int rowNum) -> {
            // throw new UnsupportedOperationException("Not supported yet.");
            Students s = new Students();
            s.setRollNo(rs.getInt("rollNo"));
            s.setName(rs.getString("name"));
            s.setMarks(rs.getInt("marks"));
            return s;
        });

    }

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

}
