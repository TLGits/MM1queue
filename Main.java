/********************
 *  M/M/1 队列模型
 *******************/
package mm1;

public class Main {

    public static void main(String[] args) {
    	
        double ta = 0.015;  // 平均到达时间
        double ts = 0.015;  // 平均服务时间
        double length = 100;  // 监控时钟终点
        Controller c1 = new Controller(ta,ts,length);
		System.out.println("仿真 1: 平均到达时间ta = " + ta + ", 平均服务时间ts = " + ts + ", 监控时钟终点 length = " + length);
		c1.run();
		System.out.println("仿真结束");
    }

}
