package csu.noname.system_backend.persistence;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import csu.noname.system_backend.entity.Site;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SiteMapper extends BaseMapper<Site> {
}
