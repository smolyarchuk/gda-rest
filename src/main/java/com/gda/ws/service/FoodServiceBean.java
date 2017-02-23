package com.gda.ws.service;

import java.util.Collection;
import java.util.Objects;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gda.ws.entity.FoodCategory;
import com.gda.ws.repository.FoodCategoryRepository;
import com.gda.ws.web.api.dto.FoodCategoryDto;

@Service
public class FoodServiceBean implements FoodService {

    private static final Logger LOG = LoggerFactory.getLogger(FoodServiceBean.class);

    @Autowired
    private FoodCategoryRepository foodCategoryRepository;
    
	@Override
	public Collection<FoodCategoryDto> foodCategories() {
		LOG.info("> findAll");
        Collection<FoodCategory> found = foodCategoryRepository.findAll();
        Collection<FoodCategoryDto> result = found.stream()
        		.map(e -> from(e)).collect(Collectors.toList());
        LOG.info("< findAll");
        return result;
	}
	
	private static FoodCategoryDto from(FoodCategory entity){
		if(Objects.isNull(entity)){
    		return null;
    	}
		FoodCategoryDto dto = new FoodCategoryDto();
    	dto.setId(entity.getId());
    	dto.setName(entity.getName());
    	dto.setLink(entity.getLink());
    	return dto;
    }
}