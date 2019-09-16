package watch;

import org.I0Itec.zkclient.IZkDataListener;
import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.ZkConnection;
import org.apache.zookeeper.WatchedEvent;

import javax.xml.bind.SchemaOutputResolver;
import java.io.IOException;

/**
 * @auther 丁溪贵
 * @date 2019/9/16
 */
public class Watcher {


    public static void main(String[] args) throws IOException {

        ZkConnection zkConnection = new ZkConnection("192.168.25.129:2181");

        ZkClient zkClient = new ZkClient(zkConnection);

        // 比watch更加智能，直接变成了订阅。
        zkClient.subscribeDataChanges("/ding2", new IZkDataListener() {
            public void handleDataChange(String s, Object o) throws Exception {
                System.out.println("数据被改变了");

            }

            public void handleDataDeleted(String s) throws Exception {
                System.out.println("数据被参数了");
            }
        });

        System.in.read();
    }
}
