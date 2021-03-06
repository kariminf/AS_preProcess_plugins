/*
 * AllSumarizer v2
 * This file is part of AllSummarizer project; an implementation of the method
 * described in this paper:
 * http://dx.doi.org/10.1117/12.2004001
 * 
 * Copyright (C) 2013  Abdelkrime Aries <kariminfo0@gmail.com>
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package kariminf.langpi.basic.indonesian;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.lucene.analysis.id.IndonesianAnalyzer;

import kariminf.langpi.basic.SWEliminator;



public class IdSWEliminator implements SWEliminator {

	private List<String> stopList = getStopList("stopwords.txt");
	
	public Boolean isNotStopWord(String word) {
			
		word = word.toLowerCase().trim();
		if (!stopList.contains(word)) //
			return true;

		return false;
	}
	
	private Boolean isStopWord(String word) {
	    word = word.toLowerCase().trim();
	    if (stopList.contains(word)) //a non-word character
			return true;
		
		return false;
	}
	
	public void deleteSW(List<String> wordsList){
		for(int i=wordsList.size()-1; i >=0; i--)
			if (isStopWord(wordsList.get(i)))
				wordsList.remove(i);
	}
	
	private static List<String> getStopList(String path) {
		
		List<String> stopwords = new ArrayList<String>();
	    try {

	    	InputStream in = IndonesianAnalyzer.class.getResourceAsStream(path);
	    	BufferedReader input = new BufferedReader(
		                new InputStreamReader(in));
	      for(String line = input.readLine(); line != null; line = input.readLine()) {
	    	  if (line.startsWith("#")) continue;
	    	  stopwords.add(line);
	      }
	      input.close();

	      return stopwords;
	      
	    } catch(IOException e) {
	      e.printStackTrace();
	      System.exit(1);
	      return null;
	    } 
	  }
	
	
	public static void main(String[] args) {
		List<String> tstList = new ArrayList<String>();
		tstList.add("salah");
		tstList.add("satu");
		tstList.add("penjelasan");
		tstList.add("waktu");
		tstList.add("standar");
		tstList.add("di");
		tstList.add("india");
		tstList.add("muncul");
		tstList.add("pada");
		tstList.add("abad");
		tstList.add("ke");
		tstList.add("4");
		tstList.add("masehi");
		tstList.add("dalam");
		tstList.add("buku");
		tstList.add("astronomi");
		tstList.add("surya");
		tstList.add("siddhanta");
		
		SWEliminator eliminator = new IdSWEliminator();
		eliminator.deleteSW(tstList);
		
		System.out.println(tstList.toString());
		

	}


}
