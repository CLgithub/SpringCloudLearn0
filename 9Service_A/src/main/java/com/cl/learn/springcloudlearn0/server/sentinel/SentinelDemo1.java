package com.cl.learn.springcloudlearn0.server.sentinel;

import com.alibaba.csp.sentinel.Entry;
import com.alibaba.csp.sentinel.SphU;
import com.alibaba.csp.sentinel.node.Node;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * 快速开始，参考：https://sentinelguard.io/zh-cn/docs/quick-start.html
 *
 * @Author l
 * @Date 2022/11/22 10:23
 */
public class SentinelDemo1 {

    public static final String resourceName="HelloWorld";

    public static void main(String[] args) {
        initFlowRules();    // 配置规则
        while (true){
            try(Entry entry = SphU.entry(resourceName)){
                Thread.sleep(900);
                System.out.println("hello world"); // 被保护的逻辑
            }catch ( Exception e){
                System.out.println("blocked");
            }
        }
    }

    /**
     * 规则：定义每秒只能访问x次
     */
    private static void initFlowRules() {
        List<FlowRule> flowRules=new ArrayList<>();
        FlowRule flowRule = new FlowRule();
        flowRule.setResource(resourceName);  // 设置资源名称
        flowRule.setGrade(RuleConstant.FLOW_GRADE_QPS);    // 设置等级
        flowRule.setCount(1);   // 设置每秒访问次数
        flowRules.add(flowRule);
        FlowRuleManager.loadRules(flowRules);
    }
}
