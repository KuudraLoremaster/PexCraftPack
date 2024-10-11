mods.immersiveengineering.blast_furnace.add(item('minecraft:iron_ingot'), oredict('oreIron'), 20, item('gregtech:ash'))
mods.immersiveengineering.blast_furnace.add(item('minecraft:iron_ingot'), oredict('oreMagnetite'), 20, item('gregtech:ash'))
mods.immersiveengineering.blast_furnace.add(item('gregtech:steel_ingot'), item('minecraft:iron_ingot'), 60, item('gregtech:ash'))
mods.immersiveengineering.blast_furnace.add(item('gregtech:copper_ingot'), oredict('oreCopper'), 20, item('gregtech:ash'))
mods.immersiveengineering.blast_furnace.add(item('gregtech:copper_ingot'), oredict('oreTetrahedrite'), 20, item('gregtech:ash'))
mods.immersiveengineering.blast_furnace.add(item('gregtech:aluminum_nugget'), oredict('oreBauxite'), 10000, item('gregtech:ash'))
mods.immersiveengineering.blast_furnace.add(item('gregtech:aluminum_nugget'), oredict('oreAluminium'), 20000, item('gregtech:ash'))
mods.immersiveengineering.blast_furnace.add(item('gregtech:lead_ingot'), oredict('oreLead'), 20, item('gregtech:ash'))

mods.immersiveengineering.blast_furnace.removeByInput(oredict('oreIron'))
mods.immersiveengineering.blast_furnace.removeByInput(oredict('minecraft:iron'))
mods.immersiveengineering.blast_furnace.removeByInput(oredict('minecraft:iron_block'))
mods.immersiveengineering.blast_furnace.removeByOutput(item('immersiveengineering:slag'))



