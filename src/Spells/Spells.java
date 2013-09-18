package Spells;

/**
 * Created with IntelliJ IDEA.
 * User: Artem
 * Date: 17.09.13
 * Time: 19:18
 * To change this template use File | Settings | File Templates.
 */
public interface Spells
{
    abstract String Name();
    abstract String Information();
    abstract int ManaCost();
    abstract int Power();
    abstract int Chance();
}
