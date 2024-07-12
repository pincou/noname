package csu.noname.system_backend.persistence;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import csu.noname.system_backend.entity.Exam;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ExamMapper extends BaseMapper<Exam> {
//    @Select("SELECT * FROM user where user_id = #{userid}")
//    public String searchById(@Param("userid") String userid);
}
