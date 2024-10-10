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

mods.immersiveengineering.excavator.recipeBuilder()
    .name('bauxite_deposit')                
    .weight(50000000)                         
    .fail(0.05)                               // simulate impurity or something
    .ore('oreBauxite', 70)                    // Bauxite ore for aluminum
    .ore('oreIron', 10)                       // Iron ore often found with bauxite deposits
    .ore('oreRutile', 5)                      // trace amounts of titanium 
    .ore('oreSilica', 15)                     // silicon
    .dimension(0)                             // Overworld deposit
    .register()

mods.immersiveengineering.excavator.recipeBuilder()
    .name('chalcopyrite_deposit')             
    .weight(70000000)                         
    .fail(0.07)                               // impurities and gangue minerals
    .ore('oreCopper', 65)                     // Chalcopyrite as copper ore
    .ore('oreGold', 5)                        // Small amounts of gold
    .ore('oreSulfur', 20)                     // Sulfur
    .ore('oreIron', 10)                       // Pyrite (iron sulfide)
    .dimension(0, -1)                         // Overworld and Nether
    .register()

mods.immersiveengineering.excavator.recipeBuilder()
    .name('galena_deposit')                   
    .weight(30000000)                         
    .fail(0.1)                                // impure as shit
    .ore('oreGalena', 75)                     // Lead
    .ore('oreSilver', 20)                     // Silver
    .ore('oreZinc', 5)                        // Zinc and gallium
    .dimension(0)                             // Overworld only
    .register()

mods.immersiveengineering.excavator.recipeBuilder()
    .name('magnetite_deposit')             
    .weight(100000000)                        
    .fail(0.02)                               // not really impure irl
    .ore('oreIron', 85)                       // iron
    .ore('oreTitanium', 5)                    // trace amounts of titanium cuz ilmenite
    .ore('oreNickel', 10)                     // some nickel too gt5u ce and ceu got it wrong for some reason
    .dimension(0)                             // Overworld
    .register()

mods.immersiveengineering.excavator.recipeBuilder()
    .name('sphalerite_deposit')               
    .weight(45000000)                         
    .fail(0.08)                               // sorta impure
    .ore('oreSphalerite', 65)                 // zinc and gallium
    .ore('oreLead', 20)                       // Lead
    .ore('oreSilver', 10)                     // Silver
    .ore('oreCopper', 5)                      // trace amounts of copper
    .dimension(0)                             // Overworld
    .register()

mods.immersiveengineering.excavator.recipeBuilder()
    .name('nickel_laterite_deposit')          
    .weight(60000000)                         // Large nickel deposit
    .fail(0.06)                               // often impure
    .ore('oreNickel', 70)                     // Nickel 
    .ore('oreCobalt', 20)                     // Cobalt 
    .ore('oreIron', 10)                       // Iron content in laterites
    .dimension(0, -1)                         // Found in both Overworld and Nether
    .register()
