package com.goodee.library.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	
	@Autowired
	BookDao bookDao;

	public int createBookConfirm(BookVo vo) {
		int result = bookDao.insertBook(vo);
		return result;
	}
}
