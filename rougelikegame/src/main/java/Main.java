import com.sevenbits.roguelike.characters.Player;
import com.sevenbits.roguelike.containers.Chest;
import com.sevenbits.roguelike.items.Weapon;

public class Main {
    public static void main(String[] args) {

        Weapon weapon = new Weapon(1,1,50);
        Player player = new Player();
        Chest chest = new Chest(weapon);
        System.out.println(player.showInventory());
        player.takeItem(chest);
        System.out.println(player.showInventory());

    }
}
