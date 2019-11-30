package io;

import java.awt.AWTException;
import java.io.IOException;

/**
 * 重写超类含有throws声明异常抛出的方法时
 * 对throws的重写规划
 * @author Java
 *
 */
public class ThrowsDemo {
	public void dosome() throws IOException,AWTException{
		
	}
}
class son extends ThrowsDemo{
	/*public void dosome() throws IOException,AWTException{
		
	}*/
	//允许仅抛出部分异常
	
	//允许不再抛出异常
	/*public void dosome(){
		
	}*/
	//允许抛出超类方法抛出异常的子类型异常
	/*public void dosome() throws FileNotFoundException{
	
	}*/
	//不允许抛出额外异常
	/*public void dosome() throws SQLException{
	
	}*/
	//不允许抛出超类方法抛出异常的父类型异常
	/*public void dosome() throws Exception{
	
	}*/
}