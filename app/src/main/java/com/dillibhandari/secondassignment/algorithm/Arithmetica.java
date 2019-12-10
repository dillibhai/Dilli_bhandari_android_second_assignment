package com.dillibhandari.secondassignment.algorithm;

import java.util.ArrayList;

    public class Arithmetica {

        public int areaOFCircle(int radius){
            return (22/7)* radius*radius;
        }

        public String palindrome(String inputValue){

            String  reverse = "";
            for ( int i = inputValue.length() - 1; i >= 0; i-- ) reverse += inputValue.charAt(i);
            if (inputValue.equals(reverse))
                return  "Input Text is Palindrome";
            else
                return "Input Text is not  Palindrome";
        }
        public String reverse(String inputValue){
            String  reverse = "";;
            for(int j=inputValue.length()-1;j>=0;j--) reverse += inputValue.charAt(j);
            return reverse;

        }
        public ArrayList<String> swap (String valueOne, String valueTwo){
            ArrayList list = new ArrayList();
            valueOne = valueOne + valueTwo;
            valueTwo = valueOne.substring(0, valueOne.length() - valueTwo.length());
            valueOne = valueOne.substring(valueTwo.length());
            list.add(valueOne);
            list.add(valueTwo);
            return list;
        }
        public String automorphicNum(int number){

            int unit_digit1=number%10;
            int square=number*number;
            int unit_digit2=square%10;
            if(unit_digit1==unit_digit2)
            {
               return number+" is a automorpic number";
            }
            else
            {
                return number+" is not a automorphic number";
            }

        }

    }


