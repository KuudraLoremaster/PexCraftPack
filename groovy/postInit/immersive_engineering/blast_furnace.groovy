// Add recipes
mods.immersiveengineering.blast_furnace.recipeBuilder()
    .input(ore('oreMagnetite'))
    .output(item('minecraft:iron_ingot'))
    .time(20)
    .slag(item('gregtech:meta_dust', 254))
    .register()

mods.immersiveengineering.blast_furnace.recipeBuilder()
    .input(item('minecraft:iron_ingot'))
    .output(item('gregtech:steel_ingot'))
    .time(60)
    .slag(item('gregtech:meta_dust', 254))
    .register()

mods.immersiveengineering.blast_furnace.recipeBuilder()
    .input(ore('oreCopper'))
    .output(item('gregtech:copper_ingot'))
    .time(20)
    .slag(item('gregtech:meta_dust', 254))
    .register()

mods.immersiveengineering.blast_furnace.recipeBuilder()
    .input(ore('oreTetrahedrite'))
    .output(item('gregtech:copper_ingot'))
    .time(20)
    .slag(item('gregtech:meta_dust', 254))
    .register()

mods.immersiveengineering.blast_furnace.recipeBuilder()
    .input(ore('oreBauxite'))
    .output(item('gregtech:aluminum_nugget'))
    .time(10000)
    .slag(item('gregtech:meta_dust', 254))
    .register()

mods.immersiveengineering.blast_furnace.recipeBuilder()
    .input(ore('oreAluminium'))
    .output(item('gregtech:aluminum_nugget'))
    .time(20000)
    .slag(item('gregtech:meta_dust', 254))
    .register()

mods.immersiveengineering.blast_furnace.recipeBuilder()
    .input(ore('oreLead'))
    .output(item('gregtech:lead_ingot'))
    .time(20)
    .slag(item('gregtech:meta_dust', 254))
    .register()

// Remove recipes by input or output
mods.immersiveengineering.blast_furnace.removeByInput(ore('minecraft:iron'))
mods.immersiveengineering.blast_furnace.removeByInput(ore('minecraft:iron_block'))
mods.immersiveengineering.blast_furnace.removeByOutput(item('immersiveengineering:slag'))
