package com.basic.bigdata.dao;

import com.basic.bigdata.model.TTuplelatency;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

/**
 * A data access object (DAO) providing persistence and search support for
 * TTuplelatency entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 *
 * @author MyEclipse Persistence Tools
 */
@Repository("tTuplelatencyDAO")
public class TTuplelatencyDAO extends  BaseHibernateDAOImpl<TTuplelatency> {
    private static final Logger log = LoggerFactory.getLogger(TTuplelatencyDAO.class);
}
