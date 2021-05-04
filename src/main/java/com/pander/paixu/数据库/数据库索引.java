package com.pander.paixu.数据库;

/**
 * @author: sunxuefei10
 * @date: 2021/5/3  4:47 下午
 */
public class 数据库索引 {
    /**
     * 聚簇索引 B+树
     * hash索引：不支持范围查找
     * B树：23树的变种，树的高度比平衡二叉树矮，回旋查找的问题，比如说查询大于5的数据，还需要往回父节点继续查找。
     * B+树解决了回旋查找的问题，底层会使用双向链表。范围查找速度快。
     *
     * IO操作是最耗时的部分
     * 每一个页保存着前后两个页的双向指针
     *
     *
     * 索引失效：
     * 违反最左匹配原则、使用大于失效，使用like 左边模糊查询
     * 主要是因为联合索引是以最左键为规则来排序的，所以只能通过a在通过b来使用。
     */
}
