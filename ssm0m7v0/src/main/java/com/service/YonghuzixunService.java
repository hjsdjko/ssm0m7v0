package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YonghuzixunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YonghuzixunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YonghuzixunView;


/**
 * 用户咨询
 *
 * @author 
 * @email 
 * @date 2022-04-08 09:47:28
 */
public interface YonghuzixunService extends IService<YonghuzixunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YonghuzixunVO> selectListVO(Wrapper<YonghuzixunEntity> wrapper);
   	
   	YonghuzixunVO selectVO(@Param("ew") Wrapper<YonghuzixunEntity> wrapper);
   	
   	List<YonghuzixunView> selectListView(Wrapper<YonghuzixunEntity> wrapper);
   	
   	YonghuzixunView selectView(@Param("ew") Wrapper<YonghuzixunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YonghuzixunEntity> wrapper);
   	

}

