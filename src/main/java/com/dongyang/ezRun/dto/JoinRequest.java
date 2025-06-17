package com.dongyang.ezRun.dto;

import com.dongyang.ezRun.entity.User;
import com.dongyang.ezRun.entity.UserRole;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class JoinRequest {
    private String userName;
    private String password;
    private String fullName;


    public User toEntity() {
        return User.builder()
                .userName(this.userName)
                .password(this.password)
                .fullName(this.fullName)
                .role(UserRole.USER)
                .build();
    }


}