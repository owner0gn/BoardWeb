package com.springbook.biz.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.springbook.biz.board.service.BoardService;
import com.springbook.biz.board.service.BoardVO;

public class BoardServiceClient {
	public static void main(String[] args) {
		// 1.
		AbstractApplicationContext container = 
				new GenericXmlApplicationContext("applicationContext.xml");
		
		// 2.
		BoardService boardService = (BoardService) container.getBean("boardService");
		
		// 3.
		BoardVO vo = new BoardVO();
		vo.setTitle("임시 제목");
		vo.setWriter("홍길동");
		vo.setContent("임시 내용............");
		boardService.insertBoard(vo);
		
		// 4.
		List<BoardVO> boardList = boardService.getBoardList(vo);
		for(BoardVO board : boardList) {
			System.out.println("---> " + board.toString());
		}
		
		container.close();
	}
}
