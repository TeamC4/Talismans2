package Talismans2.module.thaumcraft;

import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.research.ResearchCategories;
import thaumcraft.api.research.ResearchItem;
import thaumcraft.api.research.ResearchPage;
import net.minecraft.util.ResourceLocation;

/**
 * @author Gigabit101
 */

public class ThaumonomiconResearch {

	  public static void addResearchTab() {
	        ResourceLocation background = new ResourceLocation("thaumcraft", "textures/gui/gui_researchback.png");
	        ResearchCategories.registerCategory("Talismans", new ResourceLocation("talismans2:textures/items/Blank.png"), background);
	    }
	   public static void addResearch() {
	        ResearchItem research;
	        String text;

	        //Blank Talisman
	        text = "1";
	        research = new ResearchItem("Blank Talisman", "Talismans", new AspectList(), 0, 0, 0, new ResourceLocation("talismans2:textures/items/Blank.png")).setRound().setAutoUnlock().registerResearchItem();
	        research.setPages(new ResearchPage(text), new ResearchPage(ThaumcraftRecipes.BlankTalisman));
	        
	        //Flame Talisman
	        text = "1";
	        research = new ResearchItem("Flame Talisman", "Talismans", new AspectList(), 1, 2, 3, new ResourceLocation("talismans2:textures/items/Dragon.png")).setSecondary().setAutoUnlock().setParents("Blank Talisman").registerResearchItem();
	        research.setPages(new ResearchPage(text), new ResearchPage(ThaumcraftRecipes.FlameTalisman));
	        
	        //Water Talisman
	        text = "1";
	        research = new ResearchItem("Water Talisman", "Talismans", new AspectList(), 2, 2, 2, new ResourceLocation("talismans2:textures/items/Water.png")).setSecondary().setAutoUnlock().setParents("Blank Talisman").registerResearchItem();
	        research.setPages(new ResearchPage(text));
	        
	        //Light Talisman
	        text = "1";
	        research = new ResearchItem("Light Talisman", "Talismans", new AspectList(), 3, 3, 3, new ResourceLocation("talismans2:textures/items/Light.png")).setSecondary().setAutoUnlock().setParents("Blank Talisman").registerResearchItem();
	        research.setPages(new ResearchPage(text));
  }
}