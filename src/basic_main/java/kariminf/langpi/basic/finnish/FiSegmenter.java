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

package kariminf.langpi.basic.finnish;

import java.util.List;

import kariminf.langpi.basic.std.LatinSegmenter;




public class FiSegmenter extends LatinSegmenter {

	public static void main(String[] args) {
		
		FiSegmenter segmenter = new FiSegmenter();
		List<String> sent = segmenter.segmentWords("Yhdysvaltalaisen aikakauslehden Timen toukokuussa 1936 julkaisemassa artikkelissa Catechism for Hitler pohdittiin, mitä Hitler on valmis tekemään saadakseen muilta valtioilta vaatimansa alueet.");
		
		for (String s: sent)
			System.out.println(s);

	}
	
	

}
