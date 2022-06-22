package me.jasperchasetoq.mobsimulationplus;

import io.github.mooy1.infinityexpansion.items.mobdata.MobData;
import io.github.mooy1.infinityexpansion.items.mobdata.MobDataCard;
import io.github.mooy1.infinityexpansion.items.mobdata.MobDataTier;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public class MobSimulationPlusItemsSetup {

        private MobSimulationPlusItemsSetup() {
        }

        public static void setup(@Nonnull MobSimulationPlus plugin)
        {
            new MobDataCard("Phantom", MobDataTier.ADVANCED, new ItemStack[]{
                    new ItemStack(Material.PHANTOM_MEMBRANE, 32), new ItemStack(Material.PHANTOM_MEMBRANE, 32), new ItemStack(Material.PHANTOM_MEMBRANE, 32),
                    new ItemStack(Material.PHANTOM_MEMBRANE, 32), MobData.EMPTY_DATA_CARD, new ItemStack(Material.PHANTOM_MEMBRANE, 32),
                    new ItemStack(Material.PHANTOM_MEMBRANE, 32), new ItemStack(Material.PHANTOM_MEMBRANE, 32), new ItemStack(Material.PHANTOM_MEMBRANE, 32),
            })
                    .addDrop(Material.PHANTOM_MEMBRANE, 1)
                    .addDrop(Material.ELYTRA, 2500)
                    .register(plugin);
            new MobDataCard("Chicken+", MobDataTier.ADVANCED, new ItemStack[]{
                    new ItemStack(Material.EGG, 16), new ItemStack(Material.EGG, 16), new ItemStack(Material.EGG, 16),
                    new ItemStack(Material.EGG, 16), MobData.CHICKEN, new ItemStack(Material.EGG, 16),
                    new ItemStack(Material.EGG, 16), new ItemStack(Material.EGG, 16), new ItemStack(Material.EGG, 16)
            })
                    .addDrop(Material.CHICKEN, 1)
                    .addDrop(Material.FEATHER, 1)
                    .addDrop(Material.EGG, 1)
                    .register(plugin);
            new MobDataCard("Rainbow Sheep", MobDataTier.ADVANCED, new ItemStack[]{
                    new SlimefunItemStack(SlimefunItems.RAINBOW_WOOL, 16), new SlimefunItemStack(SlimefunItems.RAINBOW_WOOL, 16), new SlimefunItemStack(SlimefunItems.RAINBOW_WOOL, 16),
                    new SlimefunItemStack(SlimefunItems.RAINBOW_WOOL, 16), MobData.SHEEP, new SlimefunItemStack(SlimefunItems.RAINBOW_WOOL, 16),
                    new SlimefunItemStack(SlimefunItems.RAINBOW_WOOL, 16), new SlimefunItemStack(SlimefunItems.RAINBOW_WOOL, 16), new SlimefunItemStack(SlimefunItems.RAINBOW_WOOL, 16)
            })
                    .addDrop(Material.WHITE_WOOL, 1)
                    .addDrop(Material.ORANGE_WOOL, 1)
                    .addDrop(Material.MAGENTA_WOOL, 1)
                    .addDrop(Material.LIGHT_BLUE_WOOL, 1)
                    .addDrop(Material.YELLOW_WOOL, 1)
                    .addDrop(Material.LIME_WOOL, 1)
                    .addDrop(Material.PINK_WOOL, 1)
                    .addDrop(Material.GRAY_WOOL, 1)
                    .addDrop(Material.LIGHT_GRAY_WOOL, 1)
                    .addDrop(Material.CYAN_WOOL, 1)
                    .addDrop(Material.PURPLE_WOOL, 1)
                    .addDrop(Material.BLUE_WOOL, 1)
                    .addDrop(Material.BROWN_WOOL, 1)
                    .addDrop(Material.GREEN_WOOL, 1)
                    .addDrop(Material.RED_WOOL, 1)
                    .addDrop(Material.BLACK_WOOL, 1)
                    .register(plugin);
            new MobDataCard("Pig", MobDataTier.PASSIVE, new ItemStack[]{
                    new ItemStack(Material.PORKCHOP, 32), new ItemStack(Material.CARROT_ON_A_STICK, 1), new ItemStack(Material.COOKED_PORKCHOP, 32),
                    new ItemStack(Material.SADDLE, 1), MobData.EMPTY_DATA_CARD, new ItemStack(Material.SADDLE, 1),
                    new ItemStack(Material.COOKED_PORKCHOP, 32), new ItemStack(Material.CARROT_ON_A_STICK, 1), new ItemStack(Material.PORKCHOP, 32),
            })
                    .addDrop(Material.PORKCHOP, 1)
                    .addDrop(Material.COOKED_PORKCHOP, 1)
                    .addDrop(Material.CARROT, 50)
                    .addDrop(Material.SADDLE, 750)
                    .register(plugin);
            new MobDataCard("Zombified Piglin", MobDataTier.NEUTRAL, new ItemStack[]{
                    new ItemStack(Material.ROTTEN_FLESH, 64), new ItemStack(Material.CARROT, 64), new ItemStack(Material.GOLD_INGOT, 64),
                    new ItemStack(Material.GOLDEN_SWORD, 1), MobData.EMPTY_DATA_CARD, new ItemStack(Material.GOLDEN_SWORD, 1),
                    new ItemStack(Material.GOLD_INGOT, 64), new ItemStack(Material.CARROT, 64), new ItemStack(Material.ROTTEN_FLESH, 64),
            })
                    .addDrop(Material.GOLD_NUGGET, 1)
                    .addDrop(SlimefunItems.STRANGE_NETHER_GOO, 1000)

                    .register(plugin);
            new MobDataCard("Piglin", MobDataTier.ADVANCED, new ItemStack[]{
                    new ItemStack(Material.GOLD_BLOCK, 64), new ItemStack(Material.GOLDEN_CARROT, 64), new ItemStack(Material.GOLD_BLOCK, 64),
                    new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 1), MobData.EMPTY_DATA_CARD, new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 1),
                    new ItemStack(Material.GOLD_BLOCK, 64), new ItemStack(Material.GOLDEN_CARROT, 64), new ItemStack(Material.GOLD_BLOCK, 64),
            })
                    .addDrop(Material.GOLD_INGOT, 1)
                    .addDrop(Material.GOLDEN_SWORD, 25)
                    .addDrop(Material.CROSSBOW, 50)
                    .addDrop(SlimefunItems.STRANGE_NETHER_GOO, 10)

                    .register(plugin);
            new MobDataCard("Pillager", MobDataTier.HOSTILE, new ItemStack[]{
                    new ItemStack(Material.EMERALD, 64), new ItemStack(Material.BLACK_BANNER, 16), new ItemStack(Material.EMERALD, 64),
                    new ItemStack(Material.CROSSBOW, 1), MobData.EMPTY_DATA_CARD, new ItemStack(Material.CROSSBOW, 1),
                    new ItemStack(Material.EMERALD, 64), new ItemStack(Material.BLACK_BANNER, 16), new ItemStack(Material.EMERALD, 64),
            })
                    .addDrop(Material.EMERALD, 1)
                    .addDrop(Material.CROSSBOW, 10)

                    .register(plugin);
            new MobDataCard("Vindicator", MobDataTier.HOSTILE, new ItemStack[]{
                    new ItemStack(Material.EMERALD, 64), new ItemStack(Material.BLACK_BANNER, 16), new ItemStack(Material.EMERALD, 64),
                    new ItemStack(Material.IRON_AXE, 1), MobData.EMPTY_DATA_CARD, new ItemStack(Material.IRON_AXE, 1),
                    new ItemStack(Material.EMERALD, 64), new ItemStack(Material.BLACK_BANNER, 16), new ItemStack(Material.EMERALD, 64),
            })
                    .addDrop(Material.EMERALD, 1)
                    .addDrop(Material.IRON_AXE, 10)

                    .register(plugin);
            new MobDataCard("Evoker", MobDataTier.HOSTILE, new ItemStack[]{
                    new ItemStack(Material.EMERALD, 64), new ItemStack(Material.BLACK_BANNER, 16), new ItemStack(Material.EMERALD, 64),
                    new ItemStack(Material.TOTEM_OF_UNDYING, 1), MobData.EMPTY_DATA_CARD, new ItemStack(Material.TOTEM_OF_UNDYING, 1),
                    new ItemStack(Material.EMERALD, 64), new ItemStack(Material.BLACK_BANNER, 16), new ItemStack(Material.EMERALD, 64),
            })
                    .addDrop(Material.EMERALD, 1)
                    .addDrop(Material.TOTEM_OF_UNDYING, 100)

                    .register(plugin);
            new MobDataCard("Witch+", MobDataTier.ADVANCED, new ItemStack[]{
                    new ItemStack(Material.STICK, 64), new ItemStack(Material.GLASS_BOTTLE, 64), new ItemStack(Material.GLOWSTONE, 64),
                    new ItemStack(Material.GUNPOWDER, 64), MobData.WITCH, new ItemStack(Material.REDSTONE_BLOCK, 64),
                    new ItemStack(Material.SPIDER_EYE, 64), new ItemStack(Material.SUGAR, 64), new ItemStack(Material.CAULDRON, 64),
            })
                    .addDrop(Material.STICK, 1)
                    .addDrop(Material.GLASS_BOTTLE, 1)
                    .addDrop(Material.GLOWSTONE_DUST, 1)
                    .addDrop(Material.GUNPOWDER, 1)
                    .addDrop(Material.REDSTONE, 1)
                    .addDrop(Material.SPIDER_EYE, 1)
                    .addDrop(Material.SUGAR, 1)
                    .addDrop(Material.CAULDRON, 10)



                    .register(plugin);
        }
    }
