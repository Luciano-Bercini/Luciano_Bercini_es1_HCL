import java.io.FileNotFoundException;

public class Tester {
    public static void main(String[] args) {
        System.out.println(args.length);
        if (args.length == 0) {
            System.out.println("Usage: java Tester <input_file>");
            return;
        }
        String filePath = args[0]; // Get the input file path from the command line argument.
        LexicalAnalysis(filePath);
//        "file_input.txt"
    }

    private static void LexicalAnalysis(String filePath) {
        Lexer lexicalAnalyzer = new Lexer();
        if (lexicalAnalyzer.initialize(filePath)) {
            Token token;
            try {
                while ((token = lexicalAnalyzer.nextToken()) != null) {
                    System.out.println(token);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}