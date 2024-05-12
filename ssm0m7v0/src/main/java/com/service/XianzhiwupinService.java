package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XianzhiwupinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XianzhiwupinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XianzhiwupinView;


/**
 * 闲置物品
 *
 * @author 
 * @email 
 * @date 2022-04-08 09:47:28
 */
public interface XianzhiwupinService extends IService<XianzhiwupinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XianzhiwupinVO> selectListVO(Wrapper<XianzhiwupinEntity> wrapper);
   	
   	XianzhiwupinVO selectVO(@Param("ew") Wrapper<XianzhiwupinEntity> wrapper);
   	
   	List<XianzhiwupinView> selectListView(Wrapper<XianzhiwupinEntity> wrapper);
   	
   	XianzhiwupinView selectView(@Param("ew") Wrapper<XianzhiwupinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XianzhiwupinEntity> wrapper);
   	

}

