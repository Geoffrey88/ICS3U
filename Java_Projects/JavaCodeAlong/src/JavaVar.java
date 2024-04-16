public class JavaVar {
//datatypes
//class level vars
    
    public static void main(String[] args) throws Exception{
        //datayype varName [=value];
        int games = 3; 
        double allowance = 40.50;
        long battlepass; //we define battlepass
        battlepass = 15; //we assign a value to battlepass 

        //Print out our variables values along with a string that explains our values
        System.out.println("Number of games I own = " + games);
        System.out.println("My mounthly allowance = " + allowance);
        System.out.println("Cost of a single battlepass = " + battlepass);
    

        //with our allowance, how many battle passes will we be able to buy?

        //what is the total cost of the battle pass if we wanted to each one?
            
        double Numofbattlepass = allowance / battlepass;
        //defining a variable that represents the exaxt number of how many times you can buy the battle pass
        Numofbattlepass = Math. floor(Numofbattlepass);
        //rounding down because you cant have partial battlepasses
        double cost = Numofbattlepass * 15;
        //totaling cost based on how many battle passes we could buy
        System.out.println("You can buy = " + Numofbattlepass + " battle passes each time you get your allowance.");
        
        System.out.println("The total cost of all the battle passes that we can buy is = " + cost + "$");
        //displaying data
    }
}

