class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> map=new HashSet<>();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                char num=board[i][j];

                if(num=='.'){
                    continue;
                }
                String row= num + "is row"+ i;
                String clm= num + "is clm" +j;
                String box= num + "is box"+ (i/3) + "-" + (j/3) ;
                if(map.contains(row) ||map.contains(clm)||map.contains(box)){
                    return false;
                }
                else{
                    map.add(row);
                    map.add(clm);
                    map.add(box);
                }
            }
        }return true;
    }
}
