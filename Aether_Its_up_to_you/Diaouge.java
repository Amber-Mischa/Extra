import java.util.Scanner;

public class Dialouge {
	
	private static Scanner playerInput = new Scanner(System.in);
	public static double validCheck;
	
	public static void welcome()
	{
		System.out.println("Welcome to the world of Aether! \nYou play the character Aster; who doesn’t believe the story of a crown prince "
				+ "\nthat died in the ruins he is at. He decides to go exploring the ruins with \nhis friends: Haru, Ormr, and Cassia. "
				+ "\nWhat will you discover?");
		System.out.println("\nHaru: Aster? Aster? Aster! Come on, pick a direction already!");
		System.out.println("\"There are two hallways in front of you. You cannot see down either. \nHowever the one on the left has vines "
				+ "thriving on \nthe walls while the one on the right had dead vines.\"");
		System.out.println("Ormr: I don’t think going down either hallway is a good idea.");
		System.out.println("Cassia: Stop being such a coward Ormr! Let’s go down the left hallway.");
		System.out.println("Haru: Aster? It’s your choice, which do you think is safer.");
		System.out.println("(right or left)");
		
	}
	
	public static void checkChoiceOne() 
	{
		validCheck = chooseHallway();
		if(validCheck == 1)
		{
			validCheck = rightHallChoiceOne();
		}
		else if(validCheck ==2)
		{
			validCheck = leftHallwayChoice();
		}
		else
		{
			System.out.print("Not a valid answer please pick one of the options");
		}
		
	}
	
	public static void checkChoiceTwo() 
	{
		if(validCheck == 1.1)
		{
			validCheck = rightContinueChoice();
		}
		else if(validCheck ==1.2)
		{
			validCheck = rightLeaveChoice();
		}
		else if(validCheck ==2.1)
		{
			validCheck = leftHallwayChoice();
		}
		else if(validCheck == 2.2)
		{
			validCheck = leftHallwayChoice();
		}
		else
		{
			System.out.print("Not a valid answer please pick one of the options");
		}
		
	}
	

	
	public static double chooseHallway()
	{
		 String hallwayDirection = new String (playerInput.next());
		
		if (hallwayDirection.equalsIgnoreCase("left"))
		{
			System.out.println("\"You walk down the hallway and come to a dead end. Something feels off. "
					+ "\nThere is an ominous feeling in the air. It puts all of you on edge. \nOrmr suddenly stops and whips around to "
					+ "look behind you all.\"");
			System.out.println("Haru: Ormr? What’s going on?");
			System.out.println("\"Ormr continues to stare down the way you came. You see something quick strike towards Haru. "
					+ "\nYou push Haru to the ground and crouch in front of Haru as the vines close in around the group. \nOrmr "
					+ "pulls out his broad sword and swings at the vines to keep them at bay. \nIt's up to you to decide your group’s fate; "
					+ "fight or flight.\"");

			return 2;
		}
		else if (hallwayDirection.equalsIgnoreCase("right"))
		{
			System.out.println("Cassia: Are you sure we should go down this way? It looks scary."); 
			System.out.println("Ormr: Now who’s a coward. Let’s just go down the hallway, everything in the ruin should be safe.");
			System.out.println("Haru: Ormr right Cass, our teacher wouldn’t let us wander around if it was dangerous. We really "
					+ "should trust them more!");

		 return 1;
		}
		else
		{
			return -1;
		}
	}
	
	
	
	
	
