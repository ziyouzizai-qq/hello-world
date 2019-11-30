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

	// ��дһ��panel�е�paint���� ������Ⱦͼ
	public void paint(Graphics gp){
		// �����˸�����������
		super.paint(gp);
		// ���ݹ���ͼ
		// �Ƚ�����������һ��ǿ��ת��
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
	
	// ���һ��������ǵķ���
	// ����ǵ����ĵ�����  x  y
	// ���������Բ�İ뾶  r
	// ��������涨����ʱ����ת�ĽǶ�  angle
	// 600*400 ������300*200 
	private Shape getStar(int x,int y,int r,double angle){
		// Ϊ���ýǶ���ת��ֵ��72��֮��
		angle = angle % 72;
		
		// ��Ҫͨ��������x y rȷ������ǵ�����������
		Point p1 = new Point(x,y-r);
		Point p2 = new Point((int)(x-r*Math.cos(Math.toRadians(18))),(int)(y-r*Math.sin(Math.toRadians(18))));
		Point p3 = new Point((int)(x+r*Math.cos(Math.toRadians(18))),(int)(y-r*Math.sin(Math.toRadians(18))));
		Point p4 = new Point((int)(x-r*Math.sin(Math.toRadians(36))),(int)(y+r*Math.cos(Math.toRadians(36))));
		Point p5 = new Point((int)(x+r*Math.sin(Math.toRadians(36))),(int)(y+r*Math.cos(Math.toRadians(36))));
		// ȷ���������  ����  �������path�����ƶ���p1
		GeneralPath path = new GeneralPath();
		path.moveTo(p1.getX(), p1.getY());//���ĵ��ƶ���p1ȥ
		path.lineTo(p4.getX(), p4.getY());
		path.lineTo(p3.getX(), p3.getY());
		path.lineTo(p2.getX(), p2.getY());
		path.lineTo(p5.getX(), p5.getY());
		path.lineTo(p1.getX(), p1.getY());
		
		AffineTransform transform = new AffineTransform();
		transform.rotate(Math.toDegrees(-angle),x,y);//ת��Ƕȵĺ���
		return transform.createTransformedShape(path);
	}
}
