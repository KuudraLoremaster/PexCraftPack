import gregtech.api.GTValues;
import gregtech.api.GregTechAPI;
import gregtech.api.items.metaitem.*;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.ore.OrePrefix;
import net.minecraft.util.text.TextFormatting;
import gregtech.common.items.behaviors.TooltipBehavior;

eventManager.listen {
    GregTechAPI.PostMaterialEvent event ->

        log.infoMC("Adding metaitems...")

        StandardMetaItem customMetaItems = new StandardMetaItem((short)2);
        customMetaItems.setRegistryName("meta_item_2")

        customMetaItems.addItem(1, "pex_ingot")
        log.infoMC("Finished adding metaitems")
}