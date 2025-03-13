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


import com.dao.ZichanshebeiDao;
import com.entity.ZichanshebeiEntity;
import com.service.ZichanshebeiService;
import com.entity.vo.ZichanshebeiVO;
import com.entity.view.ZichanshebeiView;

@Service("zichanshebeiService")
public class ZichanshebeiServiceImpl extends ServiceImpl<ZichanshebeiDao, ZichanshebeiEntity> implements ZichanshebeiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZichanshebeiEntity> page = this.selectPage(
                new Query<ZichanshebeiEntity>(params).getPage(),
                new EntityWrapper<ZichanshebeiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZichanshebeiEntity> wrapper) {
		  Page<ZichanshebeiView> page =new Query<ZichanshebeiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZichanshebeiVO> selectListVO(Wrapper<ZichanshebeiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZichanshebeiVO selectVO(Wrapper<ZichanshebeiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZichanshebeiView> selectListView(Wrapper<ZichanshebeiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZichanshebeiView selectView(Wrapper<ZichanshebeiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
