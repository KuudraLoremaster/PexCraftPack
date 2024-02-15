// Ingots
content.createItem('pex_ingot').register()
content.createItem('lex_ingot').register()
content.createItem('rex_ingot').register()
// Creative Tab
content.createCreativeTab("pexologicaljourney.creative_tab", item("pexologicaljourney:pex_ingot"))
content.createCreativeTab("pexologicaljourney.creative_tab", item("pexologicaljourney:lex_ingot"))
content.createCreativeTab("pexologicaljourney.creative_tab", item("pexologicaljourney:rex_ingot"))
content.createCreativeTab("pexologicaljourney.creative_tab", item("pexologicaljourney:isopropyl_alcohol"))
// Fluids
content.createFluid('molten_pex').noBlock().setMetalTexture().register()
content.createFluid('molten_lex').noBlock().setMetalTexture().register()
content.createFluid('molten_rex').noBlock().setMetalTexture().register()
content.createFluid('isopropyl_alcohol').noBlock().setMetalTexture().register()
