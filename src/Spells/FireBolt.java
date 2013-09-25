package Spells;

/**
 * Created with IntelliJ IDEA.
 * User: Artem
 * Date: 17.09.13
 * Time: 19:24
 * To change this template use File | Settings | File Templates.
 */
public class FireBolt implements Spells
{
    @Override
    public String Name() {
        return "Огненная стрела";
    }

    @Override
    public String Information() {
        return "Описание";
    }

    @Override
    public int ManaCost() {
        return 5;
    }

    @Override
    public int Power() {
        return 5;
    }

    @Override
    public int Chance() {
        return 80;
    }
}
