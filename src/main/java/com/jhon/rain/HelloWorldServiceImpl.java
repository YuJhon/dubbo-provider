package com.jhon.rain;

/**
 * <p></p>
 *
 * @author jiangyu
 * @version v1.0
 * @className HelloWorldServiceImpl
 * @create 2017-03-02 23:14
 */
public class HelloWorldServiceImpl implements IHelloWorldService {

    public String sayHello(String name) {
        return "这是Provider01"+name;
    }
}
