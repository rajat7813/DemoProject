package com.example.collection;

public class EnumImplementation {

/*	public EnumImplementation() {
		
	}
*/
	Ranks rank;
	
	public String rankToString(Ranks rank)
	{
		switch(rank)
		{
		case ACE:
			return "Ace";
			
		case DEUCE:
			return "Deuce";	
			
        case THREE:
            return "Three";
        
        case FOUR:
            return "Four";
       
        case FIVE:
            return "Five";

        case SIX:
            return "Six";
        
        case SEVEN:
            return "Seven";
        
        case EIGHT:
            return "Eight";
        
        case NINE:
            return "Nine";
        
        case TEN:
            return "Ten";
        
        case JACK:
            return "Jack";
        
        case QUEEN:
            return "Queen";
        
        case KING:
            return "King";	
		}	
		DEFAULT: 
		return null;
		 
		}
	
	public static void main(String args[]) {
		
		//Ranks r =Ranks.ACE;
		EnumImplementation enm = new EnumImplementation();
		System.out.println(enm.rankToString(Ranks.ACE));
		System.out.println(Ranks.valueOf("ACE"));
				
	}
	

}
