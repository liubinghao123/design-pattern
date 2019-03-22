package com.hao.simplefactory;

/**
 * created by keeper at 2019-03-20
 * 简单工厂模式，传入参数即可获取结果，操作简单、职责简单、任务重
 */
public class CourseFactory {
    private volatile static CourseFactory courseFactory = null;
    private CourseFactory(){}

    public static CourseFactory getInstance(){
        if(courseFactory == null){
            synchronized (CourseFactory.class){
                if(courseFactory == null){
                    courseFactory = new CourseFactory();
                }
            }
        }
        return courseFactory;
    }

    /**
     * 获取课程
     * @param clazz
     * @return
     */
    public Course getCourse(Class<? extends Course> clazz){
        try {
            return (Course)clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
