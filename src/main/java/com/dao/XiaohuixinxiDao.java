package com.dao;

import com.entity.XiaohuixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaohuixinxiVO;
import com.entity.view.XiaohuixinxiView;


/**
 * 销毁信息
 * 
 * @author 
 * @email 
 * @date 2021-01-11 13:09:03
 */
public interface XiaohuixinxiDao extends BaseMapper<XiaohuixinxiEntity> {
	
	List<XiaohuixinxiVO> selectListVO(@Param("ew") Wrapper<XiaohuixinxiEntity> wrapper);
	
	XiaohuixinxiVO selectVO(@Param("ew") Wrapper<XiaohuixinxiEntity> wrapper);
	
	List<XiaohuixinxiView> selectListView(@Param("ew") Wrapper<XiaohuixinxiEntity> wrapper);

	List<XiaohuixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<XiaohuixinxiEntity> wrapper);
	
	XiaohuixinxiView selectView(@Param("ew") Wrapper<XiaohuixinxiEntity> wrapper);
	
}
