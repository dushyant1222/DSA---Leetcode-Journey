class Solution {
    public String restoreString(String s, int[] indices) {
        int n = indices.length;
        char t[] = new char[n];
        for(int i = 0; i < n; i++){
            t[indices[i]] = s.charAt(i);
        }
        return new String(t);
    }
}