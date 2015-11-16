/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heroesofhordo;

/**
 *
 * @author Nogna
 */
class Inventory {

    Item[] items;
    static int total_number_items;

    static boolean equal(Inventory result, String[] b, int j) {
        for (int i = 0; i < j; i++) {
            if (result.items[i].item_name != b[i]) {
                return false;
            }
        }
        return true;
    }

    public Inventory() {
        total_number_items = 0;
        newInventory();

    }

    public void addItemInventory(Item new_item) {
        System.out.println("Picked up: " + new_item.item_name);
        total_number_items++;
        this.items = update(new_item);
    }

    private void newInventory() {
        this.items = new Item[1];
        total_number_items++;
        items[0] = new Weapon("Tiny knife");
    }

    public void printInventory() {
        System.out.println("Inventory: ");
        for (int i = 0; i < total_number_items; i++) {
            System.out.println((i + 1) + ": " + items[i].item_name);
        }
    }

    public Item[] deleteItemInventory(String removeItem) {
        Item[] updatedInventory = new Item[(items.length - 1)];
        for (int i = 0; i < items.length; i++) {
            if (!(items[i].item_name == removeItem)) {
                updatedInventory[i] = items[i];
            }
        }
        return updatedInventory;
    }

    private Item[] newInventory(int number_items) {
        Item[] tmpInventory = new Item[number_items];
        return tmpInventory;
    }

    int getTotalNumberItems() {
        return total_number_items;
    }

    private Item[] update(Item new_item) {
        Item[] tmpInventory = newInventory(total_number_items);
        for (int i = 0; i < items.length; i++) {
            tmpInventory[i] = items[i];
        }
        tmpInventory[total_number_items - 1] = new_item;

        return tmpInventory;
    }

    Item getItem(int ItemIndex) {
        return items[ItemIndex];

    }

}
