package mg.world;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockBurnEvent;
import org.bukkit.event.block.BlockDamageEvent;
import org.bukkit.event.block.BlockDispenseEvent;
import org.bukkit.event.block.BlockExpEvent;
import org.bukkit.event.block.BlockExplodeEvent;
import org.bukkit.event.block.BlockFadeEvent;
import org.bukkit.event.block.BlockFormEvent;
import org.bukkit.event.block.BlockGrowEvent;
import org.bukkit.event.block.BlockPhysicsEvent;
import org.bukkit.event.block.BlockPistonExtendEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.block.BlockSpreadEvent;
import org.bukkit.event.block.EntityBlockFormEvent;
import org.bukkit.event.block.LeavesDecayEvent;
import org.bukkit.event.block.NotePlayEvent;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.enchantment.EnchantItemEvent;
import org.bukkit.event.enchantment.PrepareItemEnchantEvent;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.CreeperPowerEvent;
import org.bukkit.event.entity.EntityChangeBlockEvent;
import org.bukkit.event.entity.EntityDamageByBlockEvent;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.entity.EntityTargetEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.event.inventory.InventoryCreativeEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.inventory.InventoryPickupItemEvent;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerChatTabCompleteEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerPortalEvent;
import org.bukkit.event.server.TabCompleteEvent;
import org.bukkit.event.weather.WeatherChangeEvent;
import org.bukkit.event.world.StructureGrowEvent;

public class WorldManager implements Listener{
	
	public static Map<String, List<World>> cancelledEvents = new HashMap<>();
	public static List<String> blackInvs = new ArrayList<>();
	
	@EventHandler
	public void onBlockBreak(final BlockBreakEvent event) {
		if (cancelledEvents.get(event.getEventName()).contains(event.getBlock().getWorld())) {
			event.setCancelled(true);
		}
	}
	
	@EventHandler
	public void onBlockBurn(BlockBurnEvent event) {
		if (cancelledEvents.get(event.getEventName()).contains(event.getBlock().getWorld())) {
			event.setCancelled(true);
		}
	}
	
	@EventHandler
	public void onBlockDispense(BlockDispenseEvent event) {
		if (cancelledEvents.get(event.getEventName()).contains(event.getBlock().getWorld())) {
			event.setCancelled(true);
		}
	}
	
	@EventHandler
	public void onBlockDamage(BlockDamageEvent event) {
		if (cancelledEvents.get(event.getEventName()).contains(event.getBlock().getWorld())) {
			event.setCancelled(true);
		}
	}
	
	@EventHandler
	public void onBlockExp(BlockExpEvent event) {
		if (cancelledEvents.get(event.getEventName()).contains(event.getBlock().getWorld())) {
			event.setExpToDrop(0);
		}
	}
	
	@EventHandler
	public void onBlockFade(BlockFadeEvent event) {
		if (cancelledEvents.get(event.getEventName()).contains(event.getBlock().getWorld())) {
			event.setCancelled(true);
		}
	}
	
	@EventHandler
	public void onBlockForm(BlockFormEvent event) {
		if (cancelledEvents.get(event.getEventName()).contains(event.getBlock().getWorld())) {
			event.setCancelled(true);
		}
	}
	
	@EventHandler
	public void onBlockGrow(BlockGrowEvent event) {
		if (cancelledEvents.get(event.getEventName()).contains(event.getBlock().getWorld())) {
			event.setCancelled(true);
		}
	}
	
	@EventHandler
	public void onBlockPhysics(BlockPhysicsEvent event) {
		if (cancelledEvents.get(event.getEventName()).contains(event.getBlock().getWorld())) {
			event.setCancelled(true);
		}
	}
	
	@EventHandler
	public void onPistonUsed(BlockPistonExtendEvent event) {
		if (cancelledEvents.get(event.getEventName()).contains(event.getBlock().getWorld())) {
			event.setCancelled(true);
		}
	}
	
	@EventHandler
	public void onBlockPlace(BlockPlaceEvent event) {
		if (cancelledEvents.get(event.getEventName()).contains(event.getBlock().getWorld())) {
			event.setCancelled(true);
		}
	}
	
	@EventHandler
	public void onBlockSpread(BlockSpreadEvent event) {
		if (cancelledEvents.get(event.getEventName()).contains(event.getBlock().getWorld())) {
			event.setCancelled(true);
		}
	}
	
	@EventHandler
	public void onBlockFormByEntity(EntityBlockFormEvent event) {
		if (cancelledEvents.get(event.getEventName()).contains(event.getBlock().getWorld())) {
			event.setCancelled(true);
		}
	}
	
	@EventHandler
	public void onNotePlay(NotePlayEvent event) {
		if (cancelledEvents.get(event.getEventName()).contains(event.getBlock().getWorld())) {
			event.setCancelled(true);
		}
	}
	
	@EventHandler
	public void onLeavesDecay(LeavesDecayEvent event) {
		if (cancelledEvents.get(event.getEventName()).contains(event.getBlock().getWorld())) {
			event.setCancelled(true);
		}
	}
	
	@EventHandler
	public void onSignChange(SignChangeEvent event) {
		if (cancelledEvents.get(event.getEventName()).contains(event.getBlock().getWorld())) {
			event.setCancelled(true);
		}
	}
	
