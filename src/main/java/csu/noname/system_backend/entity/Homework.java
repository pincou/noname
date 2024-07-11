package csu.noname.system_backend.entity;

import java.io.Serializable;

/**
 * (Homework)实体类
 *
 * @author makejava
 * @since 2024-07-11 13:12:07
 */
public class Homework implements Serializable {
    private static final long serialVersionUID = -95533526549143313L;
    
    private Integer homeworkId;
    
    private Integer courseId;
    
    private Long teacherId;
    
    private Integer homeworkType;
    
    private String homeworkTitle;
    
    private String content;
    
    private String teacherFile;


    public Integer getHomeworkId() {
        return homeworkId;
    }

    public void setHomeworkId(Integer homeworkId) {
        this.homeworkId = homeworkId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getHomeworkType() {
        return homeworkType;
    }

    public void setHomeworkType(Integer homeworkType) {
        this.homeworkType = homeworkType;
    }

    public String getHomeworkTitle() {
        return homeworkTitle;
    }

    public void setHomeworkTitle(String homeworkTitle) {
        this.homeworkTitle = homeworkTitle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTeacherFile() {
        return teacherFile;
    }

    public void setTeacherFile(String teacherFile) {
        this.teacherFile = teacherFile;
    }

}

