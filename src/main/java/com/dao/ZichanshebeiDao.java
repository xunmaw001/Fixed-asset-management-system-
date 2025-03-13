package com.dao;

import com.entity.ZichanshebeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZichanshebeiVO;
import com.entity.view.ZichanshebeiView;


/**
 * 资产设备
 * 
 * @author 
 * @email 
 * @date 2021-01-11 13:09:03
 */
public interface ZichanshebeiDao extends BaseMapper<ZichanshebeiEntity> {
	
	List<ZichanshebeiVO> selectListVO(@Param("ew") Wrapper<ZichanshebeiEntity> wrapper);
	
	ZichanshebeiVO selectVO(@Param("ew") Wrapper<ZichanshebeiEntity> wrapper);
	
	List<ZichanshebeiView> selectListView(@Param("ew") Wrapper<ZichanshebeiEntity> wrapper);

	List<ZichanshebeiView> selectListView(Pagination page,@Param("ew") Wrapper<ZichanshebeiEntity> wrapper);
	
	ZichanshebeiView selectView(@Param("ew") Wrapper<ZichanshebeiEntity> wrapper);
	
}
