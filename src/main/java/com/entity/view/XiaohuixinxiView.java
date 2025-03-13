package com.entity.view;

import com.entity.XiaohuixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 销毁信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-11 13:09:03
 */
@TableName("xiaohuixinxi")
public class XiaohuixinxiView  extends XiaohuixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiaohuixinxiView(){
	}
 
 	public XiaohuixinxiView(XiaohuixinxiEntity xiaohuixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, xiaohuixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
