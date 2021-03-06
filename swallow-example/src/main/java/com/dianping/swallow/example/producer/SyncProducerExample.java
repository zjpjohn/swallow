package com.dianping.swallow.example.producer;

import com.dianping.swallow.common.message.Destination;
import com.dianping.swallow.producer.Producer;
import com.dianping.swallow.producer.ProducerConfig;
import com.dianping.swallow.producer.impl.ProducerFactoryImpl;

/**
 * @rundemo_name 同步发送者例子
 */
public class SyncProducerExample {

   public static void main(String[] args) throws Exception {
      ProducerConfig config = new ProducerConfig();
      Producer p = ProducerFactoryImpl.getInstance().createProducer(Destination.topic("example"), config);
      for (int i = 0; i < 10; i++) {
         p.sendMessage("消息-" + i);
         Thread.sleep(500);
      }
   }

}
