package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyClient {

    public String getGreeting(){
        // making the spring call
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        MySpringBeanWithDependency springBean = context.getBean(MySpringBeanWithDependency.class);
        String myServiceOutput = springBean.run();
        context.close();
        return myServiceOutput;
    }
}
