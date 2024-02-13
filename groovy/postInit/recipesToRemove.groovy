def recipesToRemove = [
    'immersiveengineering:metal_decoration/redstone_engineering',
    'immersiveengineering:metal_decoration/light_engineering',
    'immersiveengineering:metal_decoration/heavy_engineering',
    'immersiveengineering:metal_decoration/generator',
    'immersiveengineering:metal_decoration/radiator',
    'immersiveengineering:metal_devices/furnace_heater',
    'immersiveengineering:metal_devices/dynamo',
    'immersiveengineering:toolupgrades/drill_waterproof',
    'immersiveengineering:material/component_iron',
    'immersiveengineering:material/component_steel',
    'immersivepetroleum:tool/projector'
]

for(name in recipesToRemove) {
    crafting.remove(name)
}
