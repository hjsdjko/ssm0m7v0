package com.entity.view;

import com.entity.DiscussxianzhiwupinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 闲置物品评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-08 09:47:29
 */
@TableName("discussxianzhiwupin")
public class DiscussxianzhiwupinView  extends DiscussxianzhiwupinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussxianzhiwupinView(){
	}
 
 	public DiscussxianzhiwupinView(DiscussxianzhiwupinEntity discussxianzhiwupinEntity){
 	try {
			BeanUtils.copyProperties(this, discussxianzhiwupinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
