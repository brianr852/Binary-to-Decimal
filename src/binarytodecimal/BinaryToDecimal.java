/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytodecimal;

import java.util.Scanner;

/**
 *
 * @author brian
 */
public class BinaryToDecimal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scan = new Scanner ( System.in ) ;
    
    String binaryNumber ;
    String answer;
    int decimalNumber ;
    int k;
    
    do
    {
        decimalNumber = 0 ;
        k = 0 ; 
 
        do
        {
            System.out.print ( "Please enter a binary number > " ) ;
            binaryNumber = scan.nextLine() ;
        } while ( ! ( binaryNumber.matches( "[01]+" ) ) ) ;
    
        for ( int i = binaryNumber.length() - 1 ;  i >= 0 ; i-- )
        {
            if ( binaryNumber.charAt ( i ) == '1' )
            {
                decimalNumber += ( Math.pow( 2,  k )  ) ;
            }
            k++;
        }
        System.out.println ( "The decimal equivalent of binary number " + binaryNumber
                            + " is " + decimalNumber ) ;
        System.out.println ( "Would you like to convert another binary number? ( yes/no ) " ) ;
        answer = scan.next().toLowerCase() ;
    } while ( answer.equals ( "yes" ) ) ;
    }   
}
