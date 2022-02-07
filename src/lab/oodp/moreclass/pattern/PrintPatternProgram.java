package lab.oodp.moreclass.pattern;

public class PrintPatternProgram {
	
	public void start() { 
		printPatternOne();
		printPatternTwo();
	}
    
	public void printPatternOne() {
		System.out.println("First Pattern");
		
		Pattern top = new Pattern(15, '*');
		Pattern sideOfFirstLine = new Pattern(7, '#');
		Pattern sideOfLine = new Pattern(7, '~');
		Pattern middle = new Pattern(1, '.');
		
		System.out.println(top);
		System.out.println(sideOfFirstLine.toString() + middle.toString() + sideOfFirstLine.toString());
       
		for (int i = 0; i < 6; i++) {
			middle.setNumberOfCharacters(middle.getNumberOfCharacters() + 1);
			System.out.println(sideOfLine.toString() + middle.toString() + sideOfLine.toString());
		}
	}
    
    public void printPatternTwo() {
        System.out.println("Second Pattern");
        
        //TODO: create pattern class and print outs first two line
        Pattern top = new Pattern(36, '@');
        Pattern sideOfFirstLine = new Pattern(12, '=');
        Pattern middle = new Pattern(12, '.');
        Pattern sideOfLine = new Pattern(12, '&');
        
        System.out.println(top);
        System.out.println(sideOfFirstLine.toString() + middle.toString() + sideOfFirstLine.toString());
        
        for (int i = 0; i < 6; i++) {
        	//TODO: print out the lines with & and .
        	middle.setNumberOfCharacters(middle.getNumberOfCharacters() - 2);
        	sideOfLine.setNumberOfCharacters(sideOfLine.getNumberOfCharacters() + 1);
			System.out.println(sideOfLine.toString() + middle.toString() + sideOfLine.toString());
        }

    }

    public static void main(String[] args) {
        PrintPatternProgram ppp = new PrintPatternProgram();
        ppp.start();
    }
}
