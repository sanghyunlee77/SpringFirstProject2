package com.example.spring.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService{
    @Autowired
    BoardDAO boardDAO;

    public BoardServiceImpl(BoardDAO boardDAO) {
        this.boardDAO = boardDAO;
    }

    @Override
    public int insertBoard(com.example.spring.board.BoardVO vo){
        return boardDAO.insertBoard(vo);
    }

    @Override
    public int deleteBoard(int seq){
        return boardDAO.deleteBoard(seq);
    }

    @Override
    public int updateBoard(com.example.spring.board.BoardVO vo){
        return boardDAO.updateBoard(vo);
    }

    @Override
    public com.example.spring.board.BoardVO getBoard(int seq){
        return boardDAO.getBoard(seq);
    }

    @Override
    public List<com.example.spring.board.BoardVO> getBoardList(){
        return boardDAO.getBoardList();
    }
}