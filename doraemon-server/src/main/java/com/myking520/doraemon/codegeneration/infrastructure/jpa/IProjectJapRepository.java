package com.myking520.doraemon.codegeneration.infrastructure.jpa;

import com.myking520.doraemon.codegeneration.infrastructure.jpa.po.ProjectPO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;


public interface IProjectJapRepository extends JpaRepository<ProjectPO,Long>, QuerydslPredicateExecutor<ProjectPO> {
}
