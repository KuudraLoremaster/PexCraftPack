def recipesToRemove = [
    'immersiveengineering:metal_decoration/redstone_engineering',
    'immersiveengineering:metal_decoration/light_engineering',
    'immersiveengineering:metal_decoration/heavy_engineering',
    'immersiveengineering:metal_decoration/radiator',
    'immersiveengineering:metal_decoration/furnace_heater',
    'immersiveengineering:toolupgrades/drill_waterproof',
    'immersiveengineering:material/component_iron',
    'immersiveengineering:material/component_steel'
]

for(name in recipesToRemove) {
    crafting.remove(name)
}