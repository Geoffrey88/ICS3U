let player1_g = ""
let player2_g = ""
let round = 0
function clicked(elementId)
{
   round ++;
   if(round == 1){
      player1_g = elementId
      console.log("Player 1s guess is: " + player1_g);
      console.log(round);
      round ++;
      alert ("player 2's turn, hide your screen")
   }
   if(round == 3) {
      player2_g = elementId
      console.log("Player 2s guess is: " + player2_g);
      console.log(round);
   }
   
   if (round ==3){
     
      if (player1_g == "rock" && player2_g == "scissors"){
         alert ("player 1 wins!");}
      else if (player1_g == "rock" && player2_g == "paper"){
         alert ("player 2 wins!");}
         
      else if (player1_g == "paper" && player2_g == "scissors"){
         alert ("player 2 wins!");}
            
      else if (player1_g == "paper" && player2_g == "rock"){
         alert ("player 1 wins!");}
      
      else if (player1_g == "scissors" && player2_g == "rock"){
         alert ("player 2 wins!");}
                     
      else if (player1_g == "scissors" && player2_g == "paper"){
         alert ("player 1 wins!");}
                        
      else {
         alert ("tie! try again");}
    
         player1_g = ""
         player2_g = ""
         round = 0   
   }
}   