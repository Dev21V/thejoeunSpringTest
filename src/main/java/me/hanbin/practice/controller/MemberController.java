package me.hanbin.practice.controller;

import lombok.RequiredArgsConstructor;
import me.hanbin.practice.model.dto.AddMemberRequest;
import me.hanbin.practice.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/user")
    public String signup(AddMemberRequest request){
        memberService.save(request);
        return "redirect:/login";
    }
}
