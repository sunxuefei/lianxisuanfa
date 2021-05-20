package com.pander.paixu.DDD领域驱动;

/**
 * @author: sunxuefei10
 * @date: 2021/5/4  3:50 下午
 */
public class DDD {


    /**
     * 数据驱动开发：
     * 需求分析
     * 数据建模：设计的数据模型
     * 建库建表
     * 编写业务逻辑
     *
     * 业务上的不同需求很少会重用。
     * 支付行为，不同的第三方传参不一样，那么很难复用。业务相同很难复用。
     *
     *
     * 业务：流程的流转
     *
     *
     *领域驱动设计：
     * 需求分析：统一语言、限界上下文
     * 领域分析：边界的分析上，设计的是业务模型
     * 领域建模：
     * 核心业务逻辑：
     * 技术细节：
     *
     *
     * 参与者
     * 参与者与参与者传递的东西
     * 关系
     * 解释
     *
     *
     *商城服务的设计
     * 查询商品
     * 订购商品
     * 订购支付
     * 仓库发货
     * 物流送货
     *
     * 各个领域的交互
     *
     * 领域保护手段：
     * ACL：通过适配器、桥接模式，接口层面的定义
     * OHS：
     * PL：
     *
     * bounded context 领域边界
     * aggregate 聚合根：大对象，多个entrties和value object组成
     * entities
     * value object
     * services 在entities满足不了的情况下
     * domainEvent 领域事件，领域边界触发的一种行为
     * factories
     * Repositories
     *
     * UML图
     * 泛化
     * 实现
     * 依赖
     * 关联
     * 聚合
     * 组合
     *
     * cola
     *
     *
     */
}
