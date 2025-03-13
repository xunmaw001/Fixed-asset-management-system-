package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 资产报表
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-01-11 13:09:03
 */
@TableName("zichanbaobiao")
public class ZichanbaobiaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZichanbaobiaoEntity() {
		
	}
	
	public ZichanbaobiaoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 名称
	 */
					
	private String mingcheng;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：名称
	 */
	public void setMingcheng(String mingcheng) {
		this.mingcheng = mingcheng;
	}
	/**
	 * 获取：名称
	 */
	public String getMingcheng() {
		return mingcheng;
	}
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
