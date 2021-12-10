package co.seop.pjt.board.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.seop.pjt.board.service.BoardService;
import co.seop.pjt.board.service.BoardVO;
import co.seop.pjt.board.serviceImpl.BoardServiceImpl;
import co.seop.pjt.comm.Command;

public class BoardSelect implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		// 게시글 상세
		BoardService boardService = new BoardServiceImpl();
		BoardVO vo = new BoardVO();
		vo.setNo(Integer.valueOf(request.getParameter("no")));
		request.setAttribute("board", boardService.boardSelect(vo));
		return "board/boardSelect";
	}

}
