package com.jihoon.realEstate.controller.implement;

import com.jihoon.realEstate.controller.AuthController;
import com.jihoon.realEstate.dto.request.CheckIdRequestDto;
import com.jihoon.realEstate.dto.request.SendCodeRequestDto;
import com.jihoon.realEstate.dto.response.CheckIdResponseDto;
import com.jihoon.realEstate.dto.response.SendCodeResponseDto;
import com.jihoon.realEstate.interfaces.Code;
import com.jihoon.realEstate.service.AuthService;
import com.jihoon.realEstate.service.implement.AuthServiceImplement;

public class AuthControllerImplement implements AuthController {
	
	private AuthService authService;
	
	public AuthControllerImplement (AuthService authService) {
		this.authService = authService;
	}

	@Override
	public CheckIdResponseDto checkId(CheckIdRequestDto request) {
		boolean validId = request.validId();
		if (!validId) return new CheckIdResponseDto(Code.VF, null);
		
		CheckIdResponseDto response = authService.checkId(request);
		return response;
	}

	@Override
	public SendCodeResponseDto sendCode(SendCodeRequestDto request) {
		boolean valid = request.validEmail();
		if (!valid) return new SendCodeResponseDto(Code.VF, null);
		
		SendCodeResponseDto response = authService.sendCode(request);
		return response;
	}

}









