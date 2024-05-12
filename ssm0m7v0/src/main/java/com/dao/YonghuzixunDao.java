package com.dao;

import com.entity.YonghuzixunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YonghuzixunVO;
import com.entity.view.YonghuzixunView;


/**
 * 用户咨询
 * 
 * @author 
 * @email 
 * @date 2022-04-08 09:47:28
 */
public interface YonghuzixunDao extends BaseMapper<YonghuzixunEntity> {
	
	List<YonghuzixunVO> selectListVO(@Param("ew") Wrapper<YonghuzixunEntity> wrapper);
	
	YonghuzixunVO selectVO(@Param("ew") Wrapper<YonghuzixunEntity> wrapper);
	
	List<YonghuzixunView> selectListView(@Param("ew") Wrapper<YonghuzixunEntity> wrapper);

	List<YonghuzixunView> selectListView(Pagination page,@Param("ew") Wrapper<YonghuzixunEntity> wrapper);
	
	YonghuzixunView selectView(@Param("ew") Wrapper<YonghuzixunEntity> wrapper);
	

}
