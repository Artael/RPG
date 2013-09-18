package Spells;

/**
 * Created with IntelliJ IDEA.
 * User: Artem
 * Date: 17.09.13
 * Time: 23:23
 * To change this template use File | Settings | File Templates.
 */
public class FireBall implements Spells
{
    @Override
    public String Name() {
        return "Огненный шар";
    }
    @Override
    public String Information() {
        return "Информация";
    }
    @Override
    public int ManaCost() {
        return 7;
    }
    @Override
    public int Power() {
        return 10;
    }
    @Override
    public int Chance() {
        return 95;
    }
}
