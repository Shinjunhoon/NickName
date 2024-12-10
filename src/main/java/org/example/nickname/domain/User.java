package org.example.nickname.domain;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;


@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PACKAGE)
public class User {

    String name;
    String age;
    Mbti mbti;
    Castle castle;
}
