package csu.noname.system_backend.entity;

import java.io.Serializable;

/**
 * (Student)实体类
 *
 * @author makejava
 * @since 2024-07-11 13:03:23
 */
public class Student implements Serializable {
    private static final long serialVersionUID = 629349849629881298L;
    
    private Long studentId;
    
    private String studentName;
    
    private String department;
    
    private String studentMajor;
    
    private Integer studentGradeNo;
    
    private Integer classNo;


    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getStudentMajor() {
        return studentMajor;
    }

    public void setStudentMajor(String studentMajor) {
        this.studentMajor = studentMajor;
    }

    public Integer getStudentGradeNo() {
        return studentGradeNo;
    }

    public void setStudentGradeNo(Integer studentGradeNo) {
        this.studentGradeNo = studentGradeNo;
    }

    public Integer getClassNo() {
        return classNo;
    }

    public void setClassNo(Integer classNo) {
        this.classNo = classNo;
    }

}

