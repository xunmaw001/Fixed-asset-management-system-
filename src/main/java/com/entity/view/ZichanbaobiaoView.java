package com.entity.view;

import com.entity.ZichanbaobiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 资产报表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-11 13:09:03
 */
@TableName("zichanbaobiao")
public class ZichanbaobiaoView  extends ZichanbaobiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZichanbaobiaoView(){
	}
 
 	public ZichanbaobiaoView(ZichanbaobiaoEntity zichanbaobiaoEntity){
 	try {
			BeanUtils.copyProperties(this, zichanbaobiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
