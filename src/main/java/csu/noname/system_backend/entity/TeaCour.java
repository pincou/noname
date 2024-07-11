package csu.noname.system_backend.entity;

import java.io.Serializable;

/**
 * (TeaCour)实体类
 *
 * @author makejava
 * @since 2024-07-11 13:03:23
 */
public class TeaCour implements Serializable {
    private static final long serialVersionUID = 734681482929185795L;
    
    private Long teacherId;
    
    private Integer courseId;


    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

}

