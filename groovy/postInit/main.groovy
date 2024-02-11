crafting.addShaped('balanced_diamond', item('minecraft:diamond') * 64, [
        [ore('gemLapis'), item('minecraft:iron_ingot'), item('minecraft:redstone')],
        [item("minecraft:gold_ingot"), item('minecraft:carrot'), item("minecraft:coal")], 
        [item('minecraft:nether_star'), item("minecraft:dirt"), item('minecraft:nether_star')]


])
crafting.addShaped('balanced_pex', item('pexologicaljourney:pex_ingot') * 64, [
        [ore('gemLapis'), item('minecraft:iron_ingot'), item('minecraft:redstone')],
        [item("minecraft:gold_ingot"), item('minecraft:carrot'), item("minecraft:coal")], 
        [item('minecraft:nether_star'), item("minecraft:dirt"), item('minecraft:diamond')]


])
crafting.addShaped('balanced_iron', item('minecraft:piston') * 2, [
        [ore('plankWood'), ore('plankWood'), ore('plankWood')],
        [item("minecraft:cobblestone"), item('pexologicaljourney:pex_ingot'), item("minecraft:cobblestone")], 
        [item('minecraft:cobblestone'), item("minecraft:redstone"), item('minecraft:cobblestone')]


])