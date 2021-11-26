package com.bridgelabz.hashtables;

public class HashMapMain {
	public static void main(String[] args) {

		String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
		MyHashMap<String, Integer> myHashMap = new MyHashMap<String, Integer>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = myHashMap.get(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			myHashMap.add(word, value); 
		}
		int frequency = myHashMap.get("paranoid");
		System.out.println("frequency is of \"paranoid\" is " + frequency);
	}
}
