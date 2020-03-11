public class index
{

    public static void main (String[] args )
    {
        System.out.println("Hello World!"); //Hello world message to test the class

        // The Sentence
        String str = "hello how are you doing mister hi";

        //print the Sentence on the screen
        System.out.print("The Sentence is: " + str);

        //We turn the sentence into array called "strArray" by splitting the sentence into words using ".split" method
        // ".split" method splits the sentence after each space(" ")
        String strArray [] = str.split(" ");
        //now the "strArray" array has all the words stored as "String"

        //initialized "strLengths" array
        int strLengths [] = new int[strArray.length];

        //for loop that checks the length of each word and stores it in "strLengths" array
        for(int i =0; i < strArray.length; i++) //"i" starts at 0 and goes upto the length of "strArray"
        {
            strLengths[i] = strArray[i].length(); //starting at "i = 0", we add the length of each word stored in the
                                                  //"strArray" to the "strLengths" array
        }// now the "strLengths" array only has numbers(int) for the length of each of the letter

        int j =0;//initialized "j" to use it in the while loop
        int largestString = 0;//this will keep track of the largest word as an "int"
        while(j < strLengths.length) //while loop will run until "j" equals the length of the sentence
        {
            //if statement tp check if the length of the current word is less than the word after it
            if (largestString < strLengths[j])//if current word is smaller than the word after it
            {
                largestString = strLengths[j];// then change the value of "largestString" to the new longest word
            }
            j++;// updated "j"
        }

        System.out.println();//added new line .... could also use "\n"
        System.out.println("Largest string is " + largestString);//print the largest word on the screen
        System.out.println("\nEnd of processing"); //end of coding
    }
}