package upgrades;

import items.Item;
import upgrades.Rarity;

public class CommonToGreatUpgrade implements UpgradeStrategy {
    @Override
    public void upgrade(Item item) {
        if (item.getRarity() == Rarity.COMMON) {
            item.setRarity(Rarity.RARE);
            System.out.println(item.getName() + " has been upgraded from Common to RARE!");
        } else {
            System.out.println(item.getName() + " is not eligible for a Common to RARE upgrade.");
        }
    }
}
