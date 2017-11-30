package com.company;

public class Queen extends Piece {
    int row;
    int column;
    @Override
    boolean isValidMove(Position position) {

        if(!super.isValidMove(position)){
         return false;
        }
        if((position.column == this.column || position.row == this.row)||
        (Math.abs(position.column - this.column) == Math.abs(position.row - this.row))){
            return true;
        }
        else{
            return false;
        }
    }

}
