package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.XiaohuixinxiDao;
import com.entity.XiaohuixinxiEntity;
import com.service.XiaohuixinxiService;
import com.entity.vo.XiaohuixinxiVO;
import com.entity.view.XiaohuixinxiView;

@Service("xiaohuixinxiService")
public class XiaohuixinxiServiceImpl extends ServiceImpl<XiaohuixinxiDao, XiaohuixinxiEntity> implements XiaohuixinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaohuixinxiEntity> page = this.selectPage(
                new Query<XiaohuixinxiEntity>(params).getPage(),
                new EntityWrapper<XiaohuixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaohuixinxiEntity> wrapper) {
		  Page<XiaohuixinxiView> page =new Query<XiaohuixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaohuixinxiVO> selectListVO(Wrapper<XiaohuixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaohuixinxiVO selectVO(Wrapper<XiaohuixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaohuixinxiView> selectListView(Wrapper<XiaohuixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaohuixinxiView selectView(Wrapper<XiaohuixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
