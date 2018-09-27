package com.lms.mapper;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

@Configuration
public class LMSMapper {
	@Bean
	public ModelMapper modelMapper() {
		ModelMapper mm = new ModelMapper();
		mm.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		return mm;
	}
}