	public static double leftHallwayChoice()
	{
		 String leftHallway = new String (playerInput.next());
		
		if (leftHallway.equalsIgnoreCase("fight"))
		{
			System.out.println("Haru: I’m with you Aster. \'Til the end.");
			System.out.println("Cassia: I love you guys.");
			System.out.println("Ormr: We’re not dying here Cass! Fight if you want to survive.");
			System.out.println("\"You pull out your dagger and lunge to help Ormr. Haru pulls out his bow and notches an arrow. "
					+ "\nThe group fights viciously. With Ormr and Cassia guarding each other and you and Haru fighting back to back. "
					+ "\nHowever, you are no match for the vine and they over power you. Ormr goes down first blocking a strike for Cassia.\"");
			System.out.println("Cassia: ORMR! NO!");
			System.out.println("Ormr: Cassia…Aster…Haru…get outta here…");
			System.out.println("\"Cassia collapses to the ground and cradles her friend’s body. "
					+ "A vine comes up behind her and speaks through her chest.");
			System.out.println("Cassia: Ah! Aster, Haru… I’m glad I was your friend…");
			System.out.println("Haru: Cassia! Ormr! Aster, we aren't going to win this are we.");
			System.out.println("Haru: It was great knowing you Aster… maybe in another life we’d do something great!");
			System.out.println("\"Bad Ending! Aster and Haru are not trained enough to take on the monsters in the ruins.\"");

			return 2.2;
		}
		else if(leftHallway.equalsIgnoreCase("flight"))
		{
			System.out.println("\"Cassia, Haru, and you race through the closing window between the vines. \nYou grip Ormr’s collar "
					+ "as you pass to drag him along. You make it to the end of the corridor. \nWould you like to go down the right "
					+ "corridor?(type right).\"");

			return 2.1;
		}
		else
		{
			return -1;
		}
	}
	
	
	
	public static double rightHallChoiceOne()
	{
		 String rightHallway = new String (playerInput.next());
		
		if (rightHallway.equalsIgnoreCase("Continue"))
		{
			System.out.println("Cassia: If you think that’s the best decision Aster.");
			System.out.println("\"You go down the hallway and reach down with an ominous glow coming from under the doorway.\"");
			System.out.println("Ormr: That’s strange, magic items shouldn’t be this far into the ruins.");
			System.out.println("Cassie: We really should just turn back guys!");
			System.out.println("Haru: I’m with Cassia on this one, we really shouldn’t go in there if there’s a magic item.");

			return 1.1;
		}
		else if (rightHallway.equalsIgnoreCase("Leave"))
		{
			
			return 1.2;
		}
		else
		{
			return -1;
		}
	}
	
	
	
	
	public static double rightContinueChoice()
	{
		 String righContinue = new String (playerInput.next());
		
		if (righContinue.equalsIgnoreCase("\"I’m sure everything is safe…\""))
		{
			System.out.println("Aster:I’m sure everything is safe, after all this place has been abandoned for centuries!");
			System.out.println("Haru: Still that glow is ominous Aster, I don’t think this is the best idea.");
			System.out.println("Ormr: Just open the door already! Stop stalling.");
			System.out.println("Cassie: I’m not sure about this… ");

			return 1.3;
		}
		else if (righContinue.equalsIgnoreCase("\"Maybe Haru is right…\""))
		{
			System.out.println("Aster: Maybe Haru is right, magic artifacts can be very dangerous.");
			System.out.println("\"Magical artifacts have been used to explode entire buildings. "
					+ "\nIf there is a dangerous one in the room there is no telling what will happen.\"");

			System.out.println("Haru: I knew you wouldn’t lead us into something dangerous, Aster.");
			System.out.println("\"Haru smiled at you. You turn towards the others.\"");
			System.out.println("Ormr: Yeah, especially since there shouldn't be any back here.");
			System.out.println("Cassia: Why do bad things always have to ruin our adventures? Let’s go tell a teacher about the artifact.");
			System.out.println("\"NEUTRAL ENDING! \nYou and your friends head back to the camp ground and tell a teacher about the strange "
					+ "light you saw in the ruins. \nWould you like to try again?\"");
			return 1.4;
		}
		else
		{
			return -1;
		}
	}
	
	
	
	public static double rightLeaveChoice()
	{
		 String rightLeave = new String (playerInput.next());
		 if(rightLeave.equalsIgnoreCase("left"))
		 {
			 System.out.println("\"You walk down the hallway and come to a dead end. Something feels off. "
						+ "\nThere is an ominous feeling in the air. It puts all of you on edge. \nOrmr suddenly stops and whips around to "
						+ "look behind you all.\"");
				System.out.println("Haru: Ormr? What’s going on?");
				System.out.println("\"Ormr continues to stare down the way you came. You see something quick strike towards Haru. "
						+ "\nYou push Haru to the ground and crouch in front of Haru as the vines close in around the group. \nOrmr "
						+ "pulls out his broad sword and swings at the vines to keep them at bay. \nIt's up to you to decide your group’s fate; "
						+ "fight or flight.\"");
			 return 2.0;
		 }
		 else
		 {
			 return -1;
		 }
	}
}
