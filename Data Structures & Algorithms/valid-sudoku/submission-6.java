class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> col = new HashSet<>();
        Set<Character> row = new HashSet<>();
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.'){
                    if(col.contains(board[i][j])) return false;
                        col.add(board[i][j]);
                    }

                    if(board[j][i] != '.'){
                        if(row.contains(board[j][i])) return false;
                            row.add(board[j][i]);
                    }
                col.add(board[i][j]);
                row.add(board[j][i]);
            }
            col = new HashSet<>();
            row = new HashSet<>();
        }
        Set<Character> box = new HashSet<>();
        int iC = 3;
        int iR = 3;
        for(int i = 0; i < 9; i++){
            for(int j = iC - 3; j < iC; j ++){
                for(int k = iR - 3; k < iR; k++){
                    if(board[j][k] == '.') continue;
                    if(box.contains(board[j][k])) return false;
                    box.add(board[j][k]);
                }
            }
            box = new HashSet<>();
            iR += 3;
            if(iR > 9){
                iC += 3;
                iR = 3;
            }
        }
        return true;
    }

}
