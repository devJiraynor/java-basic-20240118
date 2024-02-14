package com.jihoon.realEstate.controller.implement;

import com.jihoon.realEstate.controller.AuthController;
import com.jihoon.realEstate.dto.request.CheckIdRequestDto;
import com.jihoon.realEstate.dto.response.CheckIdResponseDto;
import com.jihoon.realEstate.service.AuthService;

public class AuthControllerImplement implements AuthController {
	
	private AuthService authService; 

	@Override
	public CheckIdResponseDto checkId(CheckIdRequestDto request) {
		CheckIdResponseDto response = authService.checkId(request);
		return response;
	}

}
