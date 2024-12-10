package org.example.nickname.controller.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import org.example.nickname.domain.Castle;
import org.example.nickname.domain.Mbti;
import org.example.nickname.domain.User;


@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
public class UserRequestDto {

    String name;
    String age;
    Mbti mbti;
    Castle castle;


    public User toUser(UserRequestDto userRequestDto) {
        return new User(userRequestDto.getName(), userRequestDto.getAge(), userRequestDto.getMbti(),
            userRequestDto.getCastle());
    }
}
