import java.util.Scanner;

public class ifelse {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Rock, Paper, Scissors Game");
    System.out.println("Enter either Rock, Paper, or Scissors: ");
    String player = sc.nextLine();
    int computer = (int)(Math.random() * 3 + 1);
    String computerMove = "";

    if (computer == 1) {
      computerMove = "Rock";
    } else if (computer == 2) {
      computerMove = "Paper";
    } else if (computer == 3) {
      computerMove = "Scissors";
    }

    System.out.println("Computer chose: " + computerMove);

    if (player.equalsIgnoreCase("Rock")) {
      if (computerMove.equals("Scissors")) {
        System.out.println("Player wins!");
      } else if (computerMove.equals("Paper")) {
        System.out.println("Computer wins!");
      } else {
        System.out.println("It's a tie!");
      }
    } else if (player.equalsIgnoreCase("Paper")) {
      if (computerMove.equals("Rock")) {
        System.out.println("Player wins!");
      } else if (computerMove.equals("Scissors")) {
        System.out.println("Computer wins!");
      } else {
        System.out.println("It's a tie!");
      }
    } else if (player.equalsIgnoreCase("Scissors")) {
      if (computerMove.equals("Paper")) {
        System.out.println("Player wins!");
      } else if (computerMove.equals("Rock")) {
        System.out.println("Computer wins!");
      } else {
        System.out.println("It's a tie!");
      }
    } else {
      System.out.println("Invalid input. Please enter either Rock, Paper, or Scissors.");
    }
  }
}
