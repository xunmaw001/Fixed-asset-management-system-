package com.dao;

import com.entity.ZichanrukuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZichanrukuVO;
import com.entity.view.ZichanrukuView;


/**
 * 资产入库
 * 
 * @author 
 * @email 
 * @date 2021-01-11 13:09:03
 */
public interface ZichanrukuDao extends BaseMapper<ZichanrukuEntity> {
	
	List<ZichanrukuVO> selectListVO(@Param("ew") Wrapper<ZichanrukuEntity> wrapper);
	
	ZichanrukuVO selectVO(@Param("ew") Wrapper<ZichanrukuEntity> wrapper);
	
	List<ZichanrukuView> selectListView(@Param("ew") Wrapper<ZichanrukuEntity> wrapper);

	List<ZichanrukuView> selectListView(Pagination page,@Param("ew") Wrapper<ZichanrukuEntity> wrapper);
	
	ZichanrukuView selectView(@Param("ew") Wrapper<ZichanrukuEntity> wrapper);
	
}
