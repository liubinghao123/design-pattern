package com.hao;

/**
 *苹果公司委派生产任务
 */
public class Apply {
    private Department department;
    public Apply(Department department){
        this.department = department;
    }
    //委派任务
    public void doing(String command){
        this.department.doing(command);
    }
}
