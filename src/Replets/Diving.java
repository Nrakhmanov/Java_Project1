package Replets;

import java.util.Scanner;

public class Diving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] score = new float[7];

        //WRITE YOUR CODE HERE

        float total = 0;
        for (int i=1;i<8;i++)	{
            System.out.println("Enter score for judge " + i + ":");

            score[i] = input.nextFloat();
        }

       float maxScore = score[0];
        float minScore = score[0];

        for(int i =0; i<score.length-1; i++){
            if(score[i]>maxScore){

                maxScore=score[i];
            }
            if(score[i]<minScore){
                minScore=score[i];
            }

                total += score[i];
            }

        System.out.println("Enter difficulty:");
        float difScore = input.nextFloat();

        double result = (total - (minScore+maxScore))*0.6f*difScore;

        System.out.printf("Total: %.2f", result);




        }

    }

