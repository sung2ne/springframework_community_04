package com.test.community.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.test.community.vo.BoardVO;

@Mapper
public interface BoardMapper {
    
	// 게시글 등록
    int insert(BoardVO boardVO);
    
	// 게시글 목록
    List<BoardVO> selectAll(BoardVO boardVO);

}
