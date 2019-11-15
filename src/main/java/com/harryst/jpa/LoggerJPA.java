package com.harryst.jpa;

import com.harryst.entity.LoggerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by harryhx on 2019/11/15.
 */
public interface LoggerJPA extends JpaRepository<LoggerEntity,Long> {
}
