package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussxianzhiwupinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussxianzhiwupinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussxianzhiwupinView;


/**
 * 闲置物品评论表
 *
 * @author 
 * @email 
 * @date 2022-04-08 09:47:29
 */
public interface DiscussxianzhiwupinService extends IService<DiscussxianzhiwupinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussxianzhiwupinVO> selectListVO(Wrapper<DiscussxianzhiwupinEntity> wrapper);
   	
   	DiscussxianzhiwupinVO selectVO(@Param("ew") Wrapper<DiscussxianzhiwupinEntity> wrapper);
   	
   	List<DiscussxianzhiwupinView> selectListView(Wrapper<DiscussxianzhiwupinEntity> wrapper);
   	
   	DiscussxianzhiwupinView selectView(@Param("ew") Wrapper<DiscussxianzhiwupinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussxianzhiwupinEntity> wrapper);
   	

}

