package com.goodee.library.book;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	
	private static final Logger LOGGER =
			LoggerFactory.getLogger(BookService.class);
	
	@Autowired
	BookDao bookDao;

	public int createBookConfirm(BookVo vo) {
		int result = bookDao.insertBook(vo);
		return result;
	}
	public List<BookVo> selectBookList(BookVo vo){
		LOGGER.info("[BookService] selectBookList();");
		List<BookVo> bookVos = bookDao.selectBookList(vo);
		return bookVos;
	}
	
	public int selectBookCount(String b_name) {
		LOGGER.info("[BookService] selectBookCount();");
		int totalCount = bookDao.selectBookCount(b_name);
		return totalCount;
	}
	
	public BookVo bookDetail(int b_no) {
		LOGGER.info("[BookService] bookDetail();");
		BookVo vo = bookDao.selectBookOne(b_no);
		return vo;
	}
	
	public int modifyConfirm(BookVo vo) {
		LOGGER.info("[BookService]modifyConfirm();");
		int result = bookDao.updateBook(vo);
		return result;
	}
	
}
