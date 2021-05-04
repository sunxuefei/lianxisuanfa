package com.pander.paixu.数据库;

/**
 * @author: sunxuefei10
 * @date: 2021/5/3  4:59 下午
 */
public class explain命令详解 {

    /**
     * id:当前查询语句出现顺序的id，id越大优先级越高
     * select_type: 查询是简单查询还是复杂查询，Simple：简单查询。primary：复杂查询中最外层的查询。subquery：包含在select中的子查询
     *              derived：包含在from子句中的子查询。union：在union中第二个和随后的select。
     *
     *
     * table: 查询的表的名称
     *
     *
     * type: 表示关联类型和访问类型。从最优到最差：system->const->eq_ref->ref->range->index->ALL
     *       const:根据主键来查找，一般只有一条。
     *       system：system是const的特例，整张表只有一条记录。
     *       eq_ref：代表使用主键关联
     *       ref：不使用唯一索引，使用的是普通索引。
     *       range：范围扫描，使用索引进行范围扫描
     *       index：全表扫描使用索引
     *       All：全表扫描
     *
     *
     * possible_keys:代表可能使用的索引，
     *
     *
     * key:代表真正使用的索引。
     *
     *
     * key_len:代表索引的长度
     *
     *
     * ref:使用的索引的字段对应的值
     *
     *
     * rows:预测需要检测的行数
     *
     *
     *
     * Extra:展示的是额外信息，using index 使用覆盖索引
     *       using where 使用where语句来处理结果
     *       using index condition 查询的列不完全被索引覆盖
     *       using temporary mysql需要创建一张临时表来处理查询
     *
     *
     */
}
