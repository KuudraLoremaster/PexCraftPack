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

mods.immersiveengineering.excavator.recipeBuilder()
    .name('cobaltite_deposit')                
    .weight(15000000)                         // Cobalt deposits are rare lol
    .fail(0.12)                               // impure as shit often
    .ore('oreCobalt', 75)                     // Cobalt (duh)
    .ore('oreNickel', 15)                     // nickel
    .ore('oreIron', 10)                       // Iron is also common in cobalt bearing deposits idk why its not in other packs
    .dimension(0, -1)                         // Found in both Overworld and Nether
    .register()

mods.immersiveengineering.excavator.recipeBuilder()
    .name('cassiterite_deposit')              
    .weight(20000000)                         
    .fail(0.10)                               // tin is weirdly complex to get irl so higher impurity
    .ore('oreCassiterite', 40)                // tin
    .ore('oreTin', 40)                        //tin
    .ore('oreCopper', 15)                     // another case of idk why regular gregtech gets it wrong
    .ore('oreIron', 5)                        // iron
    .dimension(0)                             // Overworld only
    .register()

mods.immersiveengineering.excavator.recipeBuilder()
    .name('tantalite_deposit')                
    .weight(8000000)                          // rare as shit
    .fail(0.20)                               // impure probably idk its like that for rare stuff
    .ore('oreTantalite', 60)                  // Tantalum 
    .ore('oreNiobium', 30)                    // Niobium 
    .ore('oreIron', 10)                       // Iron 
    .dimension(0)                             // Overworld only
    .register()

mods.immersiveengineering.excavator.recipeBuilder()
    .name('uraninite_deposit')                
    .weight(10000000)                         
    .fail(0.18)                               // impure as shit due to minor impurities carrying heavy consequences
    .ore('oreUraninite', 50)                  // Uranium 
    .ore('oreUraninium',20)                   // Uranium
    .ore('oreLead', 20)                       // Lead often found with uranium
    .ore('oreThorium', 10)                    // Trace amounts of Thorium
    .dimension(0, -1)                         // Found in Overworld and Nether
    .register()

rest is 
// 5. Monazite deposit (Rare Earth Elements) 
/*
mods.immersiveengineering.excavator.recipeBuilder()
    .name('monazite_deposit')                 // Rare earth elements ore deposit
    .weight(12000000)                         // Moderate-sized deposit
    .fail(0.15)                               // Moderate failure rate due to extraction complexity
    .ore('oreNeodymium', 50)                  // Neodymium, a critical rare earth element
    .ore('oreLanthanum', 25)                  // Lanthanum, another key REE
    .ore('oreCerium', 15)                     // Cerium, found in monazite
    .ore('oreThorium', 10)                    // Thorium, often found in rare earth ores
    .dimension(0, -1)                         // Found in Overworld and Nether
    .register()

// 6. Platinum Group Metals (PGMs) deposit
mods.immersiveengineering.excavator.recipeBuilder()
    .name('pgm_deposit')                      // Platinum Group Metals (PGMs) deposit
    .weight(9000000)                          // Very rare and small deposit
    .fail(0.25)                               // High failure rate due to the rarity and value
    .ore('orePlatinum', 40)                   // Platinum ore
    .ore('orePalladium', 30)                  // Palladium ore
    .ore('oreIridium', 20)                    // Iridium ore
    .ore('oreGold', 10)                       // Gold is often found with PGMs
    .dimension(0, -1)                         // Found in Overworld and Nether
    .register()
*/
