package com.dongyang.ezRun.service;

import com.dongyang.ezRun.dto.JoinRequest;
import com.dongyang.ezRun.dto.LoginRequest;
import com.dongyang.ezRun.entity.User;
import com.dongyang.ezRun.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User getLoginUserById(Long user_id) {
        if(user_id == null) return null;
        Optional<User> optionalUser = userRepository.findById(user_id);
        if(optionalUser.isEmpty()) return null;
        return optionalUser.get();
    }
    public void join(JoinRequest req) {
        userRepository.save(req.toEntity());
    }

    public User login(LoginRequest req) {
        Optional<User> optionalUser = userRepository.findByUserName(req.getUser_name());
        if(optionalUser.isEmpty()) {
            return null;
        }
        User user = optionalUser.get();
        if(!user.getPassword().equals(req.getPassword())) {
            return null;
        }
        return user;
    }
}
