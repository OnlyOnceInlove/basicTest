package pattern.mediator;

/**
 * @author MaZhuli
 * @description
 * @date 2019/6/27
 */
public class User1 extends User{
    public User1(Mediator mediator){
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user1 exe!");
    }
}
