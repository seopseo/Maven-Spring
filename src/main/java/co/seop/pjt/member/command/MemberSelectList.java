package co.seop.pjt.member.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.seop.pjt.comm.Command;
import co.seop.pjt.member.service.MemberService;
import co.seop.pjt.member.service.MemberVO;
import co.seop.pjt.member.serviceImpl.MemberServiceImpl;

public class MemberSelectList implements Command {

   @Override
   public String run(HttpServletRequest request, HttpServletResponse response) {
      // 회원 전체 목록
      MemberService memberDao = new MemberServiceImpl();
//      List<MemberVO> members = memberDao.memberSelectList();   // 전체 회원 목록을 가져온다
      request.setAttribute("members", memberDao.memberSelectList());
      
      return "member/memberSelectList";
   }
}