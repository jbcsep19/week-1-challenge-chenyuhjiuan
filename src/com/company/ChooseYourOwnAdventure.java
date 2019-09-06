package com.company;

import java.util.Scanner;

public class ChooseYourOwnAdventure {

    public static void main (String [] args){


        int num1=0;
        int num2=0;
        int num3=0;
        int num4=0;


        String action11="";
        String action12="";
        String action13="";
        String action14="";



        Scanner key = new Scanner(System.in);

        System.out.println("Welcome to Emily's fun adventure");

        System.out.println("We have five places to let you go. Please key in the place number");

        System.out.println("1: Kitchen, 2: Upstairs, 3: Patio, 4: Living Room, 5: Basement");

        num1= key.nextInt();



        if(num1==1){

            action11="Kitchen";

            System.out.println("What are you going to open? Typing 1 is for the refrigerator and typing 2 is for the cabinet.");

            num2=key.nextInt();



            if(num2==1){

                action12="refrigerator";

                System.out.println("You are opening the refrigerator. What are you going to eat? Typing 1 is to drink strange milk and 2 is to eat leftovers");

                num3=key.nextInt();

                if(num3==1){

                    action13="drink strange milk";

                    System.out.println("Would you like to have some black grape? Typing 1 is for yes or 2 is for no.");

                    num4=key.nextInt();

                    if(num4==1){

                        System.out.println("We are sorry to see you have the poison grape. You die now.");

                    }
                    else if(num4==2){

                        action14="not taking the grape";
                        System.out.println("Congratulation! You win the game.");
                        System.out.printf("This successful route was through "+action11+", "+action12+", "+" and "+action14+".");

                    }
                    else{
                        System.out.printf("Please enter a valid number.");
                    }


                }
                else if(num3==2){

                    action13="eat leftovers";

                    System.out.println("Would you like to have some red orange? Typing 1 is for yes and 2 is for no.");

                    num4=key.nextInt();

                    if(num4==1){

                        System.out.println("We are sorry to see you have the poison orange. You die now.");

                    }
                    else if(num4==2){
                        action14="not taking the orange";
                        System.out.println("Congratulation! You win the game.");
                        System.out.printf("This successful route was through "+action11+", "+action12+", "+" and "+action14+".");

                    }
                    else{
                        System.out.printf("Please enter a valid number.");
                    }
                }
                else{
                    System.out.printf("Please enter a valid number.");
                }
            }

            else if(num2==2){

                action12="cabinet";

                System.out.println("You are opening the cabinet. What are you going to do? Typing 1 is to eat can of beans and 2 is to eat leftovers");

                num3=key.nextInt();

                if(num3==1) {

                    action13 = "eat can of beans";

                    System.out.println("Would you like to have some black grape? Typing 1 is for yes and 2 is for no.");

                    num4 = key.nextInt();

                    if (num4 == 1) {

                        System.out.println("We are sorry to see you have the poison grape. You die now.");

                    }
                    else if (num4 == 2) {
                        action14="not taking the grape";
                        System.out.println("Congratulation! You win the game.");
                        System.out.printf("This successful route was through "+action11+", "+action12+", "+" and "+action14+".");

                    }
                    else{
                        System.out.printf("Please enter a valid number.");
                    }
                }
                else if(num3==2){
                        action13="take a plate";

                        System.out.println("Would you like to have some red orange? Typing 1 is for yes and 2 is for no.");

                        num4=key.nextInt();

                        if(num4==1){

                            System.out.println("We are sorry to see you have the poison orange. You die now.");

                        }
                        else if(num4==2){
                            action14="not taking the orange";
                            System.out.println("Congratulation! You win the game.");
                            System.out.printf("This successful route was through "+action11+", "+action12+", "+" and "+action14+".");

                        }
                        else{
                            System.out.printf("Please enter a valid number.");
                        }
                    }
                else{
                    System.out.printf("Please enter a valid number.");
                }
                }

            else{
                System.out.printf("Please enter a valid number.");
            }

            }
        else if (num1==2){

            action11="upstairs";

            System.out.println("You are now upstairs. If you want to the bedroom, please type 1. Otherwise, please type 2 to the bathroom.");

            num2=key.nextInt();



            if(num2==1){

                action12="bedroom";

                System.out.println("This is a very nice bedroom. If you want to lay on bed, please type 1. Otherwise, type 2 to open the drawer");

                num3=key.nextInt();

                if(num3==1){

                    action13="lay on bed";

                    System.out.println("Do you want to sleep now? Type 1 to say yes or type 2 to say no.");

                    num4=key.nextInt();

                    if(num4==1){

                        System.out.println("This bed will let you sleep forever. We are sorry to see you fail the game.");

                    }
                    else if(num4==2){
                        action14="not on the bed";
                        System.out.println("Congratulation! You win the game.");
                        System.out.printf("This successful route was through "+action11+", "+action12+", "+" and "+action14+".");
                    }
                    else{
                        System.out.printf("Please enter a valid number.");
                    }


                }
                else if(num3==2){

                    action13="open the drawer";

                    System.out.println("You are now upstairs. There is a drawer. Do you want to open it? Typing 1 is for yes or 2 is for no.");

                    num4=key.nextInt();

                    if(num4==1){

                        System.out.println("The drawer has poison powder. We are sorry to see you breath the poison air. You die now.");

                    }
                    else if(num4==2){
                        action14="not open the draw";
                        System.out.println("Congratulation! You win the game.");
                        System.out.printf("This successful route was through "+action11+", "+action12+", "+" and "+action14+".");

                    }
                    else{
                        System.out.printf("Please enter a valid number.");
                    }
                }
                else{
                    System.out.printf("Please enter a valid number.");
                }
            }

            else if(num2==2){

                action12="bathroom";

                System.out.println("You are in the bathroom. What are you going to do? Typing 1 is to look in the mirror or 2 is to use the toilet");

                num3=key.nextInt();

                if(num3==1) {

                    action13 = "look in the mirror";

                    System.out.println("There is a mirror. Would you like to look at it? Typing 1 is for yes or 2 is for no.");

                    num4 = key.nextInt();

                    if (num4 == 1) {

                        System.out.println("There is a monster in the mirror and it kills you. You die now.");

                    }
                    else if (num4 == 2) {
                        action14="not use the mirror";
                        System.out.println("Congratulation! You win the game.");
                        System.out.printf("This successful route was through "+action11+", "+action12+" and "+action14+".");

                    }
                    else{
                        System.out.printf("Please enter a valid number.");
                    }
                }
                else if(num3==2){
                    action13="use the toilet";

                    System.out.println("Would you like to use the toilet? Typing 1 is for yes and 2 is for no.");

                    num4=key.nextInt();

                    if(num4==1){

                        System.out.println("The water in the toilet is poison and hurts your body. You die now.");

                    }
                    else if(num4==2){
                        action14="not use the toilet";
                        System.out.println("Congratulation! You win the game.");
                        System.out.printf("This successful route was through "+action11+", "+action12+" and "+action14+".");

                    }
                    else{
                        System.out.printf("Please enter a valid number.");
                    }
                }

            }

            else{
                System.out.printf("Please enter a valid number.");
            }

        }
        else if (num1==3){

            action11="on the patio";

            System.out.println("You are now on the patio. If you want to pool, please type 1. Otherwise, please type 2 to open shed");

            num2=key.nextInt();



            if(num2==1){

                action12="at the pool";

                System.out.println("Now you are at the pool. If you want to clean the pool, please type 1. Otherwise, type 2 to swim in the pool");

                num3=key.nextInt();

                if(num3==1){

                    action13="clean the pool";

                    System.out.println("Do you use the detergent sent from your friend for the cleansing? Type 1 to say yes or type 2 to say no.");

                    num4=key.nextInt();

                    if(num4==1){

                        System.out.println("The detergent is poison and hurt you. We are sorry to see you fail the game.");

                    }
                    else if(num4==2){
                        action14="not use the detergent";
                        System.out.println("Congratulation! You win the game.");
                        System.out.printf("This successful route was through "+action11+", "+action12+", "+" and "+action14+".");
                    }

                    else{
                        System.out.printf("Please enter a valid number.");
                    }

                }
                else if(num3==2){

                    action13="swim in the pool";

                    System.out.println("You are swimming. Somebody is calling you beside the pool. Do you want to be close to him? Typing 1 is for yes or 2 is for no.");

                    num4=key.nextInt();

                    if(num4==1){

                        System.out.println("This guy is very bad. He kills you. We sorry for your death.");

                    }
                    else if(num4==2){
                        action14="not swim to the stranger";
                        System.out.println("Congratulation! You win the game.");
                        System.out.printf("This successful route was through "+action11+", "+action12+", "+" and "+action14+".");

                    }
                    else{
                        System.out.printf("Please enter a valid number.");
                    }
                }
                else{
                    System.out.printf("Please enter a valid number.");
                }
            }

            else if(num2==2){

                action12="open shed";

                System.out.println("The shed is open now. What are you going to do? Typing 1 is to take an ax or 2 is to take a hammer");

                num3=key.nextInt();

                if(num3==1) {

                    action13 = "take an ax";

                    System.out.println("If you want to chop a tree, please type 1. Otherwise type 2 to throw the ax.");

                    num4 = key.nextInt();

                    if (num4 == 1) {

                        System.out.println("We are very sorry for that yuu chop yourself. The game is over now.");

                    }
                    else if (num4 == 2) {
                        action14="throw the ax";
                        System.out.println("Congratulation! You win the game.");
                        System.out.printf("This successful route was through "+action11+", "+action12+" and "+action14+".");

                    }
                    else{
                        System.out.printf("Please enter a valid number.");
                    }
                }
                else if(num3==2){
                    action13="take a hammer";

                    System.out.println("If you want to hammer a nail, please type 1. Otherwise, please type 2 to break the hammer.");

                    num4=key.nextInt();

                    if(num4==1){

                        System.out.println("The nail punctured your fingers. You were bleeding badly.  You die now.");

                    }
                    else if(num4==2){
                        action14="break the hammer";
                        System.out.println("Congratulation! You win the game.");
                        System.out.printf("This successful route was through "+action11+", "+action12+" and "+action14+".");

                    }
                    else{
                        System.out.printf("Please enter a valid number.");
                    }
                }
                else{
                    System.out.printf("Please enter a valid number.");
                }

            }

            else{
                System.out.printf("Please enter a valid number.");
            }

        }
        else if (num1==4){

            action11="in the living room";

            System.out.println("You are now in the living room. If you want to turn on the TV, please type 1. Otherwise, please type 2 to sit on the couch.");

            num2=key.nextInt();



            if(num2==1){

                action12="change the channel";

                System.out.println("If you want to change the channel, please type 1. Otherwise, type 2 to stay on the first channel.");

                num3=key.nextInt();

                if(num3==1){

                    action13="increase the volume";

                    System.out.println("Do you want to increase the volume? Type 1 to say yes or type 2 to say no.");

                    num4=key.nextInt();

                    if(num4==1){

                        System.out.println("The loudness hurt your ears and you can't watch the TV. We are sorry to see you fail the game.");

                    }
                    else if(num4==2){
                        action14="decrease the volume";
                        System.out.println("Congratulation! You win the game.");
                        System.out.printf("This successful route was through "+action11+", "+action12+", "+" and "+action14+".");
                    }
                    else{
                        System.out.printf("Please enter a valid number.");
                    }


                }
                else if(num3==2){

                    action13="stay on the first channel";

                    System.out.println("Somebody is knocking the door. Do you want to open it? Typing 1 is for yes or 2 is for no.");

                    num4=key.nextInt();

                    if(num4==1){

                        System.out.println("When you open the door, a bad guy shoots you down. You die now.");

                    }
                    else if(num4==2){
                        action14="ignor the door";
                        System.out.println("Congratulation! You win the game.");
                        System.out.printf("This successful route was through "+action11+", "+action12+", "+" and "+action14+".");

                    }
                    else{
                        System.out.printf("Please enter a valid number.");
                    }
                }
                else{
                    System.out.printf("Please enter a valid number.");
                }
            }

            else if(num2==2){

                action12="sit on the couch";

                System.out.println("Now you are sitting on the couch. If you want to look out the window, please type 1. Otherwise, type 2 to start to eat");

                num3=key.nextInt();

                if(num3==1) {

                    action13 = "look out the window";

                    System.out.println("Do you want to open the window? Typing 1 is for yes or 2 is for no.");

                    num4 = key.nextInt();

                    if (num4 == 1) {

                        System.out.println("The wind blows you out. You die now.");

                    }
                    else if (num4 == 2) {
                        action14="not open the window";
                        System.out.println("Congratulation! You win the game.");
                        System.out.printf("This successful route was through "+action11+", "+action12+" and "+action14+".");

                    }
                    else{
                        System.out.printf("Please enter a valid number.");
                    }
                }
                else if(num3==2){
                    action13="start to eat";

                    System.out.println("Would you like to have some juice? Typing 1 is for yes and 2 is for no.");

                    num4=key.nextInt();

                    if(num4==1){

                        System.out.println("The juice is poison and hurts your body. You die now.");

                    }
                    else if(num4==2){
                        action14="not drink the juice";
                        System.out.println("Congratulation! You win the game.");
                        System.out.printf("This successful route was through "+action11+", "+action12+" and "+action14+".");

                    }
                    else{
                        System.out.printf("Please enter a valid number.");
                    }
                }
                else{
                    System.out.printf("Please enter a valid number.");
                }
            }
            else{
                System.out.printf("Please enter a valid number.");

            }

        }
        else if (num1==5){

            action11="basement";

            System.out.println("You are now in the basement. If you want to turn on the light, please type 1. Otherwise, please type 2 to walk in the dark.");

            num2=key.nextInt();



            if(num2==1){

                action12="turn on the light";

                System.out.println("If you want to turn the laundry on, please type 1. Otherwise, please type 2 to turn the lights off.");

                num3=key.nextInt();

                if(num3==1){

                    action13="turn the laundry on";

                    System.out.println("Do you want to use the washing powder? Type 1 to say yes or type 2 to say no.");

                    num4=key.nextInt();

                    if(num4==1){

                        System.out.println("The powder is poison. We are sorry to see you die and fail the game.");

                    }
                    else if(num4==2){
                        action14="not use the washing powder";
                        System.out.println("Congratulation! You win the game.");
                        System.out.printf("This successful route was through "+action11+", "+action12+", "+" and "+action14+".");
                    }
                    else{
                        System.out.printf("Please enter a valid number.");
                    }


                }
                else if(num3==2){

                    action13="turn the lights off";

                    System.out.println("Now it is very dark. Do you want to walk in the dark? Typing 1 is for yes or 2 is for no.");

                    num4=key.nextInt();

                    if(num4==1){

                        System.out.println("You stepped on a poisonous snake. It bit you. You die now.");

                    }
                    else if(num4==2){
                        action14="not walk in the dark";
                        System.out.println("Congratulation! You win the game.");
                        System.out.printf("This successful route was through "+action11+", "+action12+", "+" and "+action14+".");

                    }
                    else{
                        System.out.printf("Please enter a valid number.");
                    }
                }
                else{
                    System.out.printf("Please enter a valid number.");
                }
            }

            else if(num2==2){

                action12="walk in the dark";

                System.out.println("It is very dark now. What are you going to do? Typing 1 is to open a chest or 2 is to open a closet");

                num3=key.nextInt();

                if(num3==1) {

                    action13 = "open a chest";

                    System.out.println("Have you touched a soft thing? Typing 1 is for yes or 2 is for no.");

                    num4 = key.nextInt();

                    if (num4 == 1) {

                        System.out.println("That soft thing was a poisonous snake and it bit you. You die now.");

                    }
                    else if (num4 == 2) {
                        action14="not touch a soft thing";
                        System.out.println("Congratulation! You win the game.");
                        System.out.printf("This successful route was through "+action11+", "+action12+" and "+action14+".");

                    }
                    else{
                        System.out.printf("Please enter a valid number.");
                    }
                }
                else if(num3==2){
                    action13="open a closet";

                    System.out.println("Do you want to go to the next room? Typing 1 is for yes and 2 is for no.");

                    num4=key.nextInt();

                    if(num4==1){

                        System.out.println("There is a monster in the room. You got killed and die now.");

                    }
                    else if(num4==2){
                        action14="not go to the next room";
                        System.out.println("Congratulation! You win the game.");
                        System.out.printf("This successful route was through "+action11+", "+action12+" and "+action14+".");

                    }
                    else{
                        System.out.printf("Please enter a valid number.");
                    }

                }
                else{
                    System.out.printf("Please enter a valid number.");
                }
            }

            else{
                System.out.printf("Please enter a valid number.");
            }

        }
        else{
            System.out.printf("Please enter a valid number.");
        }
    }
}
