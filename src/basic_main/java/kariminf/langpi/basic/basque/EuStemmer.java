
package kariminf.langpi.basic.basque;

import java.util.ArrayList;
import java.util.List;

import org.tartarus.snowball.ext.BasqueStemmer;

import kariminf.langpi.basic.Stemmer;

public class EuStemmer implements Stemmer {
	
	private BasqueStemmer stemmer = new BasqueStemmer();

	@Override
	public List<String> stemListWords(List<String> listWords) {

		List<String> stemmedLW = new ArrayList<String>();
		
		for (String word: listWords)
			stemmedLW.add(stemWord(word));
		
		return stemmedLW;
	}
	
	
	public String stemWord (String word){
		stemmer.setCurrent(word);
		stemmer.stem();
		return stemmer.getCurrent();
	}
	
	public static void main(String[] args) {
		Stemmer Stemmer=new EuStemmer();
		List<String> tstList = new ArrayList<String>();
		tstList.add("bitxia");
		tstList.add("denez");
		tstList.add("left");
		tstList.add("hitzak");
		tstList.add("ere");
		tstList.add("ganorabako");
		tstList.add("edo");
		tstList.add("utzia");
		tstList.add("bezala");
		tstList.add("ere");
		tstList.add("itzuli");
		tstList.add("daiteke");
		tstList.add("right");
		tstList.add("zuzena");
		tstList.add("den");
		tstList.add("bitartean");
	
		tstList = Stemmer.stemListWords(tstList);
		System.out.println(tstList.toString());	

	}
	
	
}





