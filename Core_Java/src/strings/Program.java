//package strings;
//
//import java.util.List;
//
//public class Program
//{
//    public static void main(String[] args)
//    {
//        List<String> test = new List<String>();
//        List<String> list = new List<String>();
//        List<String> list1 = new List<String>();
//        List<String> outputList = new List<String>();
//        list.add("MARY,JOE");
//        list.add("A,B");
//        list.add("B, A");
//        list.add("3");
//        list.add("3");
//        list.add("3,3");
//        list.add("3,3");
//        String aa = compareFriends(list);
//       System.out.println();
//    }
//
//    public static List<String> compareFriends(List<String> allfrndsList)
//    {
//        String frndsList  = allfrndsList.Distinct().ToList();
//        String outputList = new List<string>(frndsList);
//        String listCount = frndsList.
//        String startIndex = 1;
//
//        for (String friend : frndsList)
//        {
//            friend.replace(" ","");
//            String str = friend.split(',');
//            String i1 = str.FirstOrDefault();
//            String i2 = str.LastOrDefault();
//            for (String index = startIndex; index < listCount; index++)
//            {
//                String innerStr = frndsList[index].Replace(" ","").Split(',');
//                String temp1 = innerStr.FirstOrDefault();
//                String temp2 = innerStr.LastOrDefault();
//                if (innerStr.Length != 1 && str.Length!=1)
//                {
//                    if (i1.equals(temp2) && i2.equals(temp1))
//                    {
//                        outputList.remove(friend);
//                    }
//                }
//            }
//            startIndex++;
//        }
//        return outputList;
//    }
//}