package Activity6;

public class Mariano_L6Activity3 {

	public static void main(String[] args) {
		String sentence = "Guitar is my favorite musical instrument.";
		String searchWord = "mus";
		String[] convertedSentence = sentence.split(" ");
		int index = -1;
		
		for(int i = 0; i < convertedSentence.length; i++) {
			if (convertedSentence[i].contains(searchWord)) {
				index = i+1;
			}
		}
		System.out.println("Sentence: "+ sentence);
		System.out.println("Search word: "+ searchWord);
		System.out.println("Index: "+ index);		
	}
}