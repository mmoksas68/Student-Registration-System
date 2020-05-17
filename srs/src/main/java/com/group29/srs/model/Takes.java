package com.group29.srs.model;

public class Takes {
    Long s_id;
    Long course_id;
    Long section_id;
    Double final_grade;
    Enum letter_grade;
    int year;
    Enum semester;

    public Takes() {
    }

    public Takes(Long s_id, Long course_id, Long section_id, Double final_grade, Enum letter_grade, int year, Enum semester) {
        this.s_id = s_id;
        this.course_id = course_id;
        this.section_id = section_id;
        this.final_grade = final_grade;
        this.letter_grade = letter_grade;
        this.year = year;
        this.semester = semester;
    }

    public Long getS_id() {
        return s_id;
    }

    public void setS_id(Long s_id) {
        this.s_id = s_id;
    }

    public Long getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Long course_id) {
        this.course_id = course_id;
    }

    public Long getSection_id() {
        return section_id;
    }

    public void setSection_id(Long section_id) {
        this.section_id = section_id;
    }

    public Double getFinal_grade() {
        return final_grade;
    }

    public void setFinal_grade(Double final_grade) {
        this.final_grade = final_grade;
    }

    public Enum getLetter_grade() {
        return letter_grade;
    }

    public void setLetter_grade(Enum letter_grade) {
        this.letter_grade = letter_grade;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Enum getSemester() {
        return semester;
    }

    public void setSemester(Enum semester) {
        this.semester = semester;
    }
}
