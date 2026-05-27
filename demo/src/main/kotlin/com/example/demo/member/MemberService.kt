package com.example.demo.member

import org.springframework.stereotype.Service
import java.lang.reflect.Member

@Service
class MemberService(private val memberDao: MemberDao) {

    fun signUpConfirm(memberVo: MemberVo): Boolean {
        if (memberDao.existsByld(memberVo.id)) {
            return false
        }
        return memberDao.insertMember(memberVo)


    }
    fun signInConfirm(memberVo: MemberVo) : Boolean{
        val selectMember = memberDao.selectMember(memberVo.id) ?: return false
        return selectMember.pw.equals(memberVo.pw)

    }
}