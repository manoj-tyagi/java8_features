package com.tech.java8_features.lambda.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.tech.java8_features.optional.Bike;

public class Student {
    private String name;
    private int gradeLevel;
    private double gpa;
    private String gender;
    private int noteBook;
    private Optional<Bike> bike = Optional.empty();
    
    List<String> activities = new ArrayList<>();
    
   
 
    public Optional<Bike> getBike() {
		return bike;
	}

	public void setBike(Optional<Bike> bike) {
		this.bike = bike;
	}

	public Student(String name) {
	   this.name=name;
	}

    public Student() {
		super();
	}

    
    
	public int getNoteBook() {
		return noteBook;
	}

	public void setNoteBook(int noteBook) {
		this.noteBook = noteBook;
	}

	

	public Student(String name, int gradeLevel, double gpa, String gender, List<String> activities, int noteBook) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
        this.gender = gender;
        this.activities = activities;
        this.noteBook=noteBook;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }



    public List<String> getActivities() {
        return activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }
    
    public void printListOfActivities() {
    	System.out.println(activities);
    }

	@Override
	public String toString() {
		return "Student [name=" + name + ", gradeLevel=" + gradeLevel + ", gpa=" + gpa + ", gender=" + gender
				+ ", noteBook=" + noteBook + ", bike=" + bike + ", activities=" + activities + "]";
	}
}
