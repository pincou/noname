package csu.noname.system_backend.entity;

import java.io.Serializable;

/**
 * (Course)实体类
 *
 * @author makejava
 * @since 2024-07-11 13:12:07
 */
public class Course implements Serializable {
    private static final long serialVersionUID = 164922298078226439L;
    
    private Integer courseId;
    
    private String courseName;
    
    private Object courseCredit;
    
    private Integer courseTerm;
    
    private String courseMajor;
    
    private Integer courseGradeNo;
    
    private Integer courseContain;
    
    private Integer courseLeft;
    
    private Integer chosen;
    
    private String site;
    
    private Integer classroomNo;
    
    private Integer startWeek;
    
    private Integer endWeek;


    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Object getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(Object courseCredit) {
        this.courseCredit = courseCredit;
    }

    public Integer getCourseTerm() {
        return courseTerm;
    }

    public void setCourseTerm(Integer courseTerm) {
        this.courseTerm = courseTerm;
    }

    public String getCourseMajor() {
        return courseMajor;
    }

    public void setCourseMajor(String courseMajor) {
        this.courseMajor = courseMajor;
    }

    public Integer getCourseGradeNo() {
        return courseGradeNo;
    }

    public void setCourseGradeNo(Integer courseGradeNo) {
        this.courseGradeNo = courseGradeNo;
    }

    public Integer getCourseContain() {
        return courseContain;
    }

    public void setCourseContain(Integer courseContain) {
        this.courseContain = courseContain;
    }

    public Integer getCourseLeft() {
        return courseLeft;
    }

    public void setCourseLeft(Integer courseLeft) {
        this.courseLeft = courseLeft;
    }

    public Integer getChosen() {
        return chosen;
    }

    public void setChosen(Integer chosen) {
        this.chosen = chosen;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public Integer getClassroomNo() {
        return classroomNo;
    }

    public void setClassroomNo(Integer classroomNo) {
        this.classroomNo = classroomNo;
    }

    public Integer getStartWeek() {
        return startWeek;
    }

    public void setStartWeek(Integer startWeek) {
        this.startWeek = startWeek;
    }

    public Integer getEndWeek() {
        return endWeek;
    }

    public void setEndWeek(Integer endWeek) {
        this.endWeek = endWeek;
    }

}

