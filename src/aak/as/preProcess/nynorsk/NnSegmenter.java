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

package aak.as.preProcess.nynorsk;

import java.util.List;


import aak.as.preProcess.lang.Segmenter;
import aak.as.preProcess.std.LatinSegmenter;


public class NnSegmenter extends LatinSegmenter {
	
	public static void main(String[] args) {
		
		Segmenter segmenter = new NnSegmenter();
		List<String> sent = segmenter.segmentWords("Fitjar kommune består av den nordlege halvdelen av øya Stord og Fitjarøyane, som ligg mellom Stord og Bømlo.");
		
		for (String s: sent)
			System.out.println(s);

	}
	
	

}
