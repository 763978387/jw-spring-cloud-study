package order.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * 手动实现Ribbon负载均衡轮训算法*/
public interface LoadBalancer {
    //放入服务实例列表
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
