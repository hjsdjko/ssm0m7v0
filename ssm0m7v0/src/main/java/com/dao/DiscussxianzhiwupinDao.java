package com.dao;

import com.entity.DiscussxianzhiwupinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussxianzhiwupinVO;
import com.entity.view.DiscussxianzhiwupinView;


/**
 * 闲置物品评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-08 09:47:29
 */
public interface DiscussxianzhiwupinDao extends BaseMapper<DiscussxianzhiwupinEntity> {
	
	List<DiscussxianzhiwupinVO> selectListVO(@Param("ew") Wrapper<DiscussxianzhiwupinEntity> wrapper);
	
	DiscussxianzhiwupinVO selectVO(@Param("ew") Wrapper<DiscussxianzhiwupinEntity> wrapper);
	
	List<DiscussxianzhiwupinView> selectListView(@Param("ew") Wrapper<DiscussxianzhiwupinEntity> wrapper);

	List<DiscussxianzhiwupinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussxianzhiwupinEntity> wrapper);
	
	DiscussxianzhiwupinView selectView(@Param("ew") Wrapper<DiscussxianzhiwupinEntity> wrapper);
	

}
