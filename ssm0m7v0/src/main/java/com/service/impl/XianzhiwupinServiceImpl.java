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


import com.dao.XianzhiwupinDao;
import com.entity.XianzhiwupinEntity;
import com.service.XianzhiwupinService;
import com.entity.vo.XianzhiwupinVO;
import com.entity.view.XianzhiwupinView;

@Service("xianzhiwupinService")
public class XianzhiwupinServiceImpl extends ServiceImpl<XianzhiwupinDao, XianzhiwupinEntity> implements XianzhiwupinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XianzhiwupinEntity> page = this.selectPage(
                new Query<XianzhiwupinEntity>(params).getPage(),
                new EntityWrapper<XianzhiwupinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XianzhiwupinEntity> wrapper) {
		  Page<XianzhiwupinView> page =new Query<XianzhiwupinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XianzhiwupinVO> selectListVO(Wrapper<XianzhiwupinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XianzhiwupinVO selectVO(Wrapper<XianzhiwupinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XianzhiwupinView> selectListView(Wrapper<XianzhiwupinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XianzhiwupinView selectView(Wrapper<XianzhiwupinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
