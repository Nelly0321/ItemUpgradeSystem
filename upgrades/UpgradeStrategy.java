package upgrades;

import items.Item;

public interface UpgradeStrategy {
    void upgrade(Item item);
}
