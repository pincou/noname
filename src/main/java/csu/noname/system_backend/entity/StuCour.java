package csu.noname.system_backend.entity;

import java.io.Serializable;

/**
 * (StuCour)实体类
 *
 * @author makejava
 * @since 2024-07-11 13:03:23
 */
public class StuCour implements Serializable {
    private static final long serialVersionUID = -39695996281088903L;
    
    private Long studentId;
    
    private Integer courseId;


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

}

