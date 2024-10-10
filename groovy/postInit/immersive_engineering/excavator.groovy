mods.immersiveengineering.excavator.recipeBuilder()
    .name('potassium_deposit')              
    .weight(99999999)                       
    .fail(0.001)                            
    .ore('oreSylvite', 60)                  // Sylvite ore (represents potassium)
    .ore('oreSulfur', 40)                   // Sulfur ore, essential for xanthate
    .dimension(0, -1)                       // Overworld and Nether dimensions
    .register()


mods.immersiveengineering.excavator.recipeBuilder()
    .name('xanthate_ore_deposit')
    .weight(99999999)
    .fail(0.001)                           
    .ore('oreCoal', 25)                     // Coal for carbon (ethyl group)
    .ore('oreQuartz', 15)                   // Nether quartz for the oxygen component
    .ore('oreSulfur', 40)                   // High percentage sulfur ore
    .dimension(0, -1)                       // Overworld and Nether
    .register()

