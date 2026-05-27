package com.example.demo.member

import org.springframework.ui.Model
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class MemberController(private val memberService : MemberService) {


    @GetMapping("/signUp")
    fun signUP(model : Model) : String{
        model.addAttribute("memberVo", MemberVo())
        return "sign_up"
    }

    @PostMapping("/signUpConfirm")
    fun signUpConfirm( memberVo: MemberVo) : String{
        val result = memberService.signUpConfirm(memberVo)
        if (result){
            return "sign_up_ok"
        }
        return "sign_up_ng"
    }

    @GetMapping("/signln")
    fun signln(model : Model) : String{
        model.addAttribute("memberVo", MemberVo())
        return "sign_in"
    }

    @PostMapping("/signInConfirm")
    fun signInConfirm(memberVo: MemberVo, model : Model) : String {

        val result = memberService.signInConfirm(memberVo)
        if (result){
            model.addAttribute("memberId", memberVo.id)
            return "sign_in_ok"
        }
        return "sign_in_ng"
    }


}