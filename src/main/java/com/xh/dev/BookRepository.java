package com.xh.dev;

import com.xh.bean.s.Book;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Created by admin on 2016/12/27.
 */
public interface BookRepository extends JpaRepository<Book, Long> {
}
