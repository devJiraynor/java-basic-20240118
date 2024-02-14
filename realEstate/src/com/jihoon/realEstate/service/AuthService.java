package com.jihoon.realEstate.service;

import com.jihoon.realEstate.dto.request.CheckIdRequestDto;
import com.jihoon.realEstate.dto.response.CheckIdResponseDto;

public interface AuthService {
	CheckIdResponseDto checkId(CheckIdRequestDto dto);
}
