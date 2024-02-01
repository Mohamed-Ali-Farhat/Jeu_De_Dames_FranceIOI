class Main {
  public static void main(String[] args) {


      for (int loop = 0; loop <= 39; loop = loop + 1) {

          if(loop%2==0)  {
              for (int i = 0; i <= 19; i = i + 1) {
                  System.out.print("OX");

              }
              System.out.println(" ");
          }
          else {
              for (int j = 0; j <= 19; j = j + 1) {
              System.out.print("XO");
          }

              System.out.println(" ");

          }
      }


  }


}