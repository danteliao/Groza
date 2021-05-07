package iot.technology.groza.queue;

import iot.technology.groza.queue.common.TopicPartitionInfo;

/**
 * @author mushuwei
 * @date 2021/5/7 11:37 下午
 */
public interface TbQueueProducer<T extends GaQueueMsg> {

    void init();

    String getDefaultTopic();

    void send(TopicPartitionInfo tpi, T msg, GaQueueCallback callback);

    void stop();
}
