package com.akucera.codeadvent.advent21;

import java.util.*;

public class Block {
    private BlockType type;

    Space[][] spaces;

    public Block(BlockType type) {
        this.type = type;
        spaces = new Space[type.getSize()][type.getSize()];
    }

    public BlockType getType() {
        return type;
    }

    public void setType(BlockType type) {
        this.type = type;
    }

    public Space[][] getSpaces() {
        return spaces;
    }

    public void setSpaces(Space[][] spaces) {
        this.spaces = spaces;
    }

    public void setSpaceAt(int i, int j, Space of) {
        spaces[i][j] = of;
    }

    public int countOn() {
        int cnt = 0;
        for (Space[] row : spaces) {
            for (Space space : row) {
                if (space == Space.ON) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    /**
     * 12 21 34 43
     * 34 43 12 21
     * <p>
     * 123 741 987 369 321 147
     * 456 852 654 258 654
     * 789 963 321 147 987
     *
     * @return
     */
    public Set<Block> getVariants() {
        Set<Block> variants = new HashSet<>();
        Block variant = this;
        variant = sym(variant);
        variants.add(variant);
        variant = flip(variant);
        variants.add(variant);
        variant = sym(variant);
        variants.add(variant);
        variant = flip(variant);
        variants.add(variant);
        variant = sym(variant);
        variants.add(variant);
        variant = flip(variant);
        variants.add(variant);
        variant = sym(variant);
        variants.add(variant);
        variant = flip(variant);
        variants.add(variant);

//        Space[][] from = this.spaces;
//        int rotations = 8;
//
//        for (int k = 0; k < rotations; k++) {
//            int rowNum = from.length;
//            int colNum = from[0].length;
//
//            Space[][] temp = new Space[rowNum][colNum];
//            for(int i =0; i<rowNum; i++){
//                for(int j=0; j<colNum; j++){
//
//                    temp[i][j] = from[rowNum-j-1][i];
//                }
//            }
//            Block newBlock = new Block(this.getType());
//            newBlock.setSpaces(temp);
//            variants.add(newBlock);
//            Block flipedBlock = new Block(this.getType());
//            flipedBlock.setSpaces(flipTopDown(temp));
//            variants.add(flipedBlock);
//            Block flipedBlock2 = new Block(this.getType());
//            flipedBlock2.setSpaces(flipLeftRight(temp));
//            variants.add(flipedBlock2);
//            from = temp;
//        }

        return variants;
    }

    public Block sym(Block block) {
        Space[][] matrix = block.getSpaces();
        Space[][] symmetric = new Space[matrix.length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                symmetric[j][i] = matrix[i][j];
            }
        }
        Block newBlock = new Block(block.getType());
        newBlock.setSpaces(symmetric);
        return newBlock;
    }

    public Block flip(Block block) {
        Space[][] matrix = block.getSpaces();
        Space[][] flipped = new Space[matrix.length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                flipped[i][j] = matrix[i][matrix.length - 1 - j];
            }
        }

        Block newBlock = new Block(block.getType());
        newBlock.setSpaces(flipped);
        return newBlock;
    }



//
//    public static Space[][] flipTopDown(Space[][] theArray) {
//        Space[][] newArray = new Space[theArray.length][theArray.length];
//        for(int i = 0; i < (theArray.length / 2); i++) {
//            Space[] temp = theArray[i];
//            newArray[i] = theArray[theArray.length - i - 1];
//            newArray[theArray.length - i - 1] = temp;
//        }
//        return newArray;
//    }
//
//    public static Space[][] flipLeftRight(Space[][] theArray) {
//        Space[][] newArray = new Space[theArray.length][theArray.length];
//        for(int i = 0; i < (theArray.length / 2); i++) {
//            for (int j = 0; j < theArray.length; j++) {
//                Space temp = theArray[j][i];
//                newArray[j][i] = theArray[j][theArray.length - i - 1];
//                newArray[j][theArray.length - i - 1] = temp;
//            }
//        }
//        return newArray;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Block block = (Block) o;
        return block.toString().equals(this.toString());
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < spaces.length; i++) {
            if (i != 0) {
                sb.append("/");
            }
            sb.append(printRow(i));
        }
        return sb.toString();
    }

    public String printRow(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Space s : spaces[i]) {
            if (s == Space.ON) {
                stringBuilder.append("#");
            } else {
                stringBuilder.append(".");
            }
        }
        return stringBuilder.toString();
    }

    public enum Space {
        ON,
        OFF;

        public static Space of(char c) {
            if (c == '.') {
                return OFF;
            } else {
                return ON;
            }
        }
    }

    public enum BlockType {
        TWO(2),
        THREE(3),
        FOUR(4);

        private int size;

        BlockType(int i) {
            size = i;
        }

        public int getSize() {
            return size;
        }
    }
}
