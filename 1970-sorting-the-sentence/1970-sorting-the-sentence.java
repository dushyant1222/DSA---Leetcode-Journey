class Solution {
    public String sortSentence(String s) {
		String[] words = s.split(" ");
		String[] cache = new String[words.length];
		for (String word : words) {
			int index = word.charAt(word.length() - 1) - '1';
			cache[index] = word.substring(0, word.length() - 1);
		}
		return String.join(" ", cache);
    }
}