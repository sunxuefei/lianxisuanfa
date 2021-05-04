package com.pander.paixu.SQL;

/**
 * @author: sunxuefei10
 * @date: 2021/5/3  2:52 下午
 */
public class 练习题 {

    /**
     * 查找最晚入职员工的所有信息
     * select * from employees order by hire_date desc limit 1
     */


    /**
     * 查找入职员工倒数第三的员工的所有信息
     * select * from employees order by hire_date desc limit 2,1
     */

    /**
     * 查找当前薪水以及部门编号
     * select a.*,b.dept_no from salaries a left join dept_manager b
     * on a.emp_no = b.emp_no  where a.to_date='9999-01-01' and b.to_date='9999-01-01' order by a.emp_no asc
     */


    /**
     * 请你查找薪水排名第二多的员工编号emp_no、薪水salary、last_name以及first_name，不能使用order by完成
     * select s.emp_no ,s.salary,e.last_name,e.first_name from salaries s join employees e
     * on s.em_no = e.emp_no
     * where s.salary =(
     * select s1.salary from salaries s1 join salaries s2
     * on s1.salary <= s2.salary
     * group by s1.salary
     * having count(distinct s2.salary)=2
     * and s1.to_date = '9999-01-01'
     *     and s2.to_date = '9999-01-01'
     *     )
     *     and s.to_date = '9999-01-01'
     */

}
