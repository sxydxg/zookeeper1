package helloworld;

import org.I0Itec.zkclient.ZkClient;
import org.apache.zookeeper.CreateMode;

/**
 * @auther 丁溪贵
 * @date 2019/9/16
 *
 *    在中央仓库发现了2个版本的zk客户端，在此我选择票数较多的zk客户端，
 *    下面是传送地址：https://github.com/sgroschupf/zkclient
 *
 *    友情提示：
 *    这些api方法封装了原生的zookeeper原生api且更加智能，你认为可能会发生错误的地方，它都会帮你补上和优化。
 *
 */
public class HelloWorldZK {

    public static void main(String[] args) {
        //不需要写通信的协议
        ZkClient zkClient = new ZkClient("192.168.25.129:2181");
        //ctrl+p 打印形参(为什么不一个提示键走天下呢？)
       // zkClient.create("/ding2","你爱我吗", CreateMode.PERSISTENT);


        Object o = zkClient.readData("/ding2");
        System.out.println(o);

    }


}
