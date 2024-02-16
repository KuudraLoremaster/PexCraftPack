import gregtech.api.unification.material.event.MaterialEvent
import gregtech.api.unification.material.Material
import net.minecraft.util.ResourceLocation
import static gregtech.api.unification.material.info.MaterialFlags.*

event_manager.listen { MaterialEvent event ->
        def pex = new Material.Builder(32000, resource('pexologicaljourney', 'pex'))
                .ingot()
                .fluid()
                .color(0xad9fd6)
                .iconSet("shiny")
                .flags('generate_plate', 'generate_gear', 'generate_rod')
                .build();
                pex.setFormula("PEX10", true);
}
