
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;


public class Utility 
{
    public static ArrayList<Accounts> readFile(String filename)
    {
        ArrayList<Accounts>  accounts = new ArrayList(); 
      try
      {
         FileReader fr = new FileReader(filename);
         BufferedReader br = new BufferedReader(fr);
         String  line;
         while((line=br.readLine())!=null)
         {
             String [] currentAccount = line.split("<>");
             String accNumber = currentAccount[0];
             String accHolder = currentAccount[1];
             String openDate = currentAccount[2];
             double balance = Double.parseDouble(currentAccount[3]);
             
             Accounts acc = new Accounts(accNumber,accHolder,openDate,balance);
             accounts.add(acc);
         }
         br.close();
      } 
      catch(Exception e)
      {
          System.out.println(e);
      }
          return accounts;
    }
         public static void  writerFile(ArrayList<Accounts> account,String fileName)
         {
             for(Accounts a:account)
             {
               try
               {
                  FileWriter fr = new FileWriter(fileName);
                  BufferedWriter bw = new BufferedWriter(fr);
                  bw.write(a.toString()+"<>"+ a.getAccountHolder()+"<>"+a.getAccountOpenDate()+"<>"+ String.valueOf(a.getBalance())+"\n");
                  bw.close();
               }
               catch(Exception e)
               {
                  System.out.println(e);
               }
             }
         }
}
