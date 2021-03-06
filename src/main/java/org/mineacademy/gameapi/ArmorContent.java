package org.mineacademy.gameapi;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.mineacademy.gameapi.misc.ConfigSerializable;

/**
 * Represents armor content in a class tier
 */
public interface ArmorContent extends ConfigSerializable {

	/**
	 * Get the helmet
	 *
	 * @return the item or null if not set
	 */
	public ItemStack getHelmet();

	/**
	 * Get the chestplate
	 *
	 * @return the item or null if not set
	 */
	public ItemStack getChestplate();

	/**
	 * Get the leggings
	 *
	 * @return the item or null if not set
	 */
	public ItemStack getLeggings();

	/**
	 * Get the boots
	 *
	 * @return the item or null if not set
	 */
	public ItemStack getBoots();

	/**
	 * Get the item at a certain position of the array
	 *
	 * Typically we store helmet, chestplate, leggings and boots in an array
	 * so calling getByOrder(0) would call items[0] from the array to get
	 * the helmet, and so on.
	 *
	 * @deprecated confusing
	 * @throws IllegalArgumentException if out of range of the array
	 * @return the item or null if not set
	 */
	@Deprecated
	public ItemStack getByOrder(int order);

	/**
	 * Give the armor content to a player
	 *
	 * @param player the player to give to
	 */
	public void giveTo(Player player);
}