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


import com.dao.ZichanbaobiaoDao;
import com.entity.ZichanbaobiaoEntity;
import com.service.ZichanbaobiaoService;
import com.entity.vo.ZichanbaobiaoVO;
import com.entity.view.ZichanbaobiaoView;

@Service("zichanbaobiaoService")
public class ZichanbaobiaoServiceImpl extends ServiceImpl<ZichanbaobiaoDao, ZichanbaobiaoEntity> implements ZichanbaobiaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZichanbaobiaoEntity> page = this.selectPage(
                new Query<ZichanbaobiaoEntity>(params).getPage(),
                new EntityWrapper<ZichanbaobiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZichanbaobiaoEntity> wrapper) {
		  Page<ZichanbaobiaoView> page =new Query<ZichanbaobiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZichanbaobiaoVO> selectListVO(Wrapper<ZichanbaobiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZichanbaobiaoVO selectVO(Wrapper<ZichanbaobiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZichanbaobiaoView> selectListView(Wrapper<ZichanbaobiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZichanbaobiaoView selectView(Wrapper<ZichanbaobiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
