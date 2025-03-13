package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZichanshebeiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZichanshebeiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZichanshebeiView;


/**
 * 资产设备
 *
 * @author 
 * @email 
 * @date 2021-01-11 13:09:03
 */
public interface ZichanshebeiService extends IService<ZichanshebeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZichanshebeiVO> selectListVO(Wrapper<ZichanshebeiEntity> wrapper);
   	
   	ZichanshebeiVO selectVO(@Param("ew") Wrapper<ZichanshebeiEntity> wrapper);
   	
   	List<ZichanshebeiView> selectListView(Wrapper<ZichanshebeiEntity> wrapper);
   	
   	ZichanshebeiView selectView(@Param("ew") Wrapper<ZichanshebeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZichanshebeiEntity> wrapper);
   	
}

