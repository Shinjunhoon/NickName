package org.example.nickname.domain;


import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public enum Castle {
    Man("남자"),
    WOMAN("여자");

    String Castle;

    public String geMessage(Castle castle) {
        return this.Castle;
    }
}
