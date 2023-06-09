package com.example.demo.Service;

import java.util.List;

import com.example.demo.payload.UserDto;

public interface UserService {
	
public UserDto create(UserDto userDto);
public UserDto update(UserDto usetDto,int userId);
public void delete(int userId);
public List<UserDto> getAll();
public UserDto getByUserId(int userId);
public UserDto getByEmailId(String email);

}
