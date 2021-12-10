package co.seop.pjt.board.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.seop.pjt.board.service.BoardService;
import co.seop.pjt.board.serviceImpl.BoardServiceImpl;
import co.seop.pjt.comm.Command;

public class BoardSelectList implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		BoardService boardService = new BoardServiceImpl();
		request.setAttribute("boards", boardService.boardSelectList());
		return "board/boardSelectList";
	}

}



