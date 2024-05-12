package com.entity.view;

import com.entity.YonghuzixunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 用户咨询
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-08 09:47:28
 */
@TableName("yonghuzixun")
public class YonghuzixunView  extends YonghuzixunEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YonghuzixunView(){
	}
 
 	public YonghuzixunView(YonghuzixunEntity yonghuzixunEntity){
 	try {
			BeanUtils.copyProperties(this, yonghuzixunEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
