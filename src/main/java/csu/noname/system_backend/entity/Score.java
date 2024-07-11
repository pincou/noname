package csu.noname.system_backend.entity;

import java.io.Serializable;

/**
 * (Score)实体类
 *
 * @author makejava
 * @since 2024-07-11 13:03:23
 */
public class Score implements Serializable {
    private static final long serialVersionUID = 780930442614834053L;
    
    private Integer courseId;
    
    private Long studentId;
    
    private Object totalScore;
    
    private Object userScore;
    
    private Object finalScore;
    
    private Object usualPercentage;
    
    private Object finalPercentage;


    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Object getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Object totalScore) {
        this.totalScore = totalScore;
    }

    public Object getUserScore() {
        return userScore;
    }

    public void setUserScore(Object userScore) {
        this.userScore = userScore;
    }

    public Object getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(Object finalScore) {
        this.finalScore = finalScore;
    }

    public Object getUsualPercentage() {
        return usualPercentage;
    }

    public void setUsualPercentage(Object usualPercentage) {
        this.usualPercentage = usualPercentage;
    }

    public Object getFinalPercentage() {
        return finalPercentage;
    }

    public void setFinalPercentage(Object finalPercentage) {
        this.finalPercentage = finalPercentage;
    }

}

