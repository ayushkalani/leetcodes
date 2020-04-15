
public class ProbablityGenerator {

  public static void main(String[] args) {
    ProbabilityGenerator gen = new ProbabilityGeneratorImpl("probabilities.txt");
    for(int i=0; i<1200; i++) {
      String nextStr = gen.getNextString();

    }
    
  }

}