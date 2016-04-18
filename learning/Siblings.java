import java.util.*;

public class Siblings {

  public static void findSiblings(String parentSibling)
  { 
    List<String> input = Arrays.asList(parentSibling.split(","));
    String person = input.get(input.size()-1);
    HashMap<String, String> dictMap = new HashMap<String, String>();

    for (int i = 0; i < input.size()-1; i++)
    {
      String[] pair = input.get(i).split("->"); // ex. [Frank, Mary]
       
       
      // if a parent/offspring relationship does not exist, create one
      if (!dictMap.containsKey(pair[0]))
      {
          dictMap.put(pair[0], pair[1]);
      }
      // else, add on to the existing relationship
      else
      {
          // since it is possible to concaticate strings, we dont not have to 
          // use a HashMap<String, ArrayList>
          dictMap.put(pair[0], pair[1] + "," + dictMap.get(pair[0]));
      }
    }

    for (String parent : dictMap.keySet())
    {
      // iterate through the parent/sibling hashmap until it finds one containing the person we are looking for
      if (dictMap.get(parent).contains(person))
      {
        // if the value only contains a single entry, then that person is an only child
        if (Arrays.asList(dictMap.get(parent).split(",")).size() == 1)
        {
          System.out.println(person + " has no siblings");
        }
        else
          // else print the siblings of the person
        {
          System.out.print(person + "'s siblings are: ");
          for (String s : Arrays.asList(dictMap.get(parent).split(",")))
          {
            if (!s.equals(person))
            {
              System.out.print(s + " ");
            }
          }
          System.out.println("");
        }
      }
    }
  }
  public static void main(String[] args)
  {
    String testString1 = "Bob->Frank,Sally->Bob,Bob->Joe,Joe->Chris,Joe->Fred,Bob";
    String testString2 = "Bob->Brank,Bob->Sally,Joe->Fred,Joe->Chris,Joe->Pat,Chris";

    // tests
    findSiblings(testString1); // prints "Bob has no siblings"
    findSiblings(testString2); // prints "Chris's siblings are: Pat Fred "

  }
}

