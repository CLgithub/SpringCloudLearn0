# Sentinel

* [参考文档](https://sentinelguard.io/zh-cn/docs/introduction.html)

* 作用：流量治理组件，从流量路由、流量控制、流量整形、熔断降级、系统自适应过载保护、热点流量防护等多个维度来帮助开发者保障微服务的稳定性
* 服务熔断时，与Hystrix的区别
  * 原则相同: 当调用链路中某个资源出现不稳定，则对这个资源的调用进行限制，并让请求快速失败，避免影响到其它的资源，最终产生雪崩的效果
  * 手段上有区别：
    * Hystrix 通过线程池的方式，来对依赖(资源)进行了隔离，优点：彻底隔离，缺点：线程切换需要成本，需要预先给各个资源做线程池大小的分配
    * Sentinel：
      * 并发线程数进行限制
      * 响应时间对资源进行降级