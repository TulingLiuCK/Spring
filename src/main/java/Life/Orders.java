package Life;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;

/***
 #Create by LCK on 2021/12/18  21:18
 */

public class Orders implements BeanNameAware, BeanFactoryAware {

    private Logger logger = LoggerFactory.getLogger(Orders.class);

    private String oname;

    //无参构造

    public Orders() {
        System.out.println("第一步，执行无参构造创建bean实例");
    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("第二部，调用set方法设置属性值");
    }
    //创建执行的初始化的方法
    public void initMethod(){
        System.out.println("第三步，执行初始化方法");
    }

    //创建销毁的方法
    public void destoryMethod(){
        System.out.println("第五步，执行销毁的方法");
    }

    @Override
    public void setBeanName(String s) {
        logger.error("beanName:{}",s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        Orders bean = beanFactory.getBean(Orders.class);
        logger.error("bean:{}",bean);
        logger.error("BeanFactory:{}",beanFactory);
    }
}
