package com.kyn.demo1.rule;

import com.kyn.demo1.entity.XiaoMing;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * @author Kangyanan
 * @Description: 小明喝汽水问题：1元钱一瓶汽水，喝完后两个空瓶换一瓶汽水，问：小明有20元钱，最多可以喝到几瓶汽水？
 * @date 2021/6/9
 */
public class Ming {
    public static void main(final String[] args) {
        KieContainer kc = KieServices.Factory.get().getKieClasspathContainer();
        System.out.println(kc.verify().getMessages().toString());
        execute(kc);
    }

    private static void execute(KieContainer kc) {
        KieSession ksession = kc.newKieSession("rule1KS");
        XiaoMing xiaoMing=new XiaoMing();
        xiaoMing.setMoney(50);
        ksession.insert(xiaoMing);
        ksession.fireAllRules();
        ksession.dispose();
    }
}
