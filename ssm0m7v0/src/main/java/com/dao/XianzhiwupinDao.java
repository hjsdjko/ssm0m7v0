package com.dao;

import com.entity.XianzhiwupinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XianzhiwupinVO;
import com.entity.view.XianzhiwupinView;


/**
 * 闲置物品
 * 
 * @author 
 * @email 
 * @date 2022-04-08 09:47:28
 */
public interface XianzhiwupinDao extends BaseMapper<XianzhiwupinEntity> {
	
	List<XianzhiwupinVO> selectListVO(@Param("ew") Wrapper<XianzhiwupinEntity> wrapper);
	
	XianzhiwupinVO selectVO(@Param("ew") Wrapper<XianzhiwupinEntity> wrapper);
	
	List<XianzhiwupinView> selectListView(@Param("ew") Wrapper<XianzhiwupinEntity> wrapper);

	List<XianzhiwupinView> selectListView(Pagination page,@Param("ew") Wrapper<XianzhiwupinEntity> wrapper);
	
	XianzhiwupinView selectView(@Param("ew") Wrapper<XianzhiwupinEntity> wrapper);
	

}
