// A Vacation is 10 days
// but an ExtendedVacation is 30 days
public class DebugTen2
{
   private static Object DebugVacation;
   private static Object DebugExtendedVacation;

   public static void main(String args[]) 
   {
      DebugVacation = new DebugVacation();
      DebugExtendedVacation =
         new DebugExtendedVacation();
      DebugVacation myVacation = null;
      System.out.println("My vacation is for " +
         myVacation.getDays() + " days");
      DebugVacation yourVacation = null;
      System.out.println("Your vacation is for " +
         yourVacation.getDays() + " days");
   }
}
