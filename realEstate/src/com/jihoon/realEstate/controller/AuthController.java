package com.jihoon.realEstate.controller;

import com.jihoon.realEstate.dto.request.CheckIdRequestDto;
import com.jihoon.realEstate.dto.response.CheckIdResponseDto;

public interface AuthController {
	CheckIdResponseDto checkId(CheckIdRequestDto request);
}
