import gregtech.api.GTValues;
import gregtech.api.GregTechAPI;
import gregtech.api.items.metaitem.*;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.ore.OrePrefix;
import net.minecraft.util.text.TextFormatting;
import gregtech.api.unification.material.event.PostMaterialEvent;
import gregtech.common.items.behaviors.TooltipBehavior;

eventManager.listen {
    PostMaterialEvent event ->

        log.infoMC("Adding metaitems...")

        StandardMetaItem customMetaItems = new StandardMetaItem((short)2);
        customMetaItems.setRegistryName("meta_item_2")

        customMetaItems.addItem(32001, "pex_ingot").ingot().fluid()
        log.infoMC("Finished adding metaitems")
}