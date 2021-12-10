package co.seop.pjt.board.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.seop.pjt.comm.Command;

public class BoardInsertForm implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		// 글 쓰기폼 호출
		return "board/boardInsertForm";
	}

}
