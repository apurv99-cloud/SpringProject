package com.example.demo.models;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Students {
    private int rollNo;
    private String name;
    private int marks;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Students{");
        sb.append("rollNo=").append(rollNo);
        sb.append(", name=").append(name);
        sb.append(", marks=").append(marks);
        sb.append('}');
        return sb.toString();
    }

}
