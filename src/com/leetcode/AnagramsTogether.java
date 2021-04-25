package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AnagramsTogether {

	public static void main(String[] args) {
		AnagramsTogether anagramsTogether = new  AnagramsTogether();
		String[] str = {"act","god","cat","dog","tac"};
		anagramsTogether.printAnagramsTogether(str);
	}

	class Word{
		String str;int index;

		public Word(String str, int index) {
			this.str = str;
			this.index = index;
		}

		@Override
		public String toString() {
			return "Word [str=" + str + ", index=" + index + "]";
		}
		
		
		
	}
	
	static class comparatorStr implements Comparator<Word>{

		@Override
		public int compare(Word w1, Word w2) {
			// TODO Auto-generated method stub
			return w1.str.compareTo(w2.str);
		}
		
	}
	private void printAnagramsTogether(String str[]) {
		// TODO Auto-generated method stub
        Word[] warr = new Word[str.length];
        Word[] warrSort = new Word[str.length];
		for(int i=0;i<str.length;i++) {
			warr[i]=new Word(str[i],i);
			char[] c = str[i].toCharArray();
			Arrays.sort(c);
			warrSort[i]=new Word(String.valueOf(c),i);
		}
		Arrays.sort(warrSort,new comparatorStr());
		List<String> li = new ArrayList<>();
		for(int i=0;i<warrSort.length;i++) {
			li.add(warr[warrSort[i].index].str);
		}
		li.forEach(w->System.out.println(w));
	}
}
