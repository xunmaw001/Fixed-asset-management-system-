package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZichanbaobiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZichanbaobiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZichanbaobiaoView;


/**
 * 资产报表
 *
 * @author 
 * @email 
 * @date 2021-01-11 13:09:03
 */
public interface ZichanbaobiaoService extends IService<ZichanbaobiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZichanbaobiaoVO> selectListVO(Wrapper<ZichanbaobiaoEntity> wrapper);
   	
   	ZichanbaobiaoVO selectVO(@Param("ew") Wrapper<ZichanbaobiaoEntity> wrapper);
   	
   	List<ZichanbaobiaoView> selectListView(Wrapper<ZichanbaobiaoEntity> wrapper);
   	
   	ZichanbaobiaoView selectView(@Param("ew") Wrapper<ZichanbaobiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZichanbaobiaoEntity> wrapper);
   	
}

