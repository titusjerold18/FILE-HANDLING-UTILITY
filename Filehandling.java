import java.io.*;


class Main {
  public static void main(String[] args) {
    try{
      File fo=new File("newfile.txt");
      if(fo.createNewFile()){
        System.out.println("The File "+fo.getName()+" is created");
      }
    }catch(Exception e){
      System.out.println("An error occured");
    }
    try(BufferedWriter bw=new BufferedWriter(new FileWriter("newfile.txt"))){
      bw.write("i am the first one");
    }catch(IOException e){
      System.out.println("An error occured");
    }
    try(BufferedReader br=new BufferedReader(new FileReader("newfile.txt"))){
      System.out.println("Before Modification:");
      while(br.ready()){
        System.out.println(br.readLine());
      }
    }catch(IOException e){
      System.out.println("An error occured");
    }
    try(BufferedWriter bw=new BufferedWriter(new FileWriter("newfile.txt",true))){
      bw.write('\n');
      bw.write("i am the second one");
    }catch(IOException e){
      System.out.println("An error occured");
    }
    try(BufferedReader br=new BufferedReader(new FileReader("newfile.txt"))){
      System.out.println("After Modification:");
      while(br.ready()){
        System.out.println(br.readLine());
      }
    }catch(IOException e){
      System.out.println("An error occured");
    }
   
      
    
  }
}
