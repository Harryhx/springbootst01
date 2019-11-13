package com.harryst.jpa;

import com.harryst.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * Created by harryhx on 2019/11/12.
 */
public interface UserJPA extends JpaRepository<User,Long> ,JpaSpecificationExecutor<User>,Serializable{

}
