package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YonghuzixunDao;
import com.entity.YonghuzixunEntity;
import com.service.YonghuzixunService;
import com.entity.vo.YonghuzixunVO;
import com.entity.view.YonghuzixunView;

@Service("yonghuzixunService")
public class YonghuzixunServiceImpl extends ServiceImpl<YonghuzixunDao, YonghuzixunEntity> implements YonghuzixunService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YonghuzixunEntity> page = this.selectPage(
                new Query<YonghuzixunEntity>(params).getPage(),
                new EntityWrapper<YonghuzixunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YonghuzixunEntity> wrapper) {
		  Page<YonghuzixunView> page =new Query<YonghuzixunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YonghuzixunVO> selectListVO(Wrapper<YonghuzixunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YonghuzixunVO selectVO(Wrapper<YonghuzixunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YonghuzixunView> selectListView(Wrapper<YonghuzixunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YonghuzixunView selectView(Wrapper<YonghuzixunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
