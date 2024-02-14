package com.jihoon.realEstate.service.implement;

import com.jihoon.realEstate.dto.request.CheckIdRequestDto;
import com.jihoon.realEstate.dto.response.CheckIdResponseDto;
import com.jihoon.realEstate.interfaces.Code;
import com.jihoon.realEstate.service.AuthService;

public class AuthServiceImplement implements AuthService {

	@Override
	public CheckIdResponseDto checkId(CheckIdRequestDto dto) {
		
		CheckIdResponseDto result = new CheckIdResponseDto();
		
		try {
			
			String id = dto.getId();
			
			boolean existedId;
			
			if (existedId) result.setCode(Code.DI);
			else result.setCode(Code.SU);
			
		} catch (Exception exception) {
			exception.printStackTrace();
			result.setCode(Code.DBE);
		}
		
		return result;
	}

}



