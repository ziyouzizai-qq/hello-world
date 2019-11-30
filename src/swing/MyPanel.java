package swing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;

import javax.swing.JPanel;

public class MyPanel extends JPanel{

	// 重写一个panel中的paint方法 负责渲染图
	public void paint(Graphics gp){
		// 别忘了父类做的事情
		super.paint(gp);
		// 根据规则画图
		// 先将方法参数做一个强制转换
		Graphics2D g2 = (Graphics2D)gp;
		g2.setColor(Color.yellow);
		Shape shap1 = this.getStar(100, 100, 60, 0);
		Shape shap2 = this.getStar(200, 40, 20, 180-Math.toDegrees(Math.atan(5/3)));
		Shape shap3 = this.getStar(240, 80, 20, 180-Math.toDegrees(Math.atan(7/1)));
		Shape shap4 = this.getStar(240, 140, 20, Math.toDegrees(Math.atan(7/2)));
		Shape shap5 = this.getStar(200, 180, 20, Math.toDegrees(Math.atan(5/4)));
//		g2.draw(shap1);
//		g2.draw(shap2);
//		g2.draw(shap3);
//		g2.draw(shap4);
//		g2.draw(shap5);
		g2.fill(shap1);
		g2.fill(shap2);
		g2.fill(shap3);
		g2.fill(shap4);
		g2.fill(shap5);
	}
	
	// 设计一个放五角星的方法
	// 五角星的中心点坐标  x  y
	// 五角星外切圆的半径  r
	// 五角星上面定点逆时针旋转的角度  angle
	// 600*400 左上是300*200 
	private Shape getStar(int x,int y,int r,double angle){
		// 为了让角度旋转的值在72度之内
		angle = angle % 72;
		
		// 需要通过给定的x y r确定五角星的五个点的坐标
		Point p1 = new Point(x,y-r);
		Point p2 = new Point((int)(x-r*Math.cos(Math.toRadians(18))),(int)(y-r*Math.sin(Math.toRadians(18))));
		Point p3 = new Point((int)(x+r*Math.cos(Math.toRadians(18))),(int)(y-r*Math.sin(Math.toRadians(18))));
		Point p4 = new Point((int)(x-r*Math.sin(Math.toRadians(36))),(int)(y+r*Math.cos(Math.toRadians(36))));
		Point p5 = new Point((int)(x+r*Math.sin(Math.toRadians(36))),(int)(y+r*Math.cos(Math.toRadians(36))));
		// 确定五个定点  连线  先让这个path对象移动到p1
		GeneralPath path = new GeneralPath();
		path.moveTo(p1.getX(), p1.getY());//中心点移动到p1去
		path.lineTo(p4.getX(), p4.getY());
		path.lineTo(p3.getX(), p3.getY());
		path.lineTo(p2.getX(), p2.getY());
		path.lineTo(p5.getX(), p5.getY());
		path.lineTo(p1.getX(), p1.getY());
		
		AffineTransform transform = new AffineTransform();
		transform.rotate(Math.toDegrees(-angle),x,y);//转变角度的函数
		return transform.createTransformedShape(path);
	}
}
