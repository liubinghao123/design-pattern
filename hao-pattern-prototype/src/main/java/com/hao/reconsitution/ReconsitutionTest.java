package com.hao.reconsitution;

/**
 * Created by Keeper on 2019-03-22
 */
public class ReconsitutionTest {
    public static void main(String[] args){
        UserVo userVo = new UserVo();
        userVo.setMyName("jack");
        userVo.setMyAge(10);
        userVo.setMyClassName("一班");
        //before
        UserEntity userEntity = new UserEntity();
        userEntity.setName(userVo.getMyName());
        userEntity.setAge(userVo.getMyAge());
        userEntity.setClassName(userVo.getMyClassName());
        UserService userService = new UserService();
        userService.save(userEntity);

        //after
        UserEntity userEntity1 = userVo.clone();
        userService.save(userEntity1);

    }
}
