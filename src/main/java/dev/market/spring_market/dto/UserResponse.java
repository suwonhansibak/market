package dev.market.spring_market.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserResponse {
    private String userEmail;
    private String nickname;
    private char gender;


    public UserResponse() {
    }


}
