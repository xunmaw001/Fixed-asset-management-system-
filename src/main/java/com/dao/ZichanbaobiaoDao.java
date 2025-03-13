package com.dao;

import com.entity.ZichanbaobiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZichanbaobiaoVO;
import com.entity.view.ZichanbaobiaoView;


/**
 * 资产报表
 * 
 * @author 
 * @email 
 * @date 2021-01-11 13:09:03
 */
public interface ZichanbaobiaoDao extends BaseMapper<ZichanbaobiaoEntity> {
	
	List<ZichanbaobiaoVO> selectListVO(@Param("ew") Wrapper<ZichanbaobiaoEntity> wrapper);
	
	ZichanbaobiaoVO selectVO(@Param("ew") Wrapper<ZichanbaobiaoEntity> wrapper);
	
	List<ZichanbaobiaoView> selectListView(@Param("ew") Wrapper<ZichanbaobiaoEntity> wrapper);

	List<ZichanbaobiaoView> selectListView(Pagination page,@Param("ew") Wrapper<ZichanbaobiaoEntity> wrapper);
	
	ZichanbaobiaoView selectView(@Param("ew") Wrapper<ZichanbaobiaoEntity> wrapper);
	
}
