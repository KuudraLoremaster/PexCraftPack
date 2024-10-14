// Add Coke Oven recipes using recipeBuilder()
mods.immersiveengineering.coke_oven.recipeBuilder()
    .input(item('minecraft:coal'))
    .output(item('gregtech:coke'))
    .time(200)
    .creosote(30)
    .register()

mods.immersiveengineering.coke_oven.recipeBuilder()
    .input(item('minecraft:charcoal'))
    .output(item('gregtech:coke'))
    .time(200)
    .creosote(20)
    .register()

mods.immersiveengineering.coke_oven.recipeBuilder()
    .input(item('minecraft:log'))
    .output(item('minecraft:charcoal'))
    .time(100)
    .creosote(10)
    .register()

mods.immersiveengineering.coke_oven.recipeBuilder()
    .input(item('minecraft:coal_block'))
    .output(item('gregtech:coke', 9))
    .time(1600)
    .creosote(270)
    .register()

// Remove Coke Oven recipes by input or output
mods.immersiveengineering.coke_oven.removeByInput(item('minecraft:log'))
mods.immersiveengineering.coke_oven.removeByOutput(item('immersiveengineering:coke'))

// Add and remove Blast Furnace Fuel
mods.immersiveengineering.blast_furnace_fuel.add(item('gregtech:coke'), 1600)
mods.immersiveengineering.blast_furnace_fuel.removeByInput(item('minecraft:coal'))
