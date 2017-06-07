public class NQueen
{
	class Position{
		int row,col;
		Position(int row,int col)
		{
			this.row = row;
			this.col = col;
		}
	}

	public Position[] solveNqueenProblem(int n){
		Position[] positions = new Position[n];
		boolean hasSolution = solveNqueenProblemUtility(n,0,positions);
		if(hasSolution){
			return positions;
		}else{
			return new Position[0];
		}
	}

	private boolean solveNqueenProblemUtility(int n,int row,Position[] positions){
		if(n == row){
			return true;
		}

		int col;
		for(col = 0; col < n; col++){
			boolean foundSafe = true;

			for(int queen=0; queen < row; queen++){
				if(positions[queen].col==col || positions[queen].row-positions[queen].col==row-col
					|| positions[queen].row==row || positions[queen].row+positions[queen].col==row+col){
					foundSafe = false;
				    break;
				}
			}
			if(foundSafe){
				positions[row] = new Position(row,col);
				if(solveNqueenProblemUtility(n,row+1,positions)){
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String args[]) {
        NQueen s = new NQueen();
        Position[] positions = s.solveNqueenProblem(6);
        Arrays.stream(positions).forEach(position -> System.out.println(position.row + ' ' + position.col));
    }
}