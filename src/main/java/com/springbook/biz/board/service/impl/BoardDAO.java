package com.springbook.biz.board.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.springbook.biz.board.service.BoardVO;

@Repository("boardDAO")
public class BoardDAO {
	
	private SqlSession sqlSession;
	
	public void insertBoard(BoardVO vo) {
		sqlSession.insert("BoardDAO.insertBoard", vo);
	}
	public void updateBoard(BoardVO vo) {
		sqlSession.update("BoardDAO.updateBoard", vo);
	}
	public void deleteBoard(BoardVO vo) {
		sqlSession.delete("BoardDAO.deleteBoard", vo);
	}
	public BoardVO getBoard(BoardVO vo) {
		return (BoardVO) sqlSession.selectOne("BoardDAO.getBoard", vo);
	}
	public List<BoardVO> getBoardList(BoardVO vo){
		return sqlSession.selectList("BoardDAO.getBoardList", vo);
	};
}
