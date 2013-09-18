import Spells.FireBolt;

/**
 * Created with IntelliJ IDEA.
 * User: Artem
 * Date: 17.09.13
 * Time: 20:30
 * To change this template use File | Settings | File Templates.
 */
public class ViewSpell extends FireBolt {
    public void ViewSpell()
    {
        System.out.println(Name());
        System.out.println(Information());
        System.out.println(ManaCost());
        System.out.println(Power());
        System.out.println(Chance());
    }
}
