package io;

import java.awt.AWTException;
import java.io.IOException;

/**
 * ��д���ຬ��throws�����쳣�׳��ķ���ʱ
 * ��throws����д�滮
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
	//������׳������쳣
	
	//�������׳��쳣
	/*public void dosome(){
		
	}*/
	//�����׳����෽���׳��쳣���������쳣
	/*public void dosome() throws FileNotFoundException{
	
	}*/
	//�������׳������쳣
	/*public void dosome() throws SQLException{
	
	}*/
	//�������׳����෽���׳��쳣�ĸ������쳣
	/*public void dosome() throws Exception{
	
	}*/
}