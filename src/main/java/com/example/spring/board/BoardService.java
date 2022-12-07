package com.example.spring.board;

import java.util.List;


public interface BoardService {
    public int insertBoard(com.example.spring.board.BoardVO vo);
    public int deleteBoard(int seq);
    public int updateBoard(com.example.spring.board.BoardVO vo);
    public com.example.spring.board.BoardVO getBoard(int seq);
    public List<com.example.spring.board.BoardVO> getBoardList();
}