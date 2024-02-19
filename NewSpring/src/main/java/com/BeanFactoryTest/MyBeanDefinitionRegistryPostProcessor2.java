package com.BeanFactoryTest;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/***
 #Create by LCK on 2022/9/5
 # 用法:
 */
@Component
public class MyBeanDefinitionRegistryPostProcessor2 implements BeanDefinitionRegistryPostProcessor, Ordered {
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry beanDefinitionRegistry) throws BeansException {

        System.out.println(String.format("BeanDefinitionRegistryPostProcessor2{order=%d}，注册car bean", this.getOrder()));
        //定义一个字符串类型的bean
        AbstractBeanDefinition userNameBdf = BeanDefinitionBuilder.genericBeanDefinition(String.class).
                addConstructorArgValue("保时捷").
                getBeanDefinition();
        //将userNameBdf注册到spring容器中
        beanDefinitionRegistry.registerBeanDefinition("car", userNameBdf);
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {

    }

    @Override
    public int getOrder() {
        return 1;
    }
}
