package com.fitfeed.feed.api.mappers;

import com.fitfeed.feed.api.dtos.ProfileDTO;
import com.fitfeed.feed.api.models.Profile;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {StepMapper.class, IngredientMapper.class})
public interface ProfileMapper {

	Profile fromDTO(ProfileDTO profileDTO);

}
