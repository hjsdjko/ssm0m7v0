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


import com.dao.DiscussxianzhiwupinDao;
import com.entity.DiscussxianzhiwupinEntity;
import com.service.DiscussxianzhiwupinService;
import com.entity.vo.DiscussxianzhiwupinVO;
import com.entity.view.DiscussxianzhiwupinView;

@Service("discussxianzhiwupinService")
public class DiscussxianzhiwupinServiceImpl extends ServiceImpl<DiscussxianzhiwupinDao, DiscussxianzhiwupinEntity> implements DiscussxianzhiwupinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussxianzhiwupinEntity> page = this.selectPage(
                new Query<DiscussxianzhiwupinEntity>(params).getPage(),
                new EntityWrapper<DiscussxianzhiwupinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussxianzhiwupinEntity> wrapper) {
		  Page<DiscussxianzhiwupinView> page =new Query<DiscussxianzhiwupinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussxianzhiwupinVO> selectListVO(Wrapper<DiscussxianzhiwupinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussxianzhiwupinVO selectVO(Wrapper<DiscussxianzhiwupinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussxianzhiwupinView> selectListView(Wrapper<DiscussxianzhiwupinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussxianzhiwupinView selectView(Wrapper<DiscussxianzhiwupinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