	@EventHandler
	public void onBlockExplode(BlockExplodeEvent event) {
		if (cancelledEvents.get(event.getEventName()).contains(event.getBlock().getWorld())) {
			event.setCancelled(true);
		}
	}
	
	@EventHandler
	public void onEnchant(EnchantItemEvent event) {
		if (cancelledEvents.get(event.getEventName()).contains(event.getEnchanter().getWorld())) {
			event.setCancelled(true);
		}
	}
	
	@EventHandler
	public void onPrepareEnchant(PrepareItemEnchantEvent event) {
		if (cancelledEvents.get(event.getEventName()).contains(event.getEnchanter().getWorld())) {
			event.setCancelled(true);
		}
	}
	
	@EventHandler
	public void onEntitySpawn(CreatureSpawnEvent event) {
		if (cancelledEvents.get(event.getEventName()).contains(event.getLocation().getWorld())) {
			event.setCancelled(true);
		}
	}
	
	@EventHandler
	public void onUpgradeCreeper(CreeperPowerEvent event) {
		if (cancelledEvents.get(event.getEventName()).contains(event.getEntity().getWorld())) {
			event.setCancelled(true);
		}
	}
	
	@EventHandler
	public void onFallComplete(EntityChangeBlockEvent event) {
		if (cancelledEvents.get(event.getEventName()).contains(event.getEntity().getWorld())) {
			event.setCancelled(true);
		}
	}
	
	@EventHandler
	public void onCactus(EntityDamageByBlockEvent event) {
		if (cancelledEvents.get(event.getEventName()).contains(event.getEntity().getWorld())) {
			event.setCancelled(true);
		}
	}
	
	@EventHandler
	public void onEE(EntityExplodeEvent event) {
		if (cancelledEvents.get(event.getEventName()).contains(event.getEntity().getWorld())) {
			event.setCancelled(true);
		}
	}
	
	@EventHandler
	public void onEntityBecomeAngry(EntityTargetEvent event) {
		if (cancelledEvents.get(event.getEventName()).contains(event.getEntity().getWorld())) {
			event.setCancelled(true);
		}
	}
	
	@EventHandler
	public void onArrow(ProjectileLaunchEvent event) {
		if (cancelledEvents.get(event.getEventName()).contains(event.getEntity().getWorld())) {
			event.setCancelled(true);
		}
	}
	
	@EventHandler
	public void onUsingCreative(InventoryCreativeEvent event) {
		if (cancelledEvents.get(event.getEventName()).contains(event.getWhoClicked().getWorld())) {
			event.setCancelled(true);
		}
	}
	
	@EventHandler
	public void onHopperPickUp(InventoryPickupItemEvent event) {
		if (cancelledEvents.get(event.getEventName()).contains(event.getItem().getWorld())) {
			event.setCancelled(true);
		}
	}
	
	@EventHandler
	public void onCraft(CraftItemEvent event) {
		if (cancelledEvents.get(event.getEventName()).contains(event.getWhoClicked().getWorld())) {
			event.setCancelled(true);
		}
	}
	
	@EventHandler
	public void onUsingBlackListedBlocks(InventoryOpenEvent event) {
		if (blackInvs.contains("Open"+event.getInventory().getType().toString())) {
			event.setCancelled(true);
		}
	}
	
	@EventHandler
	public void onLay(PlayerBedEnterEvent event) {
		if (cancelledEvents.get(event.getEventName()).contains(event.getPlayer().getWorld())) {
			event.setCancelled(true);
		}
	}
	
	@EventHandler
	public void onTab(PlayerChatTabCompleteEvent event) {
		if (cancelledEvents.get(event.getEventName()).contains(event.getPlayer().getWorld())) {
			event.getTabCompletions().clear();
		}
	}
	
	@EventHandler
	public void onPortal(PlayerPortalEvent event) {
		if (cancelledEvents.get(event.getEventName()).contains(event.getPlayer().getWorld())) {
			event.setCancelled(true);
		}
	}
	
	@EventHandler
	public void onTabComplete(TabCompleteEvent event) {
		if (cancelledEvents.get(event.getEventName()).contains(event.getLocation().getWorld())) {
			event.setCancelled(true);
		}
	}
	
	@EventHandler
	public void onWeather(WeatherChangeEvent event) {
		if (cancelledEvents.get(event.getEventName()).contains(event.getWorld())) {
			event.setCancelled(true);
		}
	}
	
	@EventHandler
	public void onStructure(StructureGrowEvent event) {
		if (cancelledEvents.get(event.getEventName()).contains(event.getWorld())) {
			event.setCancelled(true);
		}
	}
	
	@EventHandler
	public void onDropItem(PlayerDropItemEvent event) {
		if (cancelledEvents.get(event.getEventName()).contains(event.getPlayer().getWorld())) {
			event.setCancelled(true);
		}
	}
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onChatting(org.bukkit.event.player.PlayerChatEvent event) {
		if (cancelledEvents.get(event.getEventName()).contains(event.getPlayer().getWorld())) {
			event.setCancelled(true);
		}
	}
}
