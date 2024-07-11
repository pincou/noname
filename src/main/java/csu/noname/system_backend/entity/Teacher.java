package csu.noname.system_backend.entity;

import java.io.Serializable;

/**
 * (Teacher)实体类
 *
 * @author makejava
 * @since 2024-07-11 13:03:23
 */
public class Teacher implements Serializable {
    private static final long serialVersionUID = -55018967826158187L;
    
    private Long teacherId;
    
    private String teacherName;
    
    private String department;


    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}

