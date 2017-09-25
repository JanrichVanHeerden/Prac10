package Debugging;

public class DebugMusical extends DebugPlay
{
    public String title;
    protected String author;
   protected String composer;
   
   DebugMusical(String title, String author, String comp)
   {
      super(title,comp);
      composer = comp;
      this.title = title;
      this.author = author;
   }
   public void display()
   {
      System.out.println("The performance is " + title +
        " by " + author + "\nThe music for " + title +
        " is by " + composer);
   }
}

