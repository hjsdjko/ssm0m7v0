package com.dao;

import com.entity.ShangpinqiugouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShangpinqiugouVO;
import com.entity.view.ShangpinqiugouView;


/**
 * 商品求购
 * 
 * @author 
 * @email 
 * @date 2022-04-08 09:47:28
 */
public interface ShangpinqiugouDao extends BaseMapper<ShangpinqiugouEntity> {
	
	List<ShangpinqiugouVO> selectListVO(@Param("ew") Wrapper<ShangpinqiugouEntity> wrapper);
	
	ShangpinqiugouVO selectVO(@Param("ew") Wrapper<ShangpinqiugouEntity> wrapper);
	
	List<ShangpinqiugouView> selectListView(@Param("ew") Wrapper<ShangpinqiugouEntity> wrapper);

	List<ShangpinqiugouView> selectListView(Pagination page,@Param("ew") Wrapper<ShangpinqiugouEntity> wrapper);
	
	ShangpinqiugouView selectView(@Param("ew") Wrapper<ShangpinqiugouEntity> wrapper);
	

}
