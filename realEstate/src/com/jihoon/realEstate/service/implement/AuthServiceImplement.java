package com.jihoon.realEstate.service.implement;

import java.util.Random;

import com.jihoon.realEstate.dto.request.CheckIdRequestDto;
import com.jihoon.realEstate.dto.request.SendCodeRequestDto;
import com.jihoon.realEstate.dto.response.CheckIdResponseDto;
import com.jihoon.realEstate.dto.response.SendCodeResponseDto;
import com.jihoon.realEstate.interfaces.Code;
import com.jihoon.realEstate.repository.EmailAuthenticationRepository;
import com.jihoon.realEstate.repository.UserRepository;
import com.jihoon.realEstate.service.AuthService;

public class AuthServiceImplement implements AuthService {
	
	private UserRepository userRepository;
	private EmailAuthenticationRepository emailAuthenticationRepository;
	
	public AuthServiceImplement (
		UserRepository userRepository,
		EmailAuthenticationRepository emailAuthenticationRepository
	) {
		this.userRepository = userRepository;
		this.emailAuthenticationRepository = emailAuthenticationRepository;
	}

	@Override
	public CheckIdResponseDto checkId(CheckIdRequestDto dto) {
		
		CheckIdResponseDto result = new CheckIdResponseDto();
		
		try {
			
			String id = dto.getId();
			
			boolean existedId = userRepository.existsById(id);
			
			if (existedId) result.setCode(Code.DI);
			else result.setCode(Code.SU);
			
		} catch (Exception exception) {
			exception.printStackTrace();
			result.setCode(Code.DBE);
		}
		
		return result;
	}

	@Override
	public SendCodeResponseDto sendCode(SendCodeRequestDto dto) {
		
		SendCodeResponseDto result = new SendCodeResponseDto();
		
		try {
			
			String email = dto.getEmail();
			String authenticationCode = randomString();
			
			boolean existedEmail = emailAuthenticationRepository.existsByEmail(email);
			if (existedEmail) {
				result.setCode(Code.DE);
				return result;
			}
			
			emailAuthenticationRepository.save(email, authenticationCode);
			result.setCode(Code.SU);
			result.setData(authenticationCode);
			
		} catch (Exception exception) {
			exception.printStackTrace();
			result.setCode(Code.DBE);
		}
		
		return result;
	}
	
	private String randomString() {
		
		char[] randomString = new char[4];
		
		Random random = new Random();
		
		for (int index = 0; index < 4; index++) {
			randomString[index] = (char) (random.nextInt(26) + 65);
		}
		
		return new String(randomString);
		
	}

}








