/*
recipemap('large_chemical_reactor').recipeBuilder()
         .fluidInputs(liquid('hydrogen')*720,liquid('lithium')*144,liquid('oxygen')*144) //replace this with a real chain
         .inputs(item('gregtech:meta_dust', 18),item('gregtech:meta_dust', 103) * 2)
         .notConsumable([metaitem('circuit.integrated').withNbt(["Configuration": 1])])
         .outputs(item('pexologicaljourney:lex_ingot') * 15)
         .duration(500)
         .EUt(524288)
         .buildAndRegister()

 recipemap('large_chemical_reactor').recipeBuilder()
         .fluidInputs(liquid('hydrogen')*720,liquid('potassium')*144,liquid('oxygen')*144) //replace this with a real chain
         .inputs(item('gregtech:meta_dust', 18),item('gregtech:meta_dust', 103) * 2, )
         .notConsumable([metaitem('circuit.integrated').withNbt(["Configuration": 1])])
         .outputs(item('pexologicaljourney:pex_ingot') * 15)
         .duration(500)
         .EUt(524288)
         .buildAndRegister()

 recipemap('large_chemical_reactor').recipeBuilder()
         .fluidInputs(liquid('hydrogen')*720,liquid('rhodium')*144,liquid('oxygen')*144) //replace this with a real chain
         .inputs(item('gregtech:meta_dust', 18),item('gregtech:meta_dust', 103) * 2)
         .notConsumable([metaitem('circuit.integrated').withNbt(["Configuration": 1])])
         .outputs(item('pexologicaljourney:rex_ingot') * 15)
         .duration(500)
         .EUt(524288)
         .buildAndRegister()
 */
 recipemap('large_chemical_reactor').recipeBuilder()
         .fluidInputs(liquid('ethanol')*720) //replace this with a real chain
         .inputs(item('gregtech:carbondislufide', 18)* 2) //replace this shit
         .notConsumable([metaitem('circuit.integrated').withNbt(["Configuration": 1])])
         .outputs(item('pexologicaljourney:Sulfurized_Ethanol ') * 15)
         .duration(500)
         .EUt(524288)
         .buildAndRegister()

