package com.hao.match;

/**
 * Created by Keeper on 2019-03-25
 * 比赛模板
 */
public abstract class MatchTemplate {
    public void execute(){
        //1:运动员进场
        playerCom();
        //2：热身
        ready();
        //3:比赛
        matching();
        //4：比赛结果处理
        resultMake();
        //5：记者采访
        reporterInterview();
    }

    private void reporterInterview() {
        System.out.println("记者采访");
    }

    protected abstract void resultMake();

    private void matching() {
        System.out.println("比赛进行中");
    }

    private void ready() {
        System.out.println("热身");
    }

    private void playerCom() {
        System.out.println("运动员进场");
    }
}
