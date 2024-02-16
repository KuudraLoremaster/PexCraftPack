import gregtech.api.unification.material.event.MaterialEvent
import gregtech.api.unification.material.Material
import net.minecraft.util.ResourceLocation
import static gregtech.api.unification.material.info.MaterialFlags.*

event_manager.listen { MaterialEvent event ->
        def pex = new Material.Builder(32000, resource('pj', 'pex'))
                .ingot()
                .blastTemp(2000, 'LOW', 1024, 400)
                .fluid()
                .iconSet("shiny")
                .flags('generate_plate', 'generate_rod', 'generate_gear')
                .build();
        pex.setFormula("C3H8OCS2K", true);
}
