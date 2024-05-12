package com.entity.vo;

import com.entity.ShangpinqiugouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 商品求购
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-08 09:47:28
 */
public class ShangpinqiugouVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 商品分类
	 */
	
	private String shangpinfenlei;
		
	/**
	 * 成色要求
	 */
	
	private String chengseyaoqiu;
		
	/**
	 * 接受价位
	 */
	
	private String jieshoujiawei;
		
	/**
	 * 需求数量
	 */
	
	private Integer xuqiushuliang;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 手机号码
	 */
	
	private String shoujihaoma;
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：商品分类
	 */
	 
	public void setShangpinfenlei(String shangpinfenlei) {
		this.shangpinfenlei = shangpinfenlei;
	}
	
	/**
	 * 获取：商品分类
	 */
	public String getShangpinfenlei() {
		return shangpinfenlei;
	}
				
	
	/**
	 * 设置：成色要求
	 */
	 
	public void setChengseyaoqiu(String chengseyaoqiu) {
		this.chengseyaoqiu = chengseyaoqiu;
	}
	
	/**
	 * 获取：成色要求
	 */
	public String getChengseyaoqiu() {
		return chengseyaoqiu;
	}
				
	
	/**
	 * 设置：接受价位
	 */
	 
	public void setJieshoujiawei(String jieshoujiawei) {
		this.jieshoujiawei = jieshoujiawei;
	}
	
	/**
	 * 获取：接受价位
	 */
	public String getJieshoujiawei() {
		return jieshoujiawei;
	}
				
	
	/**
	 * 设置：需求数量
	 */
	 
	public void setXuqiushuliang(Integer xuqiushuliang) {
		this.xuqiushuliang = xuqiushuliang;
	}
	
	/**
	 * 获取：需求数量
	 */
	public Integer getXuqiushuliang() {
		return xuqiushuliang;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
				
	
	/**
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：手机号码
	 */
	 
	public void setShoujihaoma(String shoujihaoma) {
		this.shoujihaoma = shoujihaoma;
	}
	
	/**
	 * 获取：手机号码
	 */
	public String getShoujihaoma() {
		return shoujihaoma;
	}
			
}
