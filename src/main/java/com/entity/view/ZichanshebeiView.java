package com.entity.view;

import com.entity.ZichanshebeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 资产设备
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-11 13:09:03
 */
@TableName("zichanshebei")
public class ZichanshebeiView  extends ZichanshebeiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZichanshebeiView(){
	}
 
 	public ZichanshebeiView(ZichanshebeiEntity zichanshebeiEntity){
 	try {
			BeanUtils.copyProperties(this, zichanshebeiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
