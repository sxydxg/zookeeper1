package curd;

import org.I0Itec.zkclient.ZkClient;
import org.apache.zookeeper.CreateMode;

/**
 * @auther 丁溪贵
 * @date 2019/9/16
 *
 *      ZKClient 的 增删查改
 */
public class CRUD {


    public static void main(String[] args) {

        ZkClient zkClient = new ZkClient("192.168.25.129:2181");
        //1.创建持久序列化的节点
//        zkClient.create("/aaa","数据", CreateMode.PERSISTENT_SEQUENTIAL);

        //2.读取节点的数据
//        Object o = zkClient.readData("/aaa0000000006");
//        System.out.println(o);

//        3.删除节点
//        zkClient.delete("/aaa0000000006");

//         4.修改摸个节点
//        zkClient.create("/bbb","111",CreateMode.PERSISTENT);
        zkClient.writeData("/bbb","222");  // 修改节点的值
        System.out.println(zkClient.readData("/bbb"));
    }
}
