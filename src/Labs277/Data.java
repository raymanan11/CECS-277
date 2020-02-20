package Labs277;

import java.util.ArrayList;

public class Data
{
   /**
      Computes the average of the measures of the given objects.
      @param objects an array of Measurable objects
      @return the average of the measures
   */
   public static double average(Measurable[] objects)
   {
      double sum = 0;
      for (Measurable obj : objects)
      {
         sum = sum + obj.getMeasure();
      }
      if (objects.length > 0) { return sum / objects.length; }
      else { return 0; }
   }

   public static Person youngest(Person[] people) {
      double smallestNum = 1000;
      Person youngest = null;

      for (Person person : people) {
         if(person.getMeasure() < smallestNum) {
            smallestNum = person.getMeasure();
            youngest = person;
         }
      }
      return youngest;
   }
}
