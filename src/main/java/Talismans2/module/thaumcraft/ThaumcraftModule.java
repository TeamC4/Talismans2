package Talismans2.module.thaumcraft;

public class ThaumcraftModule {
	
	public static void init(){
		//Load Thaumonomicon Tab
		ThaumonomiconResearch.addResearchTab();
		//Load Thaumcraft Research
		ThaumonomiconResearch.addResearch();
				
	}

}
