package com.entity.vo;

import com.entity.ZichanbaobiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 资产报表
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-01-11 13:09:03
 */
public class ZichanbaobiaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 固定资产
	 */
	
	private Integer gudingzichan;
		
	/**
	 * 无形资产
	 */
	
	private Integer wuxingzichan;
		
	/**
	 * 其他资产
	 */
	
	private Integer qitazichan;
		
	/**
	 * 总资产
	 */
	
	private Integer zongzichan;
		
	/**
	 * 日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date riqi;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
				
	
	/**
	 * 设置：固定资产
	 */
	 
	public void setGudingzichan(Integer gudingzichan) {
		this.gudingzichan = gudingzichan;
	}
	
	/**
	 * 获取：固定资产
	 */
	public Integer getGudingzichan() {
		return gudingzichan;
	}
				
	
	/**
	 * 设置：无形资产
	 */
	 
	public void setWuxingzichan(Integer wuxingzichan) {
		this.wuxingzichan = wuxingzichan;
	}
	
	/**
	 * 获取：无形资产
	 */
	public Integer getWuxingzichan() {
		return wuxingzichan;
	}
				
	
	/**
	 * 设置：其他资产
	 */
	 
	public void setQitazichan(Integer qitazichan) {
		this.qitazichan = qitazichan;
	}
	
	/**
	 * 获取：其他资产
	 */
	public Integer getQitazichan() {
		return qitazichan;
	}
				
	
	/**
	 * 设置：总资产
	 */
	 
	public void setZongzichan(Integer zongzichan) {
		this.zongzichan = zongzichan;
	}
	
	/**
	 * 获取：总资产
	 */
	public Integer getZongzichan() {
		return zongzichan;
	}
				
	
	/**
	 * 设置：日期
	 */
	 
	public void setRiqi(Date riqi) {
		this.riqi = riqi;
	}
	
	/**
	 * 获取：日期
	 */
	public Date getRiqi() {
		return riqi;
	}
				
	
	/**
	 * 设置：用户名
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
			
}
