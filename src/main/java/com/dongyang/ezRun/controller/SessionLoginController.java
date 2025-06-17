//package com.dongyang.ezRun.controller;
//
//import com.dongyang.ezRun.dto.JoinRequest;
//import com.dongyang.ezRun.dto.LoginRequest;
//import com.dongyang.ezRun.entity.PbTracker;
//import com.dongyang.ezRun.entity.User;
//import com.dongyang.ezRun.entity.UserRole;
//import com.dongyang.ezRun.repository.PbTrackerRepository;
//import com.dongyang.ezRun.service.UserService;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpSession;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.*;
//
//@Controller
//@RequestMapping("/session-login")
//public class SessionLoginController {
//    @Autowired
//    private UserService userService;
//    @Autowired
//    private PbTrackerRepository pbTrackerRepository;
//
//    @GetMapping(value = {"", "/"})
//    public String home(Model model, @SessionAttribute(name = "user_id", required = false)Long user_id) {
//        User loginUser = userService.getLoginUserById(user_id);
//        List<PbTracker> pbTrackerEntityList =(List<PbTracker>) pbTrackerRepository.findAll();
//        String[] quotes = {
//                "\"The miracle isn't that I finished. The miracle is that I had the courage to start.\" — John Bingham",
//                "\"Run when you can, walk if you have to, crawl if you must; just never give up.\" — Dean Karnazes",
//                "\"Running is not about being better than someone else. It's about being better than you used to be.\" — Unknown",
//                "\"Running reminds you that even in your weakest moments, you are strong.\" — Unknown",
//                "\"I run because somehow completely exhausting myself is the most relaxing part of my day.\" — Unknown",
//                "\"I trained 4 years to run only 9 seconds. There are people who do not see results in two months, give up and quit.\" — Usain Bolt",
//                "\"Pain is inevitable. Suffering is optional.\" — Unknown",
//                "\"Hills don’t go away. They wait.\" — Unknown",
//                "\"Just stick with it. What seems hard now will one day be your warm-up.\" — Unknown",
//                "\"I often hear someone say I’m not a real runner. We are all runners, some just run faster than others. I’ve never met a fake runner.\" — Unknown"
//        };
//        int randInt = (int) (Math.random() * quotes.length);
//        model.addAttribute("pbTracker", pbTrackerEntityList);
//        model.addAttribute("randomQuote", quotes[randInt]);
//        if(loginUser != null) {
//            model.addAttribute("full_name", loginUser.getUserName());
//        }
//        return "sessionLogin/home";
//    }
//
////    @GetMapping("/join")
////    public String joinPage(Model model) {
////        model.addAttribute("joinRequest", new JoinRequest());
////        return "sessionLogin/join";
////    }
////
////    @PostMapping("/join")
////    public String join( JoinRequest joinRequest, BindingResult bindingResult) {
////        userService.join(joinRequest);
////        return "redirect:/session-login/home";
////    }
////
////    @GetMapping("/login")
////    public String loginPage() {
////        return "sessionLogin/login";
////    }
////
////    @PostMapping("/login")
////    public String login(LoginRequest loginRequest, HttpServletRequest httpServletRequest) {
////        User user = userService.login(loginRequest);
////        if(user == null) {
////            System.out.println("로그인 아이디 또는 비밀번호가 틀렸습니다.");
////            return "redirect:/session-login/login";
////        }
////        httpServletRequest.getSession().invalidate();
////        HttpSession session = httpServletRequest.getSession();
////        session.setAttribute("user_id", user.getUser_id());
////        session.setMaxInactiveInterval(1800);
////        return "redirect:/session-login";
////    }
////
////    @GetMapping("/info")
////    public String userInfo(@SessionAttribute(name = "user_id", required = false) Long user_id, Model model) {
////
////        User loginUser = userService.getLoginUserById(user_id);
////
////        if(loginUser == null) {
////            return "redirect:/session-login/login";
////        }
////
////        model.addAttribute("user", loginUser);
////        return "sessionLogin/info";
////    }
////
////    @GetMapping("/admin")   //update user_member set role='1' where id=1;
////    public String adminPage(@SessionAttribute(name = "user_id", required = false) Long userId, Model model) {
////        User loginUser = userService.getLoginUserById(userId);
////        if(loginUser == null) {
////            return "redirect:/session-login/login";
////        }
////        if(!loginUser.getRole().equals(UserRole.ADMIN)) {
////            return "redirect:/session-login";
////        }
////        return "sessionLogin/admin";
////    }
////
////    @GetMapping("/logout")
////    public String logout(HttpServletRequest request) {
////        HttpSession session = request.getSession(false);  // Session이 없으면 null return
////        if(session != null) {
////            sessionList.remove(session.getId());
////            session.invalidate();
////        }
////        return "redirect:/session-login/";
////    }
////
////    public static Hashtable sessionList = new Hashtable();
////
////    @GetMapping("/session-list")
////    @ResponseBody
////    public Map<String, String> sessionList() {
////        Enumeration elements = sessionList.elements();
////        Map<String, String> lists = new HashMap<>();
////        while(elements.hasMoreElements()) {
////            HttpSession session = (HttpSession)elements.nextElement();
////            lists.put(session.getId(), String.valueOf(session.getAttribute("user_id")));
////        }
////        return lists;
////    }
//}
