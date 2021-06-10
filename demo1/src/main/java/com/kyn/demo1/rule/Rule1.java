package com.kyn.demo1.rule;

import com.kyn.demo1.entity.Person;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.QueryResults;
import org.kie.api.runtime.rule.QueryResultsRow;

/**
 * @author Kangyanan
 * @Description:
 * @date 2021/6/9
 */
public class Rule1 {
    public static void main(final String[] args) {
        KieContainer kc = KieServices.Factory.get().getKieClasspathContainer();
        System.out.println(kc.verify().getMessages().toString());
        execute(kc);
    }

    private static void execute(KieContainer kc) {
        KieSession ksession = kc.newKieSession("rule1KS");
        Person p1 = new Person("xiao kang", 18, "coding");
        Person p2 = new Person("xiao wang", 28, "coding");
        Person p3 = new Person("xiao li", 38, "coding");
        ksession.insert(p1);
        ksession.insert(p2);
        ksession.insert(p3);
        ksession.fireAllRules();

        QueryResults results = ksession.getQueryResults("people1");
        System.out.println("we have " + results.size() + " people over the age  of 20");

        System.out.println("These people are are over 20:");

        for (QueryResultsRow row : results) {
            Person person = (Person) row.get("person");
            System.out.println(person.getName());
        }
        ksession.dispose();
    }
}
