package com.hao.simplefactory;

/**
 * created by keeper at 2019-03-20
 */
public class SimpleFactoryTest {

    public static void main(String[] args){
        CourseFactory courseFactory = CourseFactory.getInstance();
        Course course = courseFactory.getCourse(JavaCourse.class);
        System.out.println("课程名称" + course.getName());
        System.out.println("课程内容" + course.getContent());
    }
}
