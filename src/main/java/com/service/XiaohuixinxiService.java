package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaohuixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaohuixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaohuixinxiView;


/**
 * 销毁信息
 *
 * @author 
 * @email 
 * @date 2021-01-11 13:09:03
 */
public interface XiaohuixinxiService extends IService<XiaohuixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaohuixinxiVO> selectListVO(Wrapper<XiaohuixinxiEntity> wrapper);
   	
   	XiaohuixinxiVO selectVO(@Param("ew") Wrapper<XiaohuixinxiEntity> wrapper);
   	
   	List<XiaohuixinxiView> selectListView(Wrapper<XiaohuixinxiEntity> wrapper);
   	
   	XiaohuixinxiView selectView(@Param("ew") Wrapper<XiaohuixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaohuixinxiEntity> wrapper);
   	
}

