import java.util.Scanner;

public class FileCounter
{
   private int chractersNumber, wordsNumber, linesNumber;
   public FileCounter()
   {   
   }

   /**
      Processes an input source and adds its character, word, and line
      counts to this counter.
      @param in the scanner to process
   */
   public void read(Scanner in)
   {
     while(in.hasNextLine()){
    	 String line = in.nextLine();
    	 chractersNumber += line.length();
    	 //System.out.println(line);
    	 Scanner s = new Scanner(line);
    	 while (s.hasNext()){
    	 String words = s.next();
    	 System.out.println(words);
    	 wordsNumber++;
    	  }
    	 linesNumber++;
     }
   }

   /**
      Gets the number of words in this counter.
      @return the number of words
   */
   public int getWordCount()
   {
     return  wordsNumber;
   }

   /**
      Gets the number of lines in this counter.
      @return the number of lines
   */
   public int getLineCount()
   {
	   return linesNumber;
   }

   /**
      Gets the number of characters in this counter.
      @return the number of characters
   */
   public int getCharacterCount()
   {
	   return chractersNumber;
   }
}