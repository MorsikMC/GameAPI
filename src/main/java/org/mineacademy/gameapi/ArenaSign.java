package org.mineacademy.gameapi;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.mineacademy.gameapi.misc.ConfigSerializable;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Represents a registered arena sign
 */
public interface ArenaSign extends ConfigSerializable {

	/**
	 * Get the sign type
	 *
	 * @return the sign type
	 */
	public SignType getType();

	/**
	 * Get the sign arena
	 *
	 * @return the arena associated with this sign
	 */
	public Arena getArena();

	/**
	 * Get the sign location
	 *
	 * @return the sign location
	 */
	public Location getLocation();

	/**
	 * Updates the sign with the latest information.
	 *
	 * Typically used to update arena join signs when players join
	 * so the sign always set how many players are joined accurately
	 */
	public void updateState();

	/**
	 * Called when the sign is clicked when the player is joined in the arena (lobby or playing)
	 *
	 * @param player the player
	 */
	public void onSignOutGameClick(Player player);

	/**
	 * Called when the player clicks the sign but is not joined in the arena (NOT lobby nor playing)
	 *
	 * @param player the player
	 */
	public void onSignInGameClick(Player player);

	/**
	 * Called when the arena is clicked by a player editing this arena
	 *
	 * @param player the player
	 */
	public void onSignSetupClick(Player player);

	/**
	 * Permanently remove the block and data stored about this sign
	 */
	public void removeSign();

	/**
	 * Represents a sign type
	 */
	@RequiredArgsConstructor
	public static enum SignType {

		/**
		 * The join sign
		 */
		JOIN("Join"),

		/**
		 * The leave sign
		 */
		LEAVE("Leave"),

		/**
		 * The class sign
		 */
		CLASS("Class"),

		/**
		 * The team sign
		 */
		TEAM("Team"),

		/**
		 * The upgrade sign
		 */
		UPGRADE("Upgrade"),

		/**
		 * The power sign
		 */
		POWER("Power");

		/**
		 * The human readable representation of the sign type
		 */
		@Getter
		private final String key;

		@Override
		public String toString() {
			return key;
		}
	}
}