package csu.noname.system_backend.entity;

import java.io.Serializable;

/**
 * (Submit)实体类
 *
 * @author makejava
 * @since 2024-07-11 13:03:23
 */
public class Submit implements Serializable {
    private static final long serialVersionUID = 470511224651754792L;
    
    private Integer submitId;
    
    private Long studentId;
    
    private Integer courseId;
    
    private String studentFile;
    
    private Integer state;
    
    private Integer homeworkId;


    public Integer getSubmitId() {
        return submitId;
    }

    public void setSubmitId(Integer submitId) {
        this.submitId = submitId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getStudentFile() {
        return studentFile;
    }

    public void setStudentFile(String studentFile) {
        this.studentFile = studentFile;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getHomeworkId() {
        return homeworkId;
    }

    public void setHomeworkId(Integer homeworkId) {
        this.homeworkId = homeworkId;
    }

}

