package upgrades;

import items.*;

public interface UpgradeStrategy {
    void upgrade(Inventory inventory, Item targetItem);

}
