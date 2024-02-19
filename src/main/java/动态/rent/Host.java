package 动态.rent;

/***
 #Create by LCK on 2021/12/19  14:01
 */
public class Host implements Rent{
    @Override
    public void rent() {
        System.out.println("房东要出租房子");
    }
}
