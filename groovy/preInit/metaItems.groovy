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
        def lex = new Material.Builder(32001, resource('pj', 'lex'))
                .ingot()
                .color(0x3261a8)
                .blastTemp(3750, 'LOW', 1024, 400)
                .fluid()
                .iconSet("shiny")
                .flags('generate_plate', 'generate_rod', 'generate_gear')
                .build();
        lex.setFormula("C3H5OS2Li", true);
        def rex = new Material.Builder(32002, resource('pj', 'rex'))
                .ingot()
                .color(0xa83279)
                .blastTemp(2000, 'LOW', 1024, 400)
                .fluid()
                .iconSet("shiny")
                .flags('generate_plate', 'generate_rod', 'generate_gear')
                .build();
        rex.setFormula("C3H5OS2Rh", true);
        def carbondisulfide = new Material.Builder(32003, resource('pj', 'carbondisulfide'))
                .dust()
                .color(0xa89932)
                .build();
        carbondisulfide.setFormula("CS2", true);
        def isopropyl = new Material.Builder(32004, resource('pj', 'isopropyl'))
                .fluid()
                .build();
        isopropyl.setFormula("C3H8O", true);
        def potassiumhydroxide = new Material.Builder(32004, resource('pj', 'potassiumhydroxide'))
                .dust()
                .color(0xa89932)
                .build();
        carbondisulfide.setFormula("KOH", true);
       
}
