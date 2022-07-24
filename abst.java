abstract class Language {

    public void display() {
      System.out.println("This is Java Programming");
    }
  }
  
class abst extends Language {
  
    public static void main(String[] args) {
      abst obj = new abst();
      obj.display();
    }
  }