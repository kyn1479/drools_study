package com.kyn.demo1.rule;

import com.kyn.demo1.entity.TaxiFare;
import com.kyn.demo1.entity.TaxiRide;
import com.kyn.demo1.entity.XiaoMing;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.math.BigDecimal;

/**
 * @author Kangyanan
 * @Description:
 * @date 2021/6/9
 */
public class TaxiFareRule {
    public static void main(final String[] args) {
        KieContainer kc = KieServices.Factory.get().getKieClasspathContainer();
        System.out.println(kc.verify().getMessages().toString());
        execute(kc);
    }

    private static void execute(KieContainer kc) {
        TaxiRide taxiRide =new TaxiRide(false,new BigDecimal(20));
        TaxiFare rideFare = new TaxiFare();
        KieSession ksession = kc.newKieSession("rule1KS");
        ksession.setGlobal("rideFare", rideFare);
        ksession.insert(taxiRide);
        ksession.fireAllRules();
        BigDecimal totalCharge=rideFare.total();
        ksession.dispose();
        String totalString = totalCharge.setScale(1,BigDecimal.ROUND_UP).stripTrailingZeros().toPlainString();
        System.out.println("总消费金额："+totalString);
    }
}
