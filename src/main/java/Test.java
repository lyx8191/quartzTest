import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.senya.job.ClusterQuartz;


public class Test {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        ClusterQuartz clusterQuartz = (ClusterQuartz) context.getBean("clusterQuartz");
        clusterQuartz.printUserInfo();

        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
