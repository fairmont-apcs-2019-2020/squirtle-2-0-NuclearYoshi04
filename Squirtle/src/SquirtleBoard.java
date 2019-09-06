public class SquirtleBoard extends Board {

	
	public SquirtleBoard() 
	{
		// Call the Board constructor to make an 8x4 Board
	 	super(7, 3);
	 	newGame(false);
	 	setTitle("PokemonCode Assignment 1");
	 	setInitialText("What will Squirtle do with Bulbasaur's flowers?");
	 	setInitialText("HELLO WORLD!");
	}
	

	
	@Override
	public void newGame(boolean repaint)
	{
		super.newGame(repaint);
		
		// Create a SquirtleThing at 0, 5
	 	SquirtleThing squirtle = new SquirtleThing();
	 	squirtle.setLocation(5, 0);
	 	add(squirtle);
	 	
	 // Create a SquirtleThing at 0, 5
	 	 	SquirtleThing squirtle4 = new SquirtleThing();
	 	 	squirtle4.setLocation(1, 2);
	 	 	add(squirtle4);
	 	 	
	 	 	SquirtleThing squirtle5 = new SquirtleThing();
	 	 	squirtle5.setLocation(5, 2);
	 	 	add(squirtle5);
	 	
	 	// Create a BulbasaurThing at 0, 4
	 	BulbasaurThing bulbasaur = new BulbasaurThing();
	 	bulbasaur.setLocation(4, 0);
	 	add(bulbasaur);
	 	
	 // Create a BulbasaurThing at 0, 0
	 	 	BulbasaurThing bulbasaur2 = new BulbasaurThing();
	 	 	bulbasaur2.setLocation(0, 0);
	 	 	add(bulbasaur2);
	 	 	
	 	// Create a BulbasaurThing at 0, 1
		 	SquirtleThing squirtle2 = new SquirtleThing();
		 	squirtle2.setLocation(1, 0);
		 	add(squirtle2);
	 	
		 // Create a BulbasaurThing at 0, 2
		 	BulbasaurThing bulbasaur4 = new BulbasaurThing();
		 	bulbasaur4.setLocation(2, 0);
		 	add(bulbasaur4);
		 	
		 // Create a BulbasaurThing at 0, 3
		 	BulbasaurThing bulbasaur5 = new BulbasaurThing();
		 	bulbasaur5.setLocation(3, 0);
		 	add(bulbasaur5);
		 	
		 // Create a BulbasaurThing at 0, 6
		 	BulbasaurThing bulbasaur6 = new BulbasaurThing();
		 	bulbasaur6.setLocation(6, 0);
		 	add(bulbasaur6);
		 // Create a BulbasaurThing at 1, 5
		 	SquirtleThing bulbasaur7 = new SquirtleThing();
		 	bulbasaur7.setLocation(5, 1);
		 	add(bulbasaur7);
		 // Create a BulbasaurThing at 1, 1
		 	SquirtleThing bulbasaur8 = new SquirtleThing();
		 	bulbasaur8.setLocation(1, 1);
		 	add(bulbasaur8);
		 	
		 // Create a BulbasaurThing at 1, 3
		 	BulbasaurThing bulbasaur9 = new BulbasaurThing();
		 	bulbasaur9.setLocation(3, 1);
		 	add(bulbasaur9);
	}
} 
