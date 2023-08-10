class Solution {
    public int titleToNumber(String columnTitle) {
        int column = 0;
        for (int i = columnTitle.length() - 1; i >= 0; i-- ){
            column += (columnTitle.charAt(i) - '@') * Math.pow(26,columnTitle.length() - 1 - i);
        }
        return column;
    }
}
