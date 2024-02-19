package zhujie.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/***
 #Create by LCK on 2021/12/18  18:45
 */
@Component
public class User {
    @Value("liuchongkang")
    public String name;
}
