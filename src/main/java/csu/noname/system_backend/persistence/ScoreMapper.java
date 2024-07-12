package csu.noname.system_backend.persistence;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import csu.noname.system_backend.entity.Score;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ScoreMapper extends BaseMapper<Score> {
    @Select(value = "select * from score where student_id = #{student_id}")
    public List<Score> selectScoresByStudentID(@Param("student_id") long studentID);
}
