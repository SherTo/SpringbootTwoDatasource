package com.xh.pri;

import com.xh.bean.p.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by admin on 2016/12/27.
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
