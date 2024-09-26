package com.test.community.service;

import java.util.List;

import com.test.community.vo.BoardVO;

public interface BoardService {
	
	// 게시글 등록
    int insert(BoardVO boardVO);
    
	// 게시글 목록
    List<BoardVO> selectAll(BoardVO boardVO);
    
}
