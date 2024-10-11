mods.immersiveengineering.coke_oven.add(item('gregtech:coke'), item('minecraft:coal'), 200, 30)
mods.immersiveengineering.coke_oven.add(item('gregtech:coke'), item('minecraft:charcoal'), 200, 20)
mods.immersiveengineering.coke_oven.add(item('minecraft:charcoal'), item('minecraft:log'), 100, 10)
mods.immersiveengineering.coke_oven.add(item('gregtech:coke', 9), item('minecraft:coal_block'), 1600, 270)

mods.immersiveengineering.coke_oven.removeByInput(item('minecraft:log'))
mods.immersiveengineering.coke_oven.removeByOutput(item('immersiveengineering:coke'))
