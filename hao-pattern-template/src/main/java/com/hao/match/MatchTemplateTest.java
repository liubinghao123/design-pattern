package com.hao.match;

/**
 * Created by Keeper on 2019-03-25
 */
public class MatchTemplateTest {
    public static void main(String[] args){
        MatchTemplate template = new NBARegularMatch();
        template.execute();

        template = new NBAChampionMatch();
        template.execute();
    }
}
