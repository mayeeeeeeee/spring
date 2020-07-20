package org.springframework.hello;

/**
 * @author wangzhiwen
 * @version 1.0
 * @description
 * @date 2020/7/19 14:31
 **/
public class HelloSpring {
	public void hello () {
		System.out.println("hello spring");
	}

	public static void main(String[] args) {
		new HelloSpring().hello();
	}
}
