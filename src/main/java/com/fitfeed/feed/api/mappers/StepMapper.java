package com.fitfeed.feed.api.mappers;

import com.fitfeed.feed.api.dtos.StepDTO;
import com.fitfeed.feed.api.models.Step;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StepMapper {

	@Mapping(source = "title", target = "title")
	@Mapping(source = "text", target = "text")
	StepDTO toDTO(Step step);

	@Mapping(source = "title", target = "title")
	@Mapping(source = "text", target = "text")
	Step fromDTO(StepDTO stepDTO);

	List<Step> fromDTOS(List<StepDTO> stepDTOS);
	List<StepDTO> toDTOS(List<Step> steps);
}
