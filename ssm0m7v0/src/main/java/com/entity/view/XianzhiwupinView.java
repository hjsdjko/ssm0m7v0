package com.entity.view;

import com.entity.XianzhiwupinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 闲置物品
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-08 09:47:28
 */
@TableName("xianzhiwupin")
public class XianzhiwupinView  extends XianzhiwupinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XianzhiwupinView(){
	}
 
 	public XianzhiwupinView(XianzhiwupinEntity xianzhiwupinEntity){
 	try {
			BeanUtils.copyProperties(this, xianzhiwupinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
