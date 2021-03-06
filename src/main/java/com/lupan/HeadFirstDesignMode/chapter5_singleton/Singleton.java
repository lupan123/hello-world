package com.lupan.HeadFirstDesignMode.chapter5_singleton;

/**
 * TODO 单例模式，线程不安全,延迟创建实例对象（第一次调用getInstance()创建）
 *
 * @author lupan
 * @version 2016/3/22 0022
 */
public class Singleton {
    /**
     * 首先控制构造函数类外不能访问
     */
    private Singleton() {
    }
    //创建一个本身的实例对象
    private static Singleton instance;
    /**
     * 访问器
     */
    public static Singleton getInstance(){
        if (instance != null){
            return instance;
        }else {
            //多线程触发错误
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            instance = new Singleton();
            return instance;
        }
    }
}
