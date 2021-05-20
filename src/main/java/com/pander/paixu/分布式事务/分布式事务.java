package com.pander.paixu.分布式事务;

/**
 * @author: sunxuefei10
 * @date: 2021/5/5  3:16 下午
 */
public class 分布式事务 {

    /**
     * 分布式事务：
     * seata框架：
     * Transaction Coordinator事务协调器三大概念：
     * LockManager：AT模式时，将分支上的数据库未全局提交或回滚的数据锁到TC，保证事务数据的隔离。
     * SessionManager：记录事务执行状态，持久化事务数据，TC重启时，应能加载事务重新提交或回滚，使TC可用
     *                 FileBasedSessionManager：事务数据保存在内存中，并持久化事务数据到本地文件
     *                 DBBasedSessionManager：事务数据持久化到数据库中，采用这种方式，TC可做到高可用
     *                 ETCD
     *                 RAFT
     * TransactionManager:
     *
     *
     * AT模式：
     *
     * UndoLogManager，将undolog数据保存到数据库中
     *
     *
     *
     *
     *DatasourceManager
     *
     *
     *
     */
}
