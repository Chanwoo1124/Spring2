package com.example.demo.member

import org.springframework.stereotype.Repository
import java.lang.reflect.Member
import java.util.concurrent.ConcurrentHashMap

@Repository
class MemberDao {
    private val memberDB = ConcurrentHashMap<String, MemberVo>()


    fun existsByld(id : String) : Boolean {
        return memberDB.containsKey(id)
    }

    fun insertMember(memberVo: MemberVo) : Boolean {
        println("insertMember")

        if (memberDB.containsKey(memberVo.id)){
            return false
        }
        memberDB[memberVo.id] = memberVo
        return true
    }
    fun selectMember(id : String) : MemberVo? {
        return memberDB[id]
    }

    fun printAllMember(){
        println("=== 전체 회원 목록 ===")
        if (memberDB.isEmpty()){
            println("등록된 회원 X")
            return
        }

        memberDB.forEach { (id, member) ->
            println(" id = ${member.id}")
            println(" pw = ${member.pw}")
            println(" email = ${member.email}")
            println(" phone = ${member.phone}")
        }



    }










}