package csu.noname.system_backend.entity;

import java.io.Serializable;

/**
 * (Exam)实体类
 *
 * @author makejava
 * @since 2024-07-11 13:12:07
 */
public class Exam implements Serializable {
    private static final long serialVersionUID = -94227660568153074L;
    
    private Integer courseId;
    
    private String courseName;
    
    private String data;
    
    private String time;
    
    private String site;
    
    private Integer type;


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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

}

