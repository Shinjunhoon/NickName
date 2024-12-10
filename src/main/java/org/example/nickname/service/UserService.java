package org.example.nickname.service;

import org.example.nickname.controller.dto.CreateNickNameResponseDto;
import org.example.nickname.controller.dto.UserRequestDto;
import org.example.nickname.domain.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public CreateNickNameResponseDto sendNickName(UserRequestDto userRequestDto){
        User user = userRequestDto.toUser(userRequestDto);

        return
    }


}